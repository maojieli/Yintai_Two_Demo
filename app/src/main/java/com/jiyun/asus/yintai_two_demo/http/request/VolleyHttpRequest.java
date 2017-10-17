package com.jiyun.asus.yintai_two_demo.http.request;

import android.content.Context;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.google.gson.Gson;
import com.jiyun.asus.yintai_two_demo.http.VolleySettings;
import com.jiyun.asus.yintai_two_demo.http.interfaces.HttpCallback;

import java.lang.reflect.Type;
import java.util.Map;

/**
 * Created by asus on 2017/10/17.
 */

public class VolleyHttpRequest<T> extends HttpRequest<T> {
    private Context context;

    public VolleyHttpRequest(Context context) {
        this.context = context;
    }

    @Override
    public void get(String url, Type type, HttpCallback<T> callback) {

    }

    @Override
    public void post(String url, Type type, Map<String, String> map, HttpCallback<T> callback) {
       post_String(url,type,map,callback);
    }
    public void post_String(String url, final Type type, final Map mMap, final HttpCallback<T> callback) {
        StringRequest request = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Gson gson = new Gson();
                Object t = gson.fromJson(response, type);
                callback.onSuccess((T) t);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                callback.onFailure(error);
            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                return mMap;
            }
        };
        VolleySettings.getInstance(context).add(request);
    }
    public void post_Entity(String url, Type type, Map mMap, HttpCallback callback) {

    }
}
