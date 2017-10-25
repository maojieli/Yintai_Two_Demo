package com.jiyun.asus.yintai_two_demo.Fragments.homepage.bigonclick.adapter;

import android.content.Context;
import android.graphics.Paint;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.StrikethroughSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.jiyun.asus.yintai_two_demo.Fragments.homepage.bigonclick.BigOnClickActivity;
import com.jiyun.asus.yintai_two_demo.Fragments.homepage.bigonclick.bean.BigOnClickBean;
import com.jiyun.asus.yintai_two_demo.R;

import java.util.List;

/**
 * Created by asus on 2017/10/25.
 */

public class MyListAdapter extends BaseAdapter {
    private Context context;
    private List<BigOnClickBean.DataBean.ProductListBean> product_list;
    public MyListAdapter(BigOnClickActivity bigOnClickActivity, List<BigOnClickBean.DataBean.ProductListBean> product_list) {
        this.context=bigOnClickActivity;
        this.product_list=product_list;
    }

    @Override
    public int getCount() {
        return product_list.size();
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
            convertView= LayoutInflater.from(context).inflate(R.layout.biglist,null);
            holer.iv_list_show=convertView.findViewById(R.id.iv_list_show);
            holer.tv_price_list_new=convertView.findViewById(R.id.tv_price_list_new);
            holer.tv_list_price_after=convertView.findViewById(R.id.tv_list_price_after);
            holer.tv_content_list=convertView.findViewById(R.id.tv_content_list);
            convertView.setTag(holer);
        }else {
           holer= (ViewHoler) convertView.getTag();
        }
        Glide.with(context).load(product_list.get(position).getImage()).into(holer.iv_list_show);
        holer.tv_content_list.setText(product_list.get(position).getName());


        holer.tv_list_price_after.setText(product_list.get(position).getPrice()+"");
        holer.tv_list_price_after.getPaint().setFlags(Paint. STRIKE_THRU_TEXT_FLAG); //中划线
        holer.tv_price_list_new.setText(product_list.get(position).getPromotion_price()+"");
        return convertView;
    }
    class ViewHoler{
        TextView tv_content_list;
        ImageView iv_list_show;
        TextView tv_list_price_after;
        TextView tv_price_list_new;
    }
}
