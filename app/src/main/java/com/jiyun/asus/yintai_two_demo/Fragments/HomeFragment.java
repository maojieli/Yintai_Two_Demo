package com.jiyun.asus.yintai_two_demo.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.jiyun.asus.yintai_two_demo.R;
import com.jiyun.asus.yintai_two_demo.http.entity.NewsEntity;
import com.jiyun.asus.yintai_two_demo.http.tools.Tools;
import com.jiyun.asus.yintai_two_demo.ui.startpager.IView;
import com.jiyun.asus.yintai_two_demo.ui.startpager.StartPagerPresenter;

import java.util.HashMap;
import java.util.Map;

/**
 * 当你的才华满足不了你的野心的时候，那么你应该静下心来学习.
 */

public class HomeFragment extends Fragment implements View.OnClickListener ,IView{
    private Button bt_btn;
    private StartPagerPresenter startPagerPresenter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.home, container, false);
        startPagerPresenter = new StartPagerPresenter(this,getContext());
        initView(inflate);
        return inflate;
    }

    private void initView(View inflate) {
        bt_btn = (Button) inflate.findViewById(R.id.bt_btn);

        bt_btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_btn:

                Map<String, String> httpParams = Tools.getHttpParams(getContext());
//                BaseParams.getParams(httpParams,context);
                httpParams.put("ver", "3.0");
                httpParams.put("method", "products.template.getpage");
                httpParams.put("pageid", "104001");
                httpParams.put("pageindex", "1");

                HashMap<String, String> stringStringHashMap = Tools.signBusinessParameter(getContext(), (HashMap<String, String>) httpParams);
                startPagerPresenter.requestNews(stringStringHashMap, NewsEntity.class);
                break;
        }
    }

    @Override
    public void onSuccess(Object o) {
        Toast.makeText(getContext(), o.getClass().getName(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onFailure(Throwable e) {
        Toast.makeText(getContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
    }
}
