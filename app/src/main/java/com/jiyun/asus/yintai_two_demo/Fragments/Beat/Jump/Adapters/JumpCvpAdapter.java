package com.jiyun.asus.yintai_two_demo.Fragments.Beat.Jump.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * 我与世界
 * 格格不入
 * <p>
 * 我只与你
 * 惺惺相惜.
 */

public class JumpCvpAdapter extends FragmentPagerAdapter {
    private List<Fragment> fragmentList;
    private List<String> stringList;

    public JumpCvpAdapter(FragmentManager fm, List<Fragment> fragmentList, List<String> stringList) {
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
