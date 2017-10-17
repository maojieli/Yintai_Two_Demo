package com.jiyun.asus.yintai_two_demo.ui.startpager;

import android.content.Context;

import com.jiyun.asus.yintai_two_demo.interfaces.HttpCallback;

import java.lang.reflect.Type;
import java.util.Map;


/**
 * Created by Administrator on 2017/9/21.
 */
public abstract class StartPagerModel {
    public abstract void requestNews(Context context, Type type, Map<String,String> map, HttpCallback callback);
}
