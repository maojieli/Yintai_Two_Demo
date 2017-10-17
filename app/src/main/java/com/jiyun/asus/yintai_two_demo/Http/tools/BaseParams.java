package com.jiyun.asus.yintai_two_demo.Http.tools;

import android.content.Context;

import java.util.Map;

/**
 * Created by Administrator on 2017/9/22.
 */
public class BaseParams {
    public static void getParams(Map<String,String> mParams, Context context){
        mParams.put("yintaisourceId","1090610");
        mParams.put("sourceId","1090610");
        mParams.put("authtype","md5");
        mParams.put("os","android");
        mParams.put("ver","2.0");
        mParams.put("screenwidth",String.valueOf(GetPhonePropertiesUtils.getPhoneWidth(context)));
        mParams.put("screenheight",String.valueOf(GetPhonePropertiesUtils.getPhoneHeigth(context)));
        mParams.put("client_v","4.0.1");
        mParams.put("osversion",GetPhonePropertiesUtils.getPhoneOsversion());
        mParams.put("devicename",GetPhonePropertiesUtils.getPhoneDeviceName());
        mParams.put("carrier",GetPhonePropertiesUtils.getPhoneCarrier(context) );
        mParams.put("imei",GetPhonePropertiesUtils.getPhoneIMEI(context));
        mParams.put("macid",GetPhonePropertiesUtils.getPhoneMacId(context));
        mParams.put("uid","");
        mParams.put("signtype","1");
        mParams.put("apptype","1");
    }
}
