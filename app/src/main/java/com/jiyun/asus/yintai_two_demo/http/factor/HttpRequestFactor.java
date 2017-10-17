package com.jiyun.asus.yintai_two_demo.http.factor;

import android.content.Context;

import com.jiyun.asus.yintai_two_demo.http.request.HttpRequest;


/**
 * Created by asus on 2017/10/17.
 */

public abstract class HttpRequestFactor {

    public abstract <T extends HttpRequest> HttpRequest create(Class<T> clz);
    public abstract <T extends HttpRequest> HttpRequest create(Context context, Class<T> clz);
}
