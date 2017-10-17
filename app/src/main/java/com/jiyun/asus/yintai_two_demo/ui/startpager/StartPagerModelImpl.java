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
    public  void requestNews(Context context, Map<String,String> map, HttpCallback callback){
        HttpRequestFactor factor = new HttpRequestFactorImpl();
        HttpRequest httpRequest = factor.create(RetrofitHttpRequest.class);
        //TODO 不用理解，了解即可
        //获取一个类的父类泛型类型或接口的泛型类型，得到的Type对象，用以解决Gson的泛型擦除问题
//        context.getClass().getGenericSuperclass() 获取一个类的父类
//        context.getClass().getGenericInterfaces() 获取一个类的所以接口
        Type[] genericInterfaces = callback.getClass().getGenericInterfaces();
        Type[] actualTypeArguments=null;
        for (int i = 0; i < genericInterfaces.length; i++) {
            if (genericInterfaces[i] instanceof ParameterizedType){
             actualTypeArguments = ((ParameterizedType) genericInterfaces[i]).getActualTypeArguments();
            }
        }

        Type types =  actualTypeArguments[0];
        httpRequest.post(Concat.URL_NEWS,types,map,callback);
    }
}
