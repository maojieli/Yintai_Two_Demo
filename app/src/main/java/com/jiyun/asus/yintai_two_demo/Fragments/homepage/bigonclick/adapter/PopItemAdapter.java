package com.jiyun.asus.yintai_two_demo.Fragments.homepage.bigonclick.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.jiyun.asus.yintai_two_demo.Fragments.homepage.bigonclick.BigOnClickActivity;
import com.jiyun.asus.yintai_two_demo.Fragments.homepage.bigonclick.bean.BigOnClickBean;
import com.jiyun.asus.yintai_two_demo.R;

import java.util.List;

/**
 * Created by asus on 2017/10/25.
 */

public class PopItemAdapter extends BaseAdapter {
    private List<BigOnClickBean.DataBean.FilterGroupBean.ItemsBean> items;
    private Context context;
    public PopItemAdapter(BigOnClickActivity bigOnClickActivity, List<BigOnClickBean.DataBean.FilterGroupBean.ItemsBean> items) {
        this.items=items;
        this.context=bigOnClickActivity;
    }

    @Override
    public int getCount() {
        return items.size();
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
        if (convertView==null){
            holder=new ViewHolder();
            convertView= LayoutInflater.from(context).inflate(R.layout.popitem_list,null);
            holder.tv_two=convertView.findViewById(R.id.tv_two);
            convertView.setTag(holder);

        }  else {
            holder= (ViewHolder) convertView.getTag();
        }

            holder.tv_two.setText("     "+items.get(position).getName());

        return convertView;
    }
    class ViewHolder{
        TextView tv_two;
    }
}
