package com.jiyun.asus.yintai_two_demo.Fragments.Beat.Adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.jiyun.asus.yintai_two_demo.Fragments.Beat.BeatBean.BeatBean;
import com.jiyun.asus.yintai_two_demo.R;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 当你的才华满足不了你的野心的时候，那么你应该静下心来学习.
 */

public class CommendLvAdapters extends BaseAdapter {
    private List<BeatBean.DataBean.ActivityinfoBean.ActivitylistBean> activitylist;
    private Context context;
    private int mScreeWidth;
    public CommendLvAdapters(List<BeatBean.DataBean.ActivityinfoBean.ActivitylistBean> activitylist, Context context) {
        this.activitylist = activitylist;
        this.context = context;
        mScreeWidth = context.getResources().getDisplayMetrics().widthPixels;
    }

    @Override
    public int getCount() {
        return activitylist.size();
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
            convertView = LayoutInflater.from(context).inflate(R.layout.commendlvitem, null);

            holder.iv_commendlvitem = (ImageView) convertView.findViewById(R.id.iv_commendlvitem);
            holder.tv_top_commendlv = (TextView) convertView.findViewById(R.id.tv_top_commendlv);
            holder.tv_center_commendlv = (TextView) convertView.findViewById(R.id.tv_center_commendlv);
            // holder.tv_buttom_commend = (TextView) convertView.findViewById(R.id.tv_buttom_commend);

            convertView.setTag(holder);

        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        Glide.with(context).load(activitylist.get(position).getImgurl()).override(mScreeWidth / 3, mScreeWidth / 3).into(holder.iv_commendlvitem);
        holder.tv_top_commendlv.setText(activitylist.get(position).getTitle());
        holder.tv_center_commendlv.setText(activitylist.get(position).getDiscount());

        return convertView;
    }

    class ViewHolder {

        public ImageView iv_commendlvitem;
        public TextView tv_top_commendlv;
        public TextView tv_center_commendlv;




    }
}
