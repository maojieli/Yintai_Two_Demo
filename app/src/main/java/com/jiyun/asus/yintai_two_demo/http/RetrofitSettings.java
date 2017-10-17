package com.jiyun.asus.yintai_two_demo.http;

import com.google.gson.Gson;
import com.jiyun.asus.yintai_two_demo.concat.Concat;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by asus on 2017/10/17.
 */

public class RetrofitSettings {
    private static RetrofitSettings settings;
    private Retrofit retrofit;
    private RetrofitSettings(){
        retrofit = new Retrofit.Builder().baseUrl(Concat.BASE_URL).addConverterFactory(GsonConverterFactory.create(new Gson()))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create()).build();

    }
    public static RetrofitSettings getInstance(){
        if(settings==null){
            synchronized (RetrofitSettings.class){
                if(settings==null)
                    settings = new RetrofitSettings();
            }
        }
        return settings;
    }
    public <T> T create(final Class<T> service) {
        return  retrofit.create(service);
    }
}
