package com.jiyun.asus.yintai_two_demo.http.interfaces;

/**
 * Created by asus on 2017/10/17.
 */

public interface HttpCallback<T> {
    void onSuccess(Object t);
    void onFailure(Throwable e);
}
