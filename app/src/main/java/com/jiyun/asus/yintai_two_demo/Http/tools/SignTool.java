package com.jiyun.asus.yintai_two_demo.Http.tools;

import android.content.Context;
import android.content.SharedPreferences;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * 你的指尖--有改变世界的力量！
 * Created by 牛艺衡 on 2017/10/6.
 */

class SignTool {
    public static String getSign(Map<String, String> paramOther, Map<String, String> parameter, Context context) {
        SharedPreferences mSharedPreferences = context.getSharedPreferences(Concat.PUBLIC_FILE, context.MODE_PRIVATE);
        String appkey = mSharedPreferences.getString("appkey", "");
        String secretkey = mSharedPreferences.getString("secretkey", "");
        YTLog.debugInfo("getSign", appkey + "----" + secretkey);
        TreeMap<String, String> params = new TreeMap<String, String>();
        params.put("APPKEY", appkey);
        params.put("SECRETKEY", secretkey);
        params.put("TIMEREQ", parameter.get("timereq"));
        if (paramOther != null && paramOther.keySet() != null) {
            Iterator<String> iterator = paramOther.keySet().iterator();
            String paramKey = null;
            String paramValue = null;
            while (iterator.hasNext()) {
                paramKey = iterator.next().trim();
                if (paramOther.get(paramKey) != null) {
                    paramValue = paramOther.get(paramKey).trim();
                    paramKey = paramKey.toUpperCase();
                    params.put(paramKey, paramValue);
                }
            }
        }

        YTLog.debugError("params signature === " + params);
        String strSign = md5Signature(params);

        return strSign;
    }


    /**
     * 新的md5签名，首尾放secret。
     *
     */
    public static String md5Signature(TreeMap<String, String> params) {

        String result = null;

        //String orgin1 = "APPKEY=1090200&CONTACT=13353666666&CONTENT=%e5%8c%97%e6%b5%b7&METHOD=products.SaveFeedback&SECRECTKEY=67679E60-73AC-4EE8-A6C4-13F04A70DD3D&TIMEREQ=20130626125801";
        String orgin1 = getSignString(params);
        //          orgin1 = ":/?#[]@!$ &'()*+,;=<>%{}|\\^~";
//        //为了防止特殊字符情况，将需要加密的串用url方式转意一下
//        String newValue = StringUtil.urlEncode(orgin1);
//        if(!StringUtil.isEmpty(newValue)){
//            orgin1 = newValue ;
//        }
        YTLog.debugInfo("Signature", "S1:" + orgin1);
        if (orgin1 == null) {
            return result;
        }
        String orgin2 = new StringBuffer(orgin1).reverse().toString();

        //对位字符异或
        char[] str1 = orgin1.toCharArray();
        char[] str2 = orgin2.toCharArray();
        String finalOrgin = "";
        for (int i = 0; i < str1.length; i++) {
            int str = (int) (str1[i] ^ str2[i]);
            finalOrgin += str;
        }
        try {

            MessageDigest md = MessageDigest.getInstance("MD5");
            result = byte2hex(md.digest(finalOrgin.toString().getBytes("utf-8")));

        } catch (Exception e) {

            throw new RuntimeException("sign error !");

        }

        return result;

    }

    /**
     * 二进制转字符串
     */
    private static String byte2hex(byte[] b) {

        StringBuffer hs = new StringBuffer();

        String stmp = "";

        for (int n = 0; n < b.length; n++) {

            stmp = (Integer.toHexString(b[n] & 0XFF));

            if (stmp.length() == 1) {
                hs.append("0").append(stmp);
            } else {
                hs.append(stmp);
            }

        }

        return hs.toString().toLowerCase();

    }

    /**
     * @param params
     * @return
     */
    private static String getSignString(TreeMap<String, String> params) {
        if (params == null) {
            return null;
        }
        StringBuffer buffer = new StringBuffer();
        Iterator<String> iter = params.keySet().iterator();

        while (iter.hasNext()) {
            String name = (String) iter.next();
            try {
                if (params.get(name) == null || "".equals(params.get(name).trim())) {
                    continue;
                }
                //value数据转码
                String value = StringUtil.removeSpecifyString(params.get(name));
                buffer.append(name + "=" + MyURLEncoder.encode(value, "utf-8") + "&");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        if (buffer.length() != 0) {
            buffer.deleteCharAt(buffer.length() - 1);
        }
        //统一转成大写
        String signString = buffer.toString().toUpperCase();
        return signString;
    }


}
