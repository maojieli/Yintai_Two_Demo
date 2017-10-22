package com.jiyun.asus.yintai_two_demo.Fragments.homepage.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.jiyun.asus.yintai_two_demo.Fragments.homepage.bean.HomeBean;
import com.jiyun.asus.yintai_two_demo.R;

import java.util.List;

/**
 * Created by asus on 2017/10/17.
 */

public class ProductSingleRowAdapter extends RecyclerView.Adapter<ProductSingleRowAdapter.ViewHolder> {
private List<HomeBean.DataBean.TemplatelistBean.ItemsBean> items;
private Context context;
    public interface OnClick{
        void onclick(int position);
    }
    public OnClick onClick;
    public void setOnClick(OnClick onClick){
        this.onClick=onClick;
    }

public ProductSingleRowAdapter(List<HomeBean.DataBean.TemplatelistBean.ItemsBean> items) {
        this.items=items;
        }

@Override
public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        context = parent.getContext();
        View inflate = LayoutInflater.from(context).inflate(R.layout.productsinglerow_item, parent, false);
        return new ViewHolder(inflate);
        }

@Override
public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.tv_item.setText(items.get(position).getExtra().getProductdetail().getName());
        Glide.with(context).load(items.get(position).getImgurl()).into(holder.iv_item);
    holder.tv_price.setText(items.get(position).getExtra().getProductdetail().getPrice()+"￥");
    holder.ll_product.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            onClick.onclick(position);
        }
    });
        }

@Override
public int getItemCount() {
        return items.size();
        }

class ViewHolder extends RecyclerView.ViewHolder {

    private ImageView iv_item;
    private TextView tv_item;
    private  TextView tv_price;
    private LinearLayout ll_product;

    public ViewHolder(View itemView) {
        super(itemView);
        iv_item = itemView.findViewById(R.id.iv_item);
        tv_item = itemView.findViewById(R.id.tv_item);
        tv_price = itemView.findViewById(R.id.tv_price);
        ll_product = itemView.findViewById(R.id.ll_product);
    }
}
}

