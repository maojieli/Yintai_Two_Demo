package com.jiyun.asus.yintai_two_demo.Fragments.homepage;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bartoszlipinski.recyclerviewheader.RecyclerViewHeader;
import com.jiyun.asus.yintai_two_demo.Fragments.homepage.adapter.HomeAdapter;
import com.jiyun.asus.yintai_two_demo.Fragments.homepage.bean.HomeBean;
import com.jiyun.asus.yintai_two_demo.Fragments.homepage.searchforgoods.SearchActivity;
import com.jiyun.asus.yintai_two_demo.Http.Presenter.MyPresenter;
import com.jiyun.asus.yintai_two_demo.Http.View.MyView;
import com.jiyun.asus.yintai_two_demo.Http.tools.BaseParams;
import com.jiyun.asus.yintai_two_demo.Http.tools.Concat;
import com.jiyun.asus.yintai_two_demo.Http.tools.Tools;
import com.jiyun.asus.yintai_two_demo.R;
import com.recker.flybanner.FlyBanner;
import com.uuzuche.lib_zxing.activity.CaptureActivity;
import com.uuzuche.lib_zxing.activity.CodeUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 当你的才华满足不了你的野心的时候，那么你应该静下心来学习.
 */

public class HomeFragment extends Fragment implements MyView<HomeBean>, View.OnClickListener {

    private ArrayList<HomeBean.DataBean.TemplatelistBean> BeanArrayList;
    private ImageView imageView;
    private TextView textView;
    private RelativeLayout rl;
    private ImageView iv_new2;
    private ImageView iv_scan;
    private RecyclerView rv_title;
    private ArrayList<String> image;
    private FlyBanner fb_title;
    private HomeAdapter homeAdapter;
    private MyPresenter myPresenter;
    private RelativeLayout relativeLayout1;
    private SwipeRefreshLayout swr;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.home, container, false);
        initView(inflate);
        myPresenter = new MyPresenter(this);
        Map<String, String> httpParams = Tools.getHttpParams(getContext());
        BaseParams.getParams(httpParams, getContext());
        httpParams.put("ver", "3.0");
        httpParams.put("method", "products.template.getpage");
        httpParams.put("pageid", "104001");
        httpParams.put("pageindex", "1");

        HashMap<String, String> stringStringHashMap = Tools.signBusinessParameter(getContext(), (HashMap<String, String>) httpParams);
        myPresenter.quest(Concat.NETURL, HomeBean.class, stringStringHashMap);
        BeanArrayList = new ArrayList<>();

        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL);
        rv_title.setLayoutManager(staggeredGridLayoutManager);
        homeAdapter = new HomeAdapter(BeanArrayList);
        rv_title.setAdapter(homeAdapter);
        RecyclerViewHeader recyclerViewHeader = RecyclerViewHeader.fromXml(getActivity(), R.layout.header_main);
        fb_title = recyclerViewHeader.findViewById(R.id.fb_title);
        recyclerViewHeader.attachTo(rv_title);
        swr.setColorSchemeResources(R.color.colorAccent,R.color.colorPrimary,R.color.colorPrimaryDark);
        swr.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                swr.setRefreshing(true);
                Map<String, String> httpParams = Tools.getHttpParams(getContext());
                BaseParams.getParams(httpParams, getContext());
                httpParams.put("ver", "3.0");
                httpParams.put("method", "products.template.getpage");
                httpParams.put("pageid", "104001");
                httpParams.put("pageindex", "2");

                HashMap<String, String> stringStringHashMap = Tools.signBusinessParameter(getContext(), (HashMap<String, String>) httpParams);
                myPresenter.quest(Concat.NETURL, HomeBean.class, stringStringHashMap);
                swr.setRefreshing(false);
            }
        });


        return inflate;
    }


    @Override
    public void success(HomeBean homeBean) {
        image = new ArrayList<>();
        List<HomeBean.DataBean.BannerlistBean> list = homeBean.getData().getBannerlist();
        Log.e("TAGBEANS", homeBean.toString());
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i).getImgurl();
            image.add(s);
            Log.e("TAG", list.get(i) + "");
        }
        fb_title.setImagesUrl(image);
        List<HomeBean.DataBean.TemplatelistBean> template = homeBean.getData().getTemplatelist();
        BeanArrayList.addAll(template);
        homeAdapter.notifyDataSetChanged();
    }

    @Override
    public void defeat(String s) {
        Toast.makeText(getContext(), s, Toast.LENGTH_SHORT).show();
    }

    private void initView(View inflate) {
        imageView = (ImageView) inflate.findViewById(R.id.imageView);
        textView = (TextView) inflate.findViewById(R.id.textView);
        rl = (RelativeLayout) inflate.findViewById(R.id.rl);
        iv_new2 = (ImageView) inflate.findViewById(R.id.iv_new2);
        iv_scan = (ImageView) inflate.findViewById(R.id.iv_scan);
        rv_title = (RecyclerView) inflate.findViewById(R.id.rv_title);
        iv_scan.setOnClickListener(this);
        rl.setOnClickListener(this);
        relativeLayout1 = (RelativeLayout) inflate.findViewById(R.id.relativeLayout1);
        relativeLayout1.setOnClickListener(this);
        swr = (SwipeRefreshLayout) inflate.findViewById(R.id.swr);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_scan:
                Intent intent = new Intent(getActivity(), CaptureActivity.class);
                startActivityForResult(intent, 0);
                break;
            case R.id.rl:
                startActivity(new Intent(getActivity(), SearchActivity.class));
                break;
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        /**
         * 处理二维码扫描结果
         */
        if (requestCode == 0) {
            //处理扫描结果（在界面上显示）
            if (null != data) {
                Bundle bundle = data.getExtras();
                if (bundle == null) {
                    return;
                }
                if (bundle.getInt(CodeUtils.RESULT_TYPE) == CodeUtils.RESULT_SUCCESS) {
                    String result = bundle.getString(CodeUtils.RESULT_STRING);
                    Toast.makeText(getContext(), "解析结果:" + result, Toast.LENGTH_LONG).show();
                } else if (bundle.getInt(CodeUtils.RESULT_TYPE) == CodeUtils.RESULT_FAILED) {
                    Toast.makeText(getContext(), "解析二维码失败", Toast.LENGTH_LONG).show();
                }
            }
        }
    }
}
