package com.jiyun.asus.yintai_two_demo.Fragments.Classification.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.jiyun.asus.yintai_two_demo.Beans.ClassBean;
import com.jiyun.asus.yintai_two_demo.R;

import java.util.List;

/**
 * 当你的才华满足不了你的野心的时候，那么你应该静下心来学习.
 */

public class topGlAdapter extends BaseAdapter {
    private List<ClassBean.DataBean.RecommendBean.CategoryrecommendBean> categoryrecommend;
    private Context context;

    public topGlAdapter(List<ClassBean.DataBean.RecommendBean.CategoryrecommendBean> categoryrecommend, Context context) {
        this.categoryrecommend = categoryrecommend;
        this.context = context;
    }

    @Override
    public int getCount() {
        return categoryrecommend.size();
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
            convertView = LayoutInflater.from(context).inflate(R.layout.topgvitem, null);
            holder.imageView = convertView.findViewById(R.id.iv_top_gv);
            holder.textView = convertView.findViewById(R.id.tv_top_gv);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.textView.setText(categoryrecommend.get(position).getName());
        Glide.with(context).load(categoryrecommend.get(position).getImageurl()).into(holder.imageView);
        return convertView;
    }

    class ViewHolder {
        ImageView imageView;
        TextView textView;
    }
}
