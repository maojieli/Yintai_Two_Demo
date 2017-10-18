package com.jiyun.asus.yintai_two_demo.Fragments.Classification;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import com.jiyun.asus.yintai_two_demo.Beans.ClassBean;
import com.jiyun.asus.yintai_two_demo.Fragments.Classification.Bean.EventBean;
import com.jiyun.asus.yintai_two_demo.Http.Presenter.MyPresenter;
import com.jiyun.asus.yintai_two_demo.Http.View.MyView;
import com.jiyun.asus.yintai_two_demo.Http.tools.BaseParams;
import com.jiyun.asus.yintai_two_demo.Http.tools.Concat;
import com.jiyun.asus.yintai_two_demo.Http.tools.Tools;
import com.jiyun.asus.yintai_two_demo.R;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 当你的才华满足不了你的野心的时候，那么你应该静下心来学习.
 */

public class classificationrightfragment extends Fragment implements MyView<ClassBean> {
    private Context context;
    private MyPresenter presenter;
    private ListView lv_classificationright;
    private List<String> stringList;


    public classificationrightfragment(Context context) {
        this.context=context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.classificationrightfragment, container, false);
        EventBus.getDefault().register(this);
        presenter = new MyPresenter(this);
//        lv_classificationright = view.findViewById(R.id.lv_classificationright);
        stringList = new ArrayList<>();

        return view;
    }

    @Subscribe
    public void getEvent(EventBean bean) {

        int id = bean.getId();
        Map<String, String> httpParams = Tools.getHttpParams(context);
        BaseParams.getParams(httpParams, context);
        httpParams.put("ver", "3.0");
        httpParams.put("method", "products.category.getchildcategory");
        httpParams.put("pageid", "104001");
        httpParams.put("pageindex", "1");
        httpParams.put("categoryid", "" + id);
        Map<String, String> stringStringHashMap = Tools.signBusinessParameter(context, (HashMap<String, String>) httpParams);
        presenter.quest(Concat.NETURL, ClassBean.class, stringStringHashMap);

    }

    @Override
    public void onDestroy() {
        EventBus.getDefault().unregister(this);
        super.onDestroy();
    }

    @Override
    public void success(ClassBean classBean) {
        ClassBean.DataBean data = classBean.getData();


    }

    @Override
    public void defeat(String s) {
        Toast.makeText(context, s, Toast.LENGTH_SHORT).show();
    }
}
