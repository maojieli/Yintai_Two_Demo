package com.jiyun.asus.yintai_two_demo.ui.startpager;

import android.content.Context;

import com.google.gson.reflect.TypeToken;
import com.jiyun.asus.yintai_two_demo.concat.Concat;
import com.jiyun.asus.yintai_two_demo.entity.BaseEntity;
import com.jiyun.asus.yintai_two_demo.entity.NewsEntity;
import com.jiyun.asus.yintai_two_demo.http.factor.HttpRequestFactor;
import com.jiyun.asus.yintai_two_demo.http.factor.HttpRequestFactorImpl;
import com.jiyun.asus.yintai_two_demo.http.request.HttpRequest;
import com.jiyun.asus.yintai_two_demo.http.request.RetrofitHttpRequest;
import com.jiyun.asus.yintai_two_demo.interfaces.HttpCallback;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;



/**
 * Created by Administrator on 2017/9/21.
 */
public  class StartPagerModelImpl extends StartPagerModel{


    @Override
    public void requestNews(Context context, Type type, Map<String, String> map, HttpCallback callback) {
        HttpRequestFactor factor = new HttpRequestFactorImpl();
        HttpRequest httpRequest = factor.create(RetrofitHttpRequest.class);
        httpRequest.post(Concat.BASE_URL,type,map,callback);
    }
}
