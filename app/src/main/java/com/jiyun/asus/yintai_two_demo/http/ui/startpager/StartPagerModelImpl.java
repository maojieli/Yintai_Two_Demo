package com.jiyun.asus.yintai_two_demo.http.ui.startpager;

import android.content.Context;


import com.jiyun.asus.yintai_two_demo.http.factor.HttpRequestFactor;
import com.jiyun.asus.yintai_two_demo.http.factor.HttpRequestFactorImpl;
import com.jiyun.asus.yintai_two_demo.http.request.HttpRequest;
import com.jiyun.asus.yintai_two_demo.http.request.RetrofitHttpRequest;
import com.jiyun.asus.yintai_two_demo.http.interfaces.HttpCallback;
import com.jiyun.asus.yintai_two_demo.http.tools.Concat;

import java.lang.reflect.Type;
import java.util.Map;



/**
 * Created by Administrator on 2017/9/21.
 */
public  class StartPagerModelImpl extends StartPagerModel {


    @Override
    public void requestNews(Context context, Type type, Map<String, String> map, HttpCallback callback) {
        HttpRequestFactor factor = new HttpRequestFactorImpl();
        HttpRequest httpRequest = factor.create(RetrofitHttpRequest.class);
        httpRequest.post(Concat.NETURL,type,map,callback);
    }
}
