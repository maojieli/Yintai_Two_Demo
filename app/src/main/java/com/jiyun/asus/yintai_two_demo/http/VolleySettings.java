package com.jiyun.asus.yintai_two_demo.http;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by asus on 2017/10/17.
 */

public class VolleySettings {
    private static VolleySettings settings;
    private RequestQueue queue;
    private VolleySettings(Context context){
        queue = Volley.newRequestQueue(context);
    }
    public static VolleySettings getInstance(Context context){
        if(settings==null){
            synchronized (VolleySettings.class){
                if(settings==null)
                    settings = new VolleySettings(context);
            }
        }

        return settings;
    }
    public <T> Request<T> add(Request<T> request) {
        return  queue.add(request);
    }
}
