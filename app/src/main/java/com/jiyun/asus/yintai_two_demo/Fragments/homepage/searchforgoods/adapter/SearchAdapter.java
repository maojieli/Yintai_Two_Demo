package com.jiyun.asus.yintai_two_demo.Fragments.homepage.searchforgoods.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.jiyun.asus.yintai_two_demo.Fragments.homepage.searchforgoods.bean.SearchBean;
import com.jiyun.asus.yintai_two_demo.R;

import java.util.ArrayList;

/**
 * Created by asus on 2017/10/18.
 */

public class SearchAdapter extends FragmentPagerAdapter{
    private  ArrayList<String> strings;
    private ArrayList<Fragment> fragments;
    public SearchAdapter(FragmentManager fm, ArrayList<String> strings, ArrayList<Fragment> fragments) {
        super(fm);
        this.strings=strings;
        this.fragments=fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return strings.get(position);
    }
}
