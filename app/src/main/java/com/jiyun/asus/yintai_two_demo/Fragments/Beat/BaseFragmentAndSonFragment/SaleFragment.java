package com.jiyun.asus.yintai_two_demo.Fragments.Beat.BaseFragmentAndSonFragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.jiyun.asus.yintai_two_demo.R;

/**
 * 当你的才华满足不了你的野心的时候，那么你应该静下心来学习.
 */
//即将开始
public class SaleFragment  extends  BaseFragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.basefragment, container, false);
        ListView lv_beat_base = view.findViewById(R.id.lv_beat_base);
        SwipeRefreshLayout srl_beat_base = view.findViewById(R.id.srl_beat_base);
        return view;
    }
}
