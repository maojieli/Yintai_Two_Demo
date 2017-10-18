package com.jiyun.asus.yintai_two_demo;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.jiyun.asus.yintai_two_demo.Adapters.OverallAdapter;
import com.jiyun.asus.yintai_two_demo.Fragments.BeatFragment;
import com.jiyun.asus.yintai_two_demo.Fragments.CatFragment;
import com.jiyun.asus.yintai_two_demo.Fragments.Classification.ClassificationFragment;
import com.jiyun.asus.yintai_two_demo.Fragments.homepage.HomeFragment;
import com.jiyun.asus.yintai_two_demo.Fragments.MyFragment;
import com.jiyun.asus.yintai_two_demo.Utils.CustomViewPager;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class OverallActivity extends AppCompatActivity {

    @Bind(R.id.tb_overall)
    TabLayout tbOverall;
    @Bind(R.id.cvp_overall)
    CustomViewPager cvpOverall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overall);
        ButterKnife.bind(this);

        cvpOverall.setScanScroll(false);
        List<String> stringList = new ArrayList<>();
        stringList.add("首页");
        stringList.add("抢先");
        stringList.add("分类");
        stringList.add("购物车");
        stringList.add("我的银泰");
        int[] ints = {
                R.drawable.hometab_home_pressed, R.drawable.hometab_sale_normal, R.drawable.hometab_category_normal, R.drawable.hometab_shopcar_normal3, R.drawable.hometab_self_normal3};

        List<Fragment> fragmentList = new ArrayList<>();
        HomeFragment homeFragment = new HomeFragment();
        BeatFragment beatFragment = new BeatFragment();
        ClassificationFragment classificationFragment = new ClassificationFragment(OverallActivity.this);
        final CatFragment catFragment = new CatFragment();
        MyFragment myFragment = new MyFragment();
        fragmentList.add(homeFragment);
        fragmentList.add(beatFragment);
        fragmentList.add(classificationFragment);
        fragmentList.add(catFragment);
        fragmentList.add(myFragment);
        OverallAdapter adapter = new OverallAdapter(getSupportFragmentManager(), stringList, fragmentList, ints, OverallActivity.this);
        cvpOverall.setAdapter(adapter);
        tbOverall.setupWithViewPager(cvpOverall);
        for (int i = 0; i < tbOverall.getTabCount(); i++) {
            tbOverall.getTabAt(i).setCustomView(adapter.getTabView(i));
        }
        tbOverall.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tab.getPosition()) {
                    case 0:
                        tab.getCustomView().findViewById(R.id.iv_item).setBackgroundResource(R.drawable.hometab_home_pressed);
                        break;
                    case 1:
                        tab.getCustomView().findViewById(R.id.iv_item).setBackgroundResource(R.drawable.hometab_sale_pressed);
                        break;
                    case 2:
                        tab.getCustomView().findViewById(R.id.iv_item).setBackgroundResource(R.drawable.hometab_category_pressed);
                        break;
                    case 3:
                        tab.getCustomView().findViewById(R.id.iv_item).setBackgroundResource(R.drawable.hometab_shopcar_pressed3);
                        break;
                    case 4:
                        tab.getCustomView().findViewById(R.id.iv_item).setBackgroundResource(R.drawable.hometab_self_pressed3);
                        break;
                }
                TextView viewById = tab.getCustomView().findViewById(R.id.tv_item);
                viewById.setTextColor(getResources().getColor(R.color.colorAccent));
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                switch (tab.getPosition()) {
                    case 0:
                        tab.getCustomView().findViewById(R.id.iv_item).setBackgroundResource(R.drawable.hometab_home_normal);
                        break;
                    case 1:
                        tab.getCustomView().findViewById(R.id.iv_item).setBackgroundResource(R.drawable.hometab_sale_normal);
                        break;
                    case 2:
                        tab.getCustomView().findViewById(R.id.iv_item).setBackgroundResource(R.drawable.hometab_category_normal);
                        break;
                    case 3:
                        tab.getCustomView().findViewById(R.id.iv_item).setBackgroundResource(R.drawable.hometab_shopcar_normal3);
                        break;
                    case 4:
                        tab.getCustomView().findViewById(R.id.iv_item).setBackgroundResource(R.drawable.hometab_self_normal3);
                        break;
                }
                TextView viewById = tab.getCustomView().findViewById(R.id.tv_item);
                viewById.setTextColor(getResources().getColor(R.color.deip));
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }
}
