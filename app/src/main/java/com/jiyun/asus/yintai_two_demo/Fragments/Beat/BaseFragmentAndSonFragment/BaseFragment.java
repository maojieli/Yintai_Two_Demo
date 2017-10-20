package com.jiyun.asus.yintai_two_demo.Fragments.Beat.BaseFragmentAndSonFragment;

import android.support.v4.app.Fragment;

import com.jiyun.asus.yintai_two_demo.OverallActivity;

/**
 * 当你的才华满足不了你的野心的时候，那么你应该静下心来学习.
 */

public class BaseFragment extends Fragment {



    /*
        *    当页面显示的时候加载数据
        *    当页面不显示的时候不加载数据
        *
        * */
    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {

        if (isVisibleToUser==true) {
            innidata();
        } else {
            uninnidata();
        }
    }

    // 不加载数据
    public void uninnidata() {
    }

    //加载数据
    public void innidata() {
    }
}
