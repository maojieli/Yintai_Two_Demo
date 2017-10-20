package com.jiyun.asus.yintai_two_demo.wxapi;

import android.app.Application;

import com.mob.MobSDK;
import com.umeng.socialize.PlatformConfig;

/**
 * Created by lenovo on 2017/6/25.
 */

public class APP extends Application {
    {
        PlatformConfig.setWeixin("wx967daebe835fbeac", "5bb696d9ccd75a38c8a0bfe0675559b3");
        PlatformConfig.setQQZone("100424468", "c7394704798a158208a74ab60104f0ba");
        PlatformConfig.setSinaWeibo("1781047929", "633bc1db8d4bbd98caa8f3e0ace5c147", "http://sns.whalecloud.com");


    }


    protected String a() {
        return null;
    }

    protected String b() {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        MobSDK.init(this, this.a(), this.b());
    }
}
