package com.jiyun.asus.yintai_two_demo.http.ui.startpager;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;

import com.jiyun.asus.yintai_two_demo.ui.startpager.*;
import com.jiyun.asus.yintai_two_demo.ui.startpager.IView;
import com.jiyun.asus.yintai_two_demo.ui.startpager.StartPagerModelImpl;

import java.lang.reflect.Type;
import java.util.Map;

/**
 * Created by Administrator on 2017/9/21.
 */
public class StartPagerPresenter {
    private Context context;
    private com.jiyun.asus.yintai_two_demo.ui.startpager.IView iView;
    private com.jiyun.asus.yintai_two_demo.ui.startpager.StartPagerModel model;

    public StartPagerPresenter(IView iView, Context context) {
        this.iView = iView;
        this.context=context;
//        model = new StartPagerModelImpl_Volley();
         model = new StartPagerModelImpl();
    }

    public void requestNews(Map<String,String> map, Type type){
        //调用Model
//        model.requestNews((Fragment) iView,map,iView);
        model.requestNews(context,type,map,iView);
    }
}