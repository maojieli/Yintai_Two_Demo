package com.jiyun.asus.yintai_two_demo.Fragments.homepage.bigonclick.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.jiyun.asus.yintai_two_demo.Fragments.homepage.bigonclick.BigOnClickActivity;
import com.jiyun.asus.yintai_two_demo.Fragments.homepage.bigonclick.bean.BigOnClickBean;
import com.jiyun.asus.yintai_two_demo.R;

import java.util.List;

/**
 * Created by asus on 2017/10/25.
 */

public class PopListAdapter extends BaseAdapter {
    private Context context;
    private List<BigOnClickBean.DataBean.FilterGroupBean> filter_group;
    public PopListAdapter(BigOnClickActivity bigOnClickActivity, List<BigOnClickBean.DataBean.FilterGroupBean> filter_group) {
        this.context=bigOnClickActivity;
        this.filter_group=filter_group;
    }

    @Override
    public int getCount() {
        return filter_group.size();
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
        ViewHoler holer;
        if (convertView==null){
            holer=new ViewHoler();
            convertView= LayoutInflater.from(context).inflate(R.layout.pop_list,null);
            holer.tv_fenlei=convertView.findViewById(R.id.tv_fenlei);
            holer.tv_buxian_one=convertView.findViewById(R.id.tv_buxian_one);
            holer.textView6=convertView.findViewById(R.id.textView6);
            holer.iv_jinru_one=convertView.findViewById(R.id.iv_jinru_one);
            convertView.setTag(holer);
        }else {
            holer= (ViewHoler) convertView.getTag();
        }
        holer.tv_fenlei.setText(filter_group.get(position).getTitle());

        return convertView;
    }
    class ViewHoler{
        TextView  tv_fenlei;
        TextView tv_buxian_one;
        TextView textView6;
        ImageView iv_jinru_one;
    }
}
