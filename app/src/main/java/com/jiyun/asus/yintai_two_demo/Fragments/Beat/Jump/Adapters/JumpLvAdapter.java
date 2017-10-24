package com.jiyun.asus.yintai_two_demo.Fragments.Beat.Jump.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.jiyun.asus.yintai_two_demo.Fragments.Beat.BeatBean.MeiZhuangBean;
import com.jiyun.asus.yintai_two_demo.R;

import java.util.List;

/**
 * 我与世界
 * 格格不入
 * <p>
 * 我只与你
 * 惺惺相惜.
 */

public class JumpLvAdapter extends BaseAdapter {
    private Context context;
    private List<MeiZhuangBean.DataBean.ProductListBean> beanList;

    public JumpLvAdapter(Context context, List<MeiZhuangBean.DataBean.ProductListBean> beanList) {
        this.context = context;
        this.beanList = beanList;
    }

    @Override
    public int getCount() {
        return beanList.size();
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
            convertView = LayoutInflater.from(context).inflate(R.layout.jumplvitem, null);
            holder.iv_jump_lv_item = (ImageView) convertView.findViewById(R.id.iv_jump_lv_item);
            holder.tv_name_jump_lv_item = (TextView) convertView.findViewById(R.id.tv_name_jump_lv_item);
            holder.tv_discount = (TextView) convertView.findViewById(R.id.tv_discount);
            holder.tv_ytprice = (TextView) convertView.findViewById(R.id.tv_ytprice);
            holder.tv_jump_lv_price = (TextView) convertView.findViewById(R.id.tv_jump_lv_price);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        Glide.with(context).load(beanList.get(position).getImage()).into(holder.iv_jump_lv_item);
        holder.tv_discount.setText(beanList.get(position).getDiscount()+"折");
        holder.tv_ytprice.setText("￥" + beanList.get(position).getYt_price() + "");
        holder.tv_jump_lv_price.setText("￥" + beanList.get(position).getPrice() + "");
        holder.tv_name_jump_lv_item.setText(beanList.get(position).getName());
        return convertView;
    }

    public static class ViewHolder {

        public ImageView iv_jump_lv_item;
        public TextView tv_name_jump_lv_item;
        public TextView tv_discount;
        public TextView tv_ytprice;
        public TextView tv_jump_lv_price;



    }
}
