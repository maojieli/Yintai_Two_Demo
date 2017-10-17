package com.jiyun.asus.yintai_two_demo.Adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.jiyun.asus.yintai_two_demo.OverallActivity;
import com.jiyun.asus.yintai_two_demo.R;

import java.util.List;

/**
 * 当你的才华满足不了你的野心的时候，那么你应该静下心来学习.
 */

public class OverallAdapter extends FragmentPagerAdapter {
    private List<String> stringList;
    private List<Fragment> fragmentList;
    private Context context;
    private int[] ints;

    public OverallAdapter(FragmentManager fm, List<String> stringList, List<Fragment> fragmentList, int[] ints, OverallActivity overallActivity) {
        super(fm);
        this.stringList = stringList;
        this.fragmentList = fragmentList;
        this.ints = ints;
        this.context = overallActivity;
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

    public View getTabView(int position) {
        View v = LayoutInflater.from(context).inflate(R.layout.buttom_bat_item, null);
        ImageView imageView = (ImageView) v.findViewById(R.id.iv_item);
        TextView textView1 = (TextView) v.findViewById(R.id.tv_item);
        imageView.setBackgroundResource(ints[position]);
        textView1.setText(stringList.get(position));
        if (position == 0) {
            textView1.setTextColor(v.getResources().getColor(R.color.colorAccent));
        }
        return v;
    }
}
