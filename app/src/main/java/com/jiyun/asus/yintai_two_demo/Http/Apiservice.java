package com.jiyun.asus.yintai_two_demo.Http;

import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Url;
import rx.Observable;


/**
 * 当你的才华满足不了你的野心的时候，那么你应该静下心来学习.
 */

public interface Apiservice {
    @FormUrlEncoded
    @POST
    Observable<ResponseBody> post(@Url String path, @FieldMap Map<String, String> mParams);
}
