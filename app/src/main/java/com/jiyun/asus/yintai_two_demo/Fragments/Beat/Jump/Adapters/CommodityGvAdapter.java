package com.jiyun.asus.yintai_two_demo.Fragments.Beat.Jump.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.jiyun.asus.yintai_two_demo.Fragments.Beat.Jump.CommodityDetailsActivity;
import com.jiyun.asus.yintai_two_demo.R;

import java.util.Set;

/**
 * 我与世界
 * 格格不入
 * <p>
 * 我只与你
 * 惺惺相惜.
 */

public class CommodityGvAdapter extends BaseAdapter {
    private Set<String> colorSet;
    private Context context;

    public CommodityGvAdapter(Set<String> colorSet, CommodityDetailsActivity commodityDetailsActivity) {
        this.colorSet = colorSet;
        this.context = commodityDetailsActivity;
    }

    @Override
    public int getCount() {
        return colorSet.size();
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
            convertView = LayoutInflater.from(context).inflate(R.layout.commoditycolor, null);
            holder.tv_commodity_color = convertView.findViewById(R.id.tv_commodity_color);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        for (String name : colorSet) {
            holder.tv_commodity_color.setText(name);
        }

        return convertView;
    }

    public static class ViewHolder {

        public TextView tv_commodity_color;

    }
}
