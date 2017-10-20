package com.jiyun.asus.yintai_two_demo.Fragments.Beat.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.jiyun.asus.yintai_two_demo.Fragments.Beat.BaseFragmentAndSonFragment.BaseFragment;

import java.util.List;

/**
 * 当你的才华满足不了你的野心的时候，那么你应该静下心来学习.
 */

public class BeatfragmentAdapter extends FragmentPagerAdapter {
    private List<String> stringList;
    private List<BaseFragment> fragmentList;

    public BeatfragmentAdapter(FragmentManager fm, List<String> stringList, List<BaseFragment> fragmentList) {
        super(fm);
        this.stringList = stringList;
        this.fragmentList = fragmentList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return stringList.get(position);
    }
}
