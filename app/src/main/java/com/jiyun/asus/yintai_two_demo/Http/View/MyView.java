package com.jiyun.asus.yintai_two_demo.Http.View;

/**
 * 当你的才华满足不了你的野心的时候，那么你应该静下心来学习.
 */

public interface MyView<T> {
    void success(T t);

    void defeat(String s);
}
