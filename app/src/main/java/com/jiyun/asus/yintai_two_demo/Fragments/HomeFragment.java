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


import java.util.HashMap;
import java.util.Map;

/**
 * 当你的才华满足不了你的野心的时候，那么你应该静下心来学习.
 */

public class HomeFragment extends Fragment{
    private Button bt_btn;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.home, container, false);


        return inflate;
    }


}
