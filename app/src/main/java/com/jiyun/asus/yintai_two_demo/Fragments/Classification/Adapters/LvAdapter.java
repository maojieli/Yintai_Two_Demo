package com.jiyun.asus.yintai_two_demo.Fragments.Classification.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.jiyun.asus.yintai_two_demo.Beans.ClassLeftBean;
import com.jiyun.asus.yintai_two_demo.R;

import java.util.List;

/**
 * 当你的才华满足不了你的野心的时候，那么你应该静下心来学习.
 */

public class LvAdapter extends BaseAdapter {
    private List<ClassLeftBean.DataBeanX.DataBean> been;
    private Context context;

    public LvAdapter(List<ClassLeftBean.DataBeanX.DataBean> been, Context context) {
        this.been = been;
        this.context = context;
    }

    @Override
    public int getCount() {
        return been.size();
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
            convertView = LayoutInflater.from(context).inflate(R.layout.lvitem, null);
            holder.tv_name = convertView.findViewById(R.id.tv_item);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.tv_name.setText(been.get(position).getName());
        return convertView;
    }

    class ViewHolder {
        TextView tv_name;
    }
}
