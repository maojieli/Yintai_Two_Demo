package com.jiyun.asus.yintai_two_demo.ui.startpager;

import android.app.Activity;
import android.content.Context;

/**
 * Created by Administrator on 2017/9/21.
 */
public class StartPagerPresenter {
    private Context context;
    private IView iView;
    private StartPagerModel model;

    public StartPagerPresenter(IView iView) {
        this.iView = iView;
//        model = new StartPagerModelImpl_Volley();
         model = new StartPagerModelImpl();
    }

    public void requestNews(String type){
        //调用Model
        model.requestNews((Activity)iView,type,iView);
    }
}
