package com.jiyun.asus.yintai_two_demo.http.tools;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * 你的指尖--有改变世界的力量！
 * Created by 牛艺衡 on 2017/10/6.
 */

public class Tools {
    private static HashMap<String, String> mParams;
    private static DisplayMetrics dm;
    private static String macAddress;
    private static String carrier="";
    private static TelephonyManager telephonyManager;

    /**
     * 初始化公共参数
     *
     * @return
     */
    public static HashMap<String, String> getmParams(Context context) {
        if (mParams == null) synchronized (Tools.class) {
            if (mParams == null) {
                mParams = new HashMap<>();
                mParams.put("client_v", "4.0.5");
                mParams.put("macid", getLocalMacAddress(context));//获取设备的MAC地址
                mParams.put("uid", "");
                mParams.put("authtype", "md5");
                mParams.put("os", "android");
                mParams.put("imei", getImei(context));//获取设备的IMEI值
                mParams.put("ver", "2.0");
                mParams.put("screenwidth", getWidth(context) + "");//获取屏幕宽度
                mParams.put("osversion", getSystemVersion());//获取系统版本
                mParams.put("sourceld", "1090610");
                mParams.put("devicename", getName());//获取设备名
                mParams.put("carrier", getCarrier(context));
                mParams.put("yintaisourceld", "1090610");
                mParams.put("screenheight", getHeight(context) + "");//获取屏幕高度
                mParams.put("apptype", "1");
                mParams.put("signtype", "1");
            }
        }
        mParams.put("timereq", getTime());
        mParams.put("wantype", getAccessNeiworkType(context));
        return mParams;
    }

    /**
     * 初始化Http参数
     *
     * @return
     */
    public static HashMap<String, String> getHttpParams(Context context) {
        HashMap<String, String> mMap = new HashMap<>();
        mMap.putAll(getmParams(context));
        return mMap;
    }

    /**
     * 初始化DisplayMetrics
     *
     * @param context
     */
    private static void initDisplayMetrics(Context context) {
        if (dm == null)
            dm = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        windowManager.getDefaultDisplay().getMetrics(dm);
    }

    /**
     * 获取设备的屏幕宽度(像素)
     *
     * @param context
     * @return
     */
    public static int getWidth(Context context) {
        initDisplayMetrics(context);
        return dm.widthPixels;
    }

    /**
     * 获取设备的屏幕高度(像素)
     *
     * @param context
     * @return
     */
    public static int getHeight(Context context) {
        initDisplayMetrics(context);
        return dm.heightPixels;
    }

    /**
     * 获取系统版本
     *
     * @return
     */
    public static String getSystemVersion() {
        return Build.VERSION.RELEASE;
    }

    /**
     * 获取设备型号
     *
     * @return
     */
    public static String getName() {
        return Build.MODEL;
    }

    /**
     * 获取设备IMEI值
     *
     * @param context
     * @return
     */
    public static String getImei(Context context) {
        if (telephonyManager == null)
            telephonyManager = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
        return telephonyManager.getDeviceId();
    }

    /**
     * 获取设备网络运营商
     *
     * @param context
     * @return
     */
    public static String getCarrier(Context context) {
        if (telephonyManager == null)
            telephonyManager = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
        String imsi = telephonyManager.getSubscriberId();
        if (TextUtils.isEmpty(imsi)) {
            if (imsi.startsWith("46000") || imsi.startsWith("46002")) {
                carrier = "中国移动";
            } else if (imsi.startsWith("46001")) {
                carrier = "中国联通";
            } else if (imsi.startsWith("46003")) {
                carrier = "中国电信";
            }
        }
        return carrier;
    }

    /**
     * 获取设备的MAC地址
     *
     * @param context
     * @return
     */
    public static String getLocalMacAddress(Context context) {
        WifiManager wifi = (WifiManager) context.getSystemService(Context.WIFI_SERVICE);
        if (wifi != null) {
            WifiInfo info = wifi.getConnectionInfo();
            if (info != null) {
                macAddress = info.getMacAddress();
            }
        }
        return macAddress;
    }

    /**
     * 获取设备网络类型
     *
     * @param context
     * @return
     */
    public static String getAccessNeiworkType(Context context) {
        ConnectivityManager connectivity = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        switch (connectivity.getActiveNetworkInfo().getType()) {
            case ConnectivityManager.TYPE_WIFI:
                return "wifi";
            case ConnectivityManager.TYPE_MOBILE:
                return "3G/GPRS";
            case ConnectivityManager.TYPE_VPN:
                return "vpn";
        }
        return "";
    }

    /**
     * 获取系统时间
     *
     * @return
     */
    public static String getTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        return sdf.format(Calendar.getInstance().getTime());
    }

    /**
     * 对业务参数签名
     *
     * @param context
     * @param args
     * @return
     */
    public static HashMap<String, String> signBusinessParameter(Context context, HashMap<String, String> args) {
        try {
            HashMap<String, String> signMap = (HashMap<String, String>) args.clone();
            HashMap<String, String> httpParams = (HashMap<String, String>) getHttpParams(context);
            Iterator<String> iterator = httpParams.keySet().iterator();
            List delList = new ArrayList();
            while (iterator.hasNext()) {
                String defaultkey = iterator.next();
                if (signMap.containsKey(defaultkey)) {
                    delList.add(defaultkey);
                }
            }
            if (delList.size() > 0) {
                signMap.keySet().removeAll(delList);
            }
            String sign = SignTool.getSign(signMap, args, context);
            args.put("sign", sign);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return args;
    }

}
