package com.jiyun.asus.yintai_two_demo.Fragments.Beat.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.jiyun.asus.yintai_two_demo.Fragments.Beat.BeatBean.BeatBean;
import com.jiyun.asus.yintai_two_demo.R;

import java.util.List;

/**
 * 当你的才华满足不了你的野心的时候，那么你应该静下心来学习.
 */

public class SaleLvAdapter extends BaseAdapter {
    private List<BeatBean.DataBean.ActivityinfoBean.ActivitylistBean> activitylistBeen;
    private Context context;
    private int mScreeWidth;
    public SaleLvAdapter(List<BeatBean.DataBean.ActivityinfoBean.ActivitylistBean> activitylistBeen, Context context) {
        this.activitylistBeen = activitylistBeen;
        this.context = context;
        mScreeWidth = context.getResources().getDisplayMetrics().widthPixels;
    }

    @Override
    public int getCount() {
        return activitylistBeen.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
    ViewHolder holder;
        if (convertView == null) {
            holder = new ViewHolder();
            convertView = LayoutInflater.from(context).inflate(R.layout.salefragmentitem, null);

            holder.iv_commendlvitem = (ImageView) convertView.findViewById(R.id.iv_left_sale);
            holder.tv_top_commendlv = (TextView) convertView.findViewById(R.id.tv_name_sale);
            holder.tv_center_commendlv = (TextView) convertView.findViewById(R.id.tv_brandname_slase);

            convertView.setTag(holder);

        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        Glide.with(context).load(activitylistBeen.get(position).getLogo()).override(mScreeWidth / 3, mScreeWidth / 3).into(holder.iv_commendlvitem);
        holder.tv_top_commendlv.setText(activitylistBeen.get(position).getTitle());
        holder.tv_center_commendlv.setText(activitylistBeen.get(position).getBrandname());
        return convertView;
    }
    class ViewHolder {
        ImageView iv_commendlvitem;
         TextView tv_top_commendlv;
        TextView tv_center_commendlv;
    }

    }
