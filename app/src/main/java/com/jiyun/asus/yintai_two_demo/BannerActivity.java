package com.jiyun.asus.yintai_two_demo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;

import com.jiyun.asus.yintai_two_demo.Fragments.homepage.SysApplication;
import com.jiyun.asus.yintai_two_demo.Indicator.MaterialIndicator;


public class BannerActivity extends AppCompatActivity implements View.OnClickListener {
    private ViewPager viewPager;
    private MaterialIndicator indicator;
    private Button bt_start;

    private SharedPreferences start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SysApplication.getInstance().addActivity(this);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_banner);
        initView();

        start = getSharedPreferences("START", MODE_PRIVATE);
        int num = start.getInt("num", 0);
        if (num == 1) {
            startActivity(new Intent(BannerActivity.this, OverallActivity.class));
        }

        viewPager = (ViewPager) findViewById(R.id.viewPager);

        viewPager.setFocusable(true);
        viewPager.setFocusableInTouchMode(true);
        viewPager.requestFocus();

        final MaterialIndicator indicator = (MaterialIndicator) findViewById(R.id.indicator);
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPager.setAdapter(new MyPagerAdapter());

        viewPager.addOnPageChangeListener(indicator);
        indicator.setAdapter(viewPager.getAdapter());
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    case 2:
                        indicator.setVisibility(View.VISIBLE);
                        bt_start.setVisibility(View.GONE);
                        break;
                    case 3:
                        indicator.setVisibility(View.GONE);
                        bt_start.setVisibility(View.VISIBLE);
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_start:
                SharedPreferences.Editor num = start.edit().putInt("num", 1);
                num.commit();
                startActivity(new Intent(BannerActivity.this, OverallActivity.class));
                break;

        }
    }

    private void initView() {
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        indicator = (MaterialIndicator) findViewById(R.id.indicator);
        bt_start = (Button) findViewById(R.id.bt_start);

        bt_start.setOnClickListener(this);
    }

    /**
     * viewpager适配器
     */
    private class MyPagerAdapter extends PagerAdapter {
        public int[] drawables = {R.drawable.guide_img_one, R.drawable.guide_img_two, R.drawable.guide_img_three, R.drawable.guide_img_four};

        @Override
        public int getCount() {
            return 4;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return object == view;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            ImageView view = new ImageView(container.getContext());
            view.setImageResource(drawables[position]);
            view.setScaleType(ImageView.ScaleType.FIT_XY);
            container.addView(view);
            return view;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView(((View) object));
        }
    }

    @Override
    public void onBackPressed() {
        SysApplication.getInstance().exit();
        super.onBackPressed();
    }
}
