package com.jiyun.asus.yintai_two_demo.Fragments.Classification;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;

import com.jiyun.asus.yintai_two_demo.Beans.ClassLeftBean;
import com.jiyun.asus.yintai_two_demo.Fragments.Classification.Adapters.LvAdapter;
import com.jiyun.asus.yintai_two_demo.Fragments.Classification.Bean.EventBean;
import com.jiyun.asus.yintai_two_demo.Http.Presenter.MyPresenter;
import com.jiyun.asus.yintai_two_demo.Http.View.MyView;
import com.jiyun.asus.yintai_two_demo.Http.tools.BaseParams;
import com.jiyun.asus.yintai_two_demo.Http.tools.Concat;
import com.jiyun.asus.yintai_two_demo.Http.tools.Tools;
import com.jiyun.asus.yintai_two_demo.OverallActivity;
import com.jiyun.asus.yintai_two_demo.R;


import org.greenrobot.eventbus.EventBus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 当你的才华满足不了你的野心的时候，那么你应该静下心来学习.
 */

public class ClassificationFragment extends Fragment implements MyView<ClassLeftBean> {
    private Toolbar tb_classification;
    private ListView lv_classification;
    private FrameLayout fl_classification;
    private List<ClassLeftBean.DataBeanX.DataBean> been;
    private LvAdapter adapter;
    private Context context;
    private OverallActivity activity;

    public ClassificationFragment(OverallActivity overallActivity) {
        this.context = overallActivity;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.classfragment, container, false);
        tb_classification = view.findViewById(R.id.tb_classification);
        lv_classification = view.findViewById(R.id.lv_classification);
        fl_classification = view.findViewById(R.id.fl_classification);
        activity = (OverallActivity) getActivity();
        been = new ArrayList<>();
        MyPresenter presenter = new MyPresenter(this);
        Map<String, String> httpParams = Tools.getHttpParams(context);
        BaseParams.getParams(httpParams, context);
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
        httpParams.put("sign", "caee86bb6fabdcfc7a1da855f9932800");
        Map<String, String> stringStringHashMap = Tools.signBusinessParameter(context, (HashMap<String, String>) httpParams);
        //   pagerPresenter.requestNews(stringStringHashMap,ClassLeftBean.class);
        presenter.quest(Concat.NETURL, ClassLeftBean.class, stringStringHashMap);
        adapter = new LvAdapter(been, context);
        lv_classification.setAdapter(adapter);
        lv_classification.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int categoryid = been.get(position).getId();
                EventBus.getDefault().post(new EventBean(categoryid));


                FragmentManager manager = activity.getFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                classificationrightfragment fragment=new classificationrightfragment(context);
                transaction.replace(R.id.fl_classification, fragment);
                transaction.show(fragment);
                transaction.commit();
            }
        });
        return view;
    }


    @Override
    public void success(ClassLeftBean classLeftBean) {
        List<ClassLeftBean.DataBeanX.DataBean> data = classLeftBean.getData().getData();
        been.addAll(data);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void defeat(String s) {

    }
}
