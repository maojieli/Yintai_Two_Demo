package com.jiyun.asus.yintai_two_demo.Fragments.homepage.bigonclick.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Spannable;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.jiyun.asus.yintai_two_demo.Fragments.homepage.bigonclick.bean.BigOnClickBean;
import com.jiyun.asus.yintai_two_demo.R;

import java.util.List;

/**
 * Created by asus on 2017/10/25.
 */

public class MyBigRecAdapter extends RecyclerView.Adapter<MyBigRecAdapter.ViewHolder>{
    public interface BigClick{
        void bigclick(int position);
    }
    public BigClick bigClick;
    public void setBigClick(BigClick bigClick){
        this.bigClick=bigClick;
    }


    private List<BigOnClickBean.DataBean.ProductListBean> product_list;
    private Context context;

    public MyBigRecAdapter(List<BigOnClickBean.DataBean.ProductListBean> product_list) {
        this.product_list=product_list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        context = parent.getContext();
        View inflate = LayoutInflater.from(context).inflate(R.layout.bigrec, null);
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        Glide.with(context).load(product_list.get(position).getImage()).into(holder.iv_show);
        holder.tv_content_show.setText(product_list.get(position).getName());
        holder.tv_show_price_new.setText(product_list.get(position).getPromotion_price()+"");
        holder.tv_show_price_after.setText(product_list.get(position).getPrice()+"");
        Spannable spanStrikethrough = new SpannableString("显示删除线样式");
        StrikethroughSpan stSpan = new StrikethroughSpan();  //设置删除线样式
        spanStrikethrough.setSpan(stSpan, 2, 5, Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
        holder.tv_show_price_after.setText(spanStrikethrough);
        holder.ll_big.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bigClick.bigclick(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return product_list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        private  ImageView iv_show;
        private  TextView tv_content_show;
        private  TextView tv_show_price_new;
        private  TextView tv_show_price_after;
        private  LinearLayout ll_big;

        public ViewHolder(View itemView) {
            super(itemView);
            iv_show = itemView.findViewById(R.id.iv_show);
            tv_content_show = itemView.findViewById(R.id.tv_content_show);
            tv_show_price_new = itemView.findViewById(R.id.tv_show_price_new);
            tv_show_price_after = itemView.findViewById(R.id.tv_show_price_after);
            ll_big = itemView.findViewById(R.id.ll_big);
        }
    }

    private class StrikethroughSpan {
    }
}
