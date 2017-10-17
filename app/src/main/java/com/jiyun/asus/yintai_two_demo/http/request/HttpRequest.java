package com.jiyun.asus.yintai_two_demo.http.request;

import com.jiyun.asus.yintai_two_demo.http.interfaces.HttpCallback;

import java.lang.reflect.Type;
import java.util.Map;

/**
 * Created by asus on 2017/10/17.
 */

public abstract class HttpRequest<T> {
    public abstract void get(String url, Type type, HttpCallback<T> callback);
    public abstract void post(String url, Type type, Map<String,String> map,HttpCallback<T> callback);
}
