package com.jiyun.asus.yintai_two_demo.interfaces;

/**
 * Created by asus on 2017/10/17.
 */

public interface HttpCallback<T> {
    void onSuccess(T t);
    void onFailure(Throwable e);
}
