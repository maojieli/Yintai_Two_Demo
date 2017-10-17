package com.jiyun.asus.yintai_two_demo.apis;
import java.util.Map;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Path;


/**
 * Created by asus on 2017/10/17.
 */

public interface ApisService {
    @FormUrlEncoded
    @POST("{path}")
    Observable<ResponseBody> post(@Path("path") String path, @FieldMap Map<String, String> mParams);
}
