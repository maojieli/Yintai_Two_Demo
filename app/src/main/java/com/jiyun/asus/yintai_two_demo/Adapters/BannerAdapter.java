package com.jiyun.asus.yintai_two_demo.Adapters;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by 南尘 on 2016/7/10.
 */
public class BannerAdapter extends PagerAdapter {

    private List<View> viewList;

    public BannerAdapter(List<View> viewList) {
        this.viewList = viewList;
    }

    /**
     * @return 返回页面的个数
     */
    @Override
    public int getCount() {

        return viewList.size();
    }

    /**
     * 判断对象是否生成界面
     * @param view
     * @param object
     * @return
     */
    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    /**
     * 初始化position位置的界面
     * @param container
     * @param position
     * @return
     */
    @Override
    public Object instantiateItem(ViewGroup container, int position) {


        container.addView(viewList.get(position));
        return viewList.get(position);

//        container.addView(viewList.get(position));
//        return viewList.get(position);
    }


    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {


        container.removeView(viewList.get(position));

//        container.removeView(viewList.get(position));
    }
}