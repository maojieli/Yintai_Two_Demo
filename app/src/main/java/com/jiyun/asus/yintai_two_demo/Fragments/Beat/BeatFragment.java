package com.jiyun.asus.yintai_two_demo.Fragments.Beat;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jiyun.asus.yintai_two_demo.Fragments.Beat.Adapters.BeatfragmentAdapter;
import com.jiyun.asus.yintai_two_demo.Fragments.Beat.BaseFragmentAndSonFragment.BaseFragment;
import com.jiyun.asus.yintai_two_demo.Fragments.Beat.BaseFragmentAndSonFragment.CommendFragment;
import com.jiyun.asus.yintai_two_demo.Fragments.Beat.BaseFragmentAndSonFragment.NewFragment;
import com.jiyun.asus.yintai_two_demo.Fragments.Beat.BaseFragmentAndSonFragment.SaleFragment;
import com.jiyun.asus.yintai_two_demo.OverallActivity;
import com.jiyun.asus.yintai_two_demo.R;
import com.jiyun.asus.yintai_two_demo.Utils.CustomViewPager;

import java.util.ArrayList;
import java.util.List;

/**
 * 当你的才华满足不了你的野心的时候，那么你应该静下心来学习.
 */

public class BeatFragment extends Fragment {
    private Toolbar tb_beat;
    private TabLayout tl_beat;
    private CustomViewPager cvp_beat;
    private OverallActivity activity;
    private Context context;

    public BeatFragment(OverallActivity overallActivity) {
        this.context = overallActivity;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.beatfragment, container, false);
        activity = (OverallActivity) getActivity();
        initView(view);

        return view;
    }

    private void initView(View view) {
        tb_beat = (Toolbar) view.findViewById(R.id.tb_beat);
        tl_beat = (TabLayout) view.findViewById(R.id.tl_beat);
        cvp_beat = (CustomViewPager) view.findViewById(R.id.cvp_beat);
        tb_beat.setTitle("");
        activity.setSupportActionBar(tb_beat);
        tl_beat.setupWithViewPager(cvp_beat);


        List<String> stringList = new ArrayList<>();
        stringList.add("正在进行");
        stringList.add("最后疯抢");
        stringList.add("即将开始");

        List<BaseFragment> fragmentList = new ArrayList<>();
        //正在进行(37)
        CommendFragment fragment = new CommendFragment(context);
        //最后疯抢
        NewFragment newFragment = new NewFragment(context);
         //即将开始(20)
        SaleFragment saleFragment = new SaleFragment(context);
        fragmentList.add(fragment);

        fragmentList.add(newFragment);

        fragmentList.add(saleFragment);
        BeatfragmentAdapter adapter = new BeatfragmentAdapter(activity.getSupportFragmentManager(), stringList, fragmentList);
        cvp_beat.setScanScroll(false);
        cvp_beat.setAdapter(adapter);
    }


}
