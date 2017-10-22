package com.jiyun.asus.yintai_two_demo.Fragments.homepage;

import android.app.Application;
import java.util.LinkedList;
import java.util.List;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.DialogInterface;
import android.content.Intent;
/**
 * Created by asus on 2017/10/21.
 */

public class SysApplication extends Application {

    private List<Activity> activityList=new LinkedList<Activity>();

    private static SysApplication instance;

    private SysApplication()
    {
    }
    //单例模式中获取唯一的ExitApplication 实例
    public static SysApplication getInstance()
    {
        if(null == instance)
        {
            instance = new SysApplication();
        }
        return instance;

    }
    //添加Activity 到容器中
    public void addActivity(Activity activity)
    {
        activityList.add(activity);
    }
    //遍历所有Activity 并finish

    public void exit()
    {

        for(Activity activity:activityList)
        {
            activity.finish();
        }

        System.exit(0);

    }
}