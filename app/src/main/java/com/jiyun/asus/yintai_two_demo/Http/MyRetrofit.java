package com.jiyun.asus.yintai_two_demo.Http;


import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * 当你的才华满足不了你的野心的时候，那么你应该静下心来学习.
 */

public class MyRetrofit {
    private static MyRetrofit retrofitSettings;
    private Retrofit retrofit;

    private MyRetrofit(){
        retrofit = new Retrofit.Builder()
                .baseUrl("http://www.baidu.com")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create()
                ).build();


    }
    public static MyRetrofit getInstance(){
        if(retrofitSettings==null){
            synchronized (MyRetrofit.class){
                if(retrofitSettings==null){
                    retrofitSettings = new MyRetrofit();
                }
            }

        }
        return retrofitSettings;
    }
   public <T> T create(final Class<T> service) {
        return  retrofit.create(service);
    }

}
