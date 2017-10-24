package com.jiyun.asus.yintai_two_demo.Http.Presenter;


import com.jiyun.asus.yintai_two_demo.Http.Model.MyMoDelImp;
import com.jiyun.asus.yintai_two_demo.Http.Model.MyModel;
import com.jiyun.asus.yintai_two_demo.Http.View.MyView;

import java.util.Map;

/**
 * 当你的才华满足不了你的野心的时候，那么你应该静下心来学习.
 */

public class MyPresenter {
    private MyModel myModel;
    private MyView view;


    public MyPresenter(MyView view) {
        this.view = view;
        myModel = new MyMoDelImp();
    }

    public void quest( Map<String, String> map) {
        myModel.post(map,view);

    }
}
