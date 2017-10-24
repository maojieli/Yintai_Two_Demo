package com.jiyun.asus.yintai_two_demo.Http.Model;

import java.lang.reflect.Type;
import java.util.Map;

/**
 * 当你的才华满足不了你的野心的时候，那么你应该静下心来学习.
 */

public interface MyModel {
    void post(Map<String, String> map, CallBack callBack);

    interface CallBack<T> {
        void success(T t);

        void deteat(String s);
    }

}
