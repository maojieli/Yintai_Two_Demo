package com.jiyun.asus.yintai_two_demo.http;

import com.google.gson.Gson;
import com.jiyun.asus.yintai_two_demo.concat.Concat;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
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

        OkHttpClient.Builder httpClientBuilder = new OkHttpClient.Builder();
        httpClientBuilder.connectTimeout(3000, TimeUnit.SECONDS);

        httpClientBuilder.addInterceptor(new Interceptor() {
            @Override
            public okhttp3.Response intercept(Chain chain) throws IOException {
                Request request = chain.request();
                okhttp3.Response originalResponse = chain.proceed(request);
                return originalResponse.newBuilder().header("key1", "value1").addHeader("key2", "value2").build();
            }
        });
        retrofit = new Retrofit.Builder().client(httpClientBuilder.build()).baseUrl("http://www.baidu.com").addConverterFactory(GsonConverterFactory.create(new Gson()))
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
