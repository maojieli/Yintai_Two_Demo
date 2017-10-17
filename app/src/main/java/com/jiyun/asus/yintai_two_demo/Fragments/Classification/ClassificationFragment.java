package com.jiyun.asus.yintai_two_demo.Fragments.Classification;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ListView;

import com.jiyun.asus.yintai_two_demo.Beans.ClassLeftBean;
import com.jiyun.asus.yintai_two_demo.Fragments.Classification.Adapters.LvAdapter;
import com.jiyun.asus.yintai_two_demo.R;
import com.jiyun.asus.yintai_two_demo.http.tools.BaseParams;
import com.jiyun.asus.yintai_two_demo.http.tools.Tools;
import com.jiyun.asus.yintai_two_demo.http.ui.startpager.IView;
import com.jiyun.asus.yintai_two_demo.http.ui.startpager.StartPagerPresenter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 当你的才华满足不了你的野心的时候，那么你应该静下心来学习.
 */

public class ClassificationFragment extends Fragment implements IView<ClassLeftBean> {
    private Toolbar tb_classification;
    private ListView lv_classification;
    private FrameLayout fl_classification;
    private List<ClassLeftBean.DataBeanX.DataBean> been;
    private LvAdapter adapter;
    private Context context;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.classfragment, container, false);
        tb_classification = view.findViewById(R.id.tb_classification);
        lv_classification = view.findViewById(R.id.lv_classification);
        fl_classification = view.findViewById(R.id.fl_classification);
        been = new ArrayList<>();
        StartPagerPresenter pagerPresenter=new StartPagerPresenter(this,context);
        Map<String, String> httpParams = Tools.getHttpParams(context);
        BaseParams.getParams(httpParams,context);
        httpParams.put("ver", "3.0");
        //分类左侧
        //"method" -> "products.category.getcategory"
        //分类右侧
        //  httpParams.put("method", "products.category.getchildcategory");

        httpParams.put("method", "products.category.getcategory");
        httpParams.put("pageid", "104001");
        httpParams.put("pageindex", "1");
        // add("categoryid","88")
        //httpParams.put("categoryid","88");
        //"sign" -> "caee86bb6fabdcfc7a1da855f9932800"
        httpParams.put("sign","caee86bb6fabdcfc7a1da855f9932800");
        HashMap<String, String> stringStringHashMap = Tools.signBusinessParameter(context, (HashMap<String, String>) httpParams);
        pagerPresenter.requestNews(stringStringHashMap,ClassLeftBean.class);

        adapter = new LvAdapter(been,context);
        lv_classification.setAdapter(adapter);
        return view;
    }


    @Override
    public void onSuccess(ClassLeftBean classLeftBean) {
        List<ClassLeftBean.DataBeanX.DataBean> data = classLeftBean.getData().getData();
        been.addAll(data);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void onFailure(Throwable e) {

    }
}
