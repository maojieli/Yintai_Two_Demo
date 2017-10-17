package com.jiyun.asus.yintai_two_demo.http.apis;
import java.util.Map;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Url;


/**
 * Created by asus on 2017/10/17.
 */

public interface ApisService {
    @FormUrlEncoded
    @POST
    Observable<ResponseBody> post(@Url String path, @FieldMap Map<String, String> mParams);
}
