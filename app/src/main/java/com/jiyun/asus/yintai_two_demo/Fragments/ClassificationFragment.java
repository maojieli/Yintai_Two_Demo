package com.jiyun.asus.yintai_two_demo.Fragments;

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
import com.jiyun.asus.yintai_two_demo.R;
import com.jiyun.asus.yintai_two_demo.http.ui.startpager.IView;

import java.util.List;

/**
 * 当你的才华满足不了你的野心的时候，那么你应该静下心来学习.
 */

public class ClassificationFragment extends Fragment  implements IView<ClassLeftBean>{
    private Toolbar tb_classification;
    private ListView lv_classification;
    private FrameLayout fl_classification;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.classfragment, container, false);
        tb_classification = view.findViewById(R.id.tb_classification);
        lv_classification = view.findViewById(R.id.lv_classification);
        fl_classification = view.findViewById(R.id.fl_classification);
        return view;
    }


    @Override
    public void onSuccess(ClassLeftBean classLeftBean) {

    }

    @Override
    public void onFailure(Throwable e) {

    }
}
