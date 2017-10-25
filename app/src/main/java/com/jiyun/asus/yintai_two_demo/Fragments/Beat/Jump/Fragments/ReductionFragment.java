package com.jiyun.asus.yintai_two_demo.Fragments.Beat.Jump.Fragments;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListView;
import android.widget.Toast;

import com.jiyun.asus.yintai_two_demo.Fragments.Beat.BeatBean.MeiZhuangBean;
import com.jiyun.asus.yintai_two_demo.Fragments.Beat.Jump.Adapters.JumpLvAdapter;
import com.jiyun.asus.yintai_two_demo.Fragments.Beat.Jump.JumpBeatActivity;
import com.jiyun.asus.yintai_two_demo.Http.Presenter.MyPresenter;
import com.jiyun.asus.yintai_two_demo.Http.View.MyView;
import com.jiyun.asus.yintai_two_demo.Http.tools.BaseParams;
import com.jiyun.asus.yintai_two_demo.Http.tools.Tools;
import com.jiyun.asus.yintai_two_demo.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 我与世界
 * 格格不入
 * <p>
 * 我只与你
 * 惺惺相惜.
 */
//折扣
public class ReductionFragment extends Fragment implements MyView<MeiZhuangBean>, AbsListView.OnScrollListener {
    private Context context;
    private ListView lv_jump_fragment;

    private List<MeiZhuangBean.DataBean.ProductListBean> beanList;
    private JumpLvAdapter adapter;
    private int total_index;
    private int last_index;
    private int PAGENUM = 1;

    public ReductionFragment(JumpBeatActivity jumpBeatActivity) {
        this.context = jumpBeatActivity;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.jumpfragment, container, false);
        initView(view);
        jiazai(PAGENUM);

        beanList = new ArrayList<>();
        adapter = new JumpLvAdapter(context, beanList);
        lv_jump_fragment.setAdapter(adapter);
        lv_jump_fragment.setOnScrollListener(this);
        return view;
    }

    private void jiazai(int page) {
        int id = getArguments().getInt("id");
        String STRING = getArguments().getString("order_type");
        MyPresenter presenter = new MyPresenter(this);
        Map<String, String> httpParams = Tools.getHttpParams(context);
        BaseParams.getParams(httpParams, context);
        httpParams.put("ver", "3.0");
        httpParams.put("method", "products.getlimitlist");
        httpParams.put("displaycount", "12");
        httpParams.put("page_index", PAGENUM + "");
        httpParams.put("order_type", STRING);
        httpParams.put("query_string", "");

        httpParams.put("bargainid", id + "");
        Map<String, String> stringStringHashMap = Tools.signBusinessParameter(context, (HashMap<String, String>) httpParams);
        presenter.quest(stringStringHashMap);
    }

    @Override
    public void success(MeiZhuangBean meiZhuangBean) {
        List<MeiZhuangBean.DataBean.ProductListBean> product_list = meiZhuangBean.getData().getProduct_list();

        beanList.addAll(product_list);

        adapter.notifyDataSetChanged();
    }

    @Override
    public void deteat(String s) {
        Toast.makeText(context, s, Toast.LENGTH_SHORT).show();
    }

    private void initView(View view) {
        lv_jump_fragment = (ListView) view.findViewById(R.id.lv_jump_fragment);
    }

    @Override
    public void onScrollStateChanged(AbsListView view, int scrollState) {

        if (last_index == total_index && (scrollState == AbsListView.OnScrollListener.SCROLL_STATE_IDLE)) {

            if (PAGENUM++ <= 5) {
                jiazai(PAGENUM++);
            } else {
                Toast.makeText(context, "已经到底了", Toast.LENGTH_SHORT).show();

            }
        }
    }

    @Override
    public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
        last_index = firstVisibleItem + visibleItemCount;
        total_index = totalItemCount;
    }
}
