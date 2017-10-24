package com.jiyun.asus.yintai_two_demo.Fragments.Classification;

import android.app.Fragment;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.jiyun.asus.yintai_two_demo.Beans.ClassBean;

import com.jiyun.asus.yintai_two_demo.Fragments.Classification.Adapters.RvRightAdapter;
import com.jiyun.asus.yintai_two_demo.Fragments.Classification.Bean.EventBean;
import com.jiyun.asus.yintai_two_demo.Http.Presenter.MyPresenter;
import com.jiyun.asus.yintai_two_demo.Http.View.MyView;
import com.jiyun.asus.yintai_two_demo.Http.tools.BaseParams;
import com.jiyun.asus.yintai_two_demo.Http.tools.Concat;
import com.jiyun.asus.yintai_two_demo.Http.tools.Tools;
import com.jiyun.asus.yintai_two_demo.R;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

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
    private RecyclerView rv_classificationright;

    private List<String> BigstringList;
    private List<ClassBean.DataBean.RecommendBean.CategoryrecommendBean> categoryrecommendBeanList;
    private List<ClassBean.DataBean.BrandBean.BrandrecommendBean> brandrecommendBeanList;
    private List<ClassBean.DataBean.MoreBean.MorerecommendBean> morerecommendBeanList;
    private RvRightAdapter adapter;


    public classificationrightfragment(Context context) {
        this.context = context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        EventBus.getDefault().register(this);
        View view = inflater.inflate(R.layout.classificationrightfragment, container, false);
        presenter = new MyPresenter(this);
        rv_classificationright = view.findViewById(R.id.rv_classificationright);
        LinearLayoutManager manager = new LinearLayoutManager(context);
        rv_classificationright.setLayoutManager(manager);

        BigstringList = new ArrayList<>();
        categoryrecommendBeanList = new ArrayList<>();
        brandrecommendBeanList = new ArrayList<>();
        morerecommendBeanList = new ArrayList<>();
        adapter = new RvRightAdapter(BigstringList, brandrecommendBeanList, categoryrecommendBeanList, morerecommendBeanList, context);
        rv_classificationright.setAdapter(adapter);
        return view;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
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
        presenter.quest(stringStringHashMap);

    }

    @Override
    public void success(ClassBean classBean) {
        ClassBean.DataBean.BrandBean brand = classBean.getData().getBrand();
        String name = brand.getName();
        List<ClassBean.DataBean.BrandBean.BrandrecommendBean> brandrecommend = brand.getBrandrecommend();
        ClassBean.DataBean.RecommendBean recommend = classBean.getData().getRecommend();
        String name1 = recommend.getName();
        List<ClassBean.DataBean.RecommendBean.CategoryrecommendBean> categoryrecommend = recommend.getCategoryrecommend();
        ClassBean.DataBean.MoreBean more = classBean.getData().getMore();
        String name2 = more.getName();
        List<ClassBean.DataBean.MoreBean.MorerecommendBean> morerecommend = more.getMorerecommend();
        List<String> stringList = new ArrayList<>();
        stringList.add(name1);
        stringList.add(name);
        stringList.add(name2);

        BigstringList.addAll(stringList);
        categoryrecommendBeanList.addAll(categoryrecommend);
        morerecommendBeanList.addAll(morerecommend);
        brandrecommendBeanList.addAll(brandrecommend);
        adapter.notifyDataSetChanged();

    }

    @Override
    public void deteat(String s) {
        Toast.makeText(context, s, Toast.LENGTH_SHORT).show();
    }



    @Override
    public void onDestroy() {

        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }


}
