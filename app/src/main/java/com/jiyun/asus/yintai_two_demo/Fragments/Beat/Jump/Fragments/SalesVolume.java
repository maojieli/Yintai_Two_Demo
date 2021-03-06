package com.jiyun.asus.yintai_two_demo.Fragments.Beat.Jump.Fragments;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.jiyun.asus.yintai_two_demo.Fragments.Beat.BaseFragmentAndSonFragment.BaseFragment;
import com.jiyun.asus.yintai_two_demo.Fragments.Beat.BeatBean.MeiZhuangBean;
import com.jiyun.asus.yintai_two_demo.Fragments.Beat.Jump.Adapters.JumpLvAdapter;
import com.jiyun.asus.yintai_two_demo.Fragments.Beat.Jump.Beans.JumpEventBean;
import com.jiyun.asus.yintai_two_demo.Fragments.Beat.Jump.CommodityDetailsActivity;
import com.jiyun.asus.yintai_two_demo.Fragments.Beat.Jump.JumpBeatActivity;
import com.jiyun.asus.yintai_two_demo.Http.Presenter.MyPresenter;
import com.jiyun.asus.yintai_two_demo.Http.View.MyView;
import com.jiyun.asus.yintai_two_demo.Http.tools.BaseParams;
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
 * 我与世界
 * 格格不入
 * <p>
 * 我只与你
 * 惺惺相惜.
 */

public class SalesVolume extends Fragment implements MyView<MeiZhuangBean>, AbsListView.OnScrollListener {
    private Context context;

    private int PAGENUM = 1;
    private List<MeiZhuangBean.DataBean.ProductListBean> beanList;
    private JumpLvAdapter adapter;
    private ListView lv_jump_fragment;
    private int last_index;
    private int total_index;
    private int index;

    public SalesVolume(JumpBeatActivity jumpBeatActivity) {
        this.context = jumpBeatActivity;
    }


    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        index = (int) getArguments().get("id");
        View view = inflater.inflate(R.layout.jumpfragment, container, false);

        initView(view);

        jiazai(PAGENUM);
        beanList = new ArrayList<>();
        adapter = new JumpLvAdapter(context, beanList);
        lv_jump_fragment.setAdapter(adapter);
        lv_jump_fragment.setOnScrollListener(this);
        lv_jump_fragment.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String itemcode = beanList.get(position).getItemcode();
                Intent intent = new Intent(context, CommodityDetailsActivity.class);
                intent.putExtra("itemcode", itemcode);
                intent.putExtra("tag", 2);
                intent.putExtra("index", index);
                context.startActivity(intent);
            }
        });
        return view;

    }

    private void jiazai(int pagenum) {

        MyPresenter presenter = new MyPresenter(this);
        Map<String, String> httpParams = Tools.getHttpParams(context);
        BaseParams.getParams(httpParams, context);
        httpParams.put("ver", "3.0");
        httpParams.put("method", "products.getlimitlist");
        httpParams.put("displaycount", "12");
        httpParams.put("page_index", PAGENUM + "");
        httpParams.put("order_type", "5");
        httpParams.put("query_string", "");

        httpParams.put("bargainid", index + "");
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
