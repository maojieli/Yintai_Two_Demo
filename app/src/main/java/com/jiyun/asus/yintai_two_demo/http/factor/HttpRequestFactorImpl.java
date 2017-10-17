package com.jiyun.asus.yintai_two_demo.http.factor;

import android.content.Context;

import com.jiyun.asus.yintai_two_demo.http.request.HttpRequest;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by asus on 2017/10/17.
 */

public class HttpRequestFactorImpl extends HttpRequestFactor {
    @Override
    public <T extends HttpRequest> HttpRequest create(Class<T> clz) {
        try {
            HttpRequest o = (HttpRequest) Class.forName(clz.getName()).newInstance();
            return o;
        } catch (InstantiationException e) {
            e.printStackTrace();
            return null;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public <T extends HttpRequest> HttpRequest create(Context context, Class<T> clz) {
        try {
            Class<?> aClass = Class.forName(clz.getName());
            try {
                Constructor<?> constructor = aClass.getConstructor(Context.class);
                try {
                    HttpRequest o = (HttpRequest) constructor.newInstance(context);
                    return o;
                } catch (InstantiationException e) {
                    e.printStackTrace();
                    return null;
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                    return null;
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                    return null;
                }
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
                return null;
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
