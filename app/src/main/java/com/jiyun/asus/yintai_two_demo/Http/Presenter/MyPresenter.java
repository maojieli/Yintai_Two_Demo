package com.jiyun.asus.yintai_two_demo.Http.Presenter;


import com.jiyun.asus.yintai_two_demo.Http.Model.MyMoDelImp;
import com.jiyun.asus.yintai_two_demo.Http.Model.MyModel;
import com.jiyun.asus.yintai_two_demo.Http.View.MyView;

import java.lang.reflect.Type;
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

    public void quest(String url,Type type, Map<String, String> map) {

/*add("client_v","4.0.5")
.add("macid",getLocalMacAddress(cs.this))
.add("uid","")
.add("authtype","md5")
.add("os","android")
.add("timereq",getSystemTime())
.add("wantype",getAccessNeiworkType(cs.this))
.add("imei",getIMEI(cs.this))
.add("ver","3.0")
.add("screenwidth", getScreenSize(cs.this)[0]+"")
.add("osversion",getSystemVersion())
.add("sourceld","1090610")
.add("devicename",getSystemModel())
.add("method","products.category.getchildcategory")
.add("carrier","")
.add("yintaisourceld","1090610")
.add("screenheight",getScreenSize(cs.this)[1]+"")
.add("apptype","1")
.add("signtype","1")
.add("categoryid","88")
* */
     myModel.post(url, type, map, new MyModel.CallBack() {
         @Override
         public void success(Object o) {
             view.success(o);
         }

         @Override
         public void deteat(String s) {
               view.defeat(s);
         }
     });
    }
}
