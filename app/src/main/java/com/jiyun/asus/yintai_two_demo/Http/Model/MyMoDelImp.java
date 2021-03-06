package com.jiyun.asus.yintai_two_demo.Http.Model;

import com.google.gson.Gson;
import com.jiyun.asus.yintai_two_demo.Http.Apiservice;
import com.jiyun.asus.yintai_two_demo.Http.MyRetrofit;
import com.jiyun.asus.yintai_two_demo.Http.tools.Concat;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

import static android.R.attr.type;

/**
 * 当你的才华满足不了你的野心的时候，那么你应该静下心来学习.
 */

public class MyMoDelImp implements MyModel {
    @Override
    public void post( Map<String, String> map, final CallBack callBack) {

        Apiservice apiservice = MyRetrofit.getInstance().create(Apiservice.class);
        //创建的这个对象就是RxJava的被观察者
        Observable<ResponseBody> post = apiservice.post(Concat.NETURL, map);
        post
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<ResponseBody>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                        callBack.deteat(e.toString());
                    }

                    @Override
                    public void onNext(ResponseBody responseBody) {
                        try {
                            String string = responseBody.string();
                            Type[] genericInterfaces = callBack.getClass().getGenericInterfaces();
                            Type[] actualTypeArguments = ((ParameterizedType) genericInterfaces[0]).getActualTypeArguments();
                            Type actualTypeArgument = actualTypeArguments[0];
                            Gson gson = new Gson();

                            Object o = gson.fromJson(string, actualTypeArgument);
                            callBack.success(o);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                    }
                });
    }
}
