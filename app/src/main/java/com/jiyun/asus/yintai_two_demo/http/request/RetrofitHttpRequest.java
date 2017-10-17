package com.jiyun.asus.yintai_two_demo.http.request;

import android.util.Log;

import com.google.gson.Gson;
import com.jiyun.asus.yintai_two_demo.http.apis.ApisService;
import com.jiyun.asus.yintai_two_demo.http.RetrofitSettings;
import com.jiyun.asus.yintai_two_demo.http.interfaces.HttpCallback;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import okhttp3.ResponseBody;

/**
 * Created by asus on 2017/10/17.
 */

public class RetrofitHttpRequest<T> extends HttpRequest<T> {
    @Override
    public void get(String url, Type type, HttpCallback<T> callback) {

    }

    @Override
    public void post(String url, final Type type, Map<String, String> map, final HttpCallback<T> callback) {
        ApisService apisService = RetrofitSettings.getInstance().create(ApisService.class);
        Observable<ResponseBody> post = apisService.post(url, map);
        post.subscribeOn(Schedulers.io()).unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ResponseBody>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull ResponseBody responseBody) {
                        try {
                            String string = responseBody.string();
                            Log.e("TAG",string);
                            Gson gson = new Gson();
                            Object o = gson.fromJson(string, type);
                            callback.onSuccess((T) o);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        callback.onFailure(e);
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
