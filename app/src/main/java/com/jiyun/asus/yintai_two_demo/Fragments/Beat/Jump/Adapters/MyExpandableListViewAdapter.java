package com.jiyun.asus.yintai_two_demo.Fragments.Beat.Jump.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.jiyun.asus.yintai_two_demo.Fragments.Beat.Jump.Beans.CommodityBeam;
import com.jiyun.asus.yintai_two_demo.Fragments.Beat.Jump.CommodityDetailsActivity;
import com.jiyun.asus.yintai_two_demo.R;

import java.util.List;
import java.util.Map;

/**
 * 我与世界
 * 格格不入
 * <p>
 * 我只与你
 * 惺惺相惜.
 */

public class MyExpandableListViewAdapter extends BaseExpandableListAdapter {
    private Map<String, List<CommodityBeam.DataBean.CurrentBean.PromotionsBean>> dataset;
    private String[] parentList;
    private Context context;
    /**
     * 分组是否打开
     */
    private boolean isOpen = false;

    public void setOpen(boolean isopen) {
        this.isOpen = isopen;
    }

    public MyExpandableListViewAdapter(Map<String, List<CommodityBeam.DataBean.CurrentBean.PromotionsBean>> dataset, String[] parentList, CommodityDetailsActivity commodityDetailsActivity) {
        this.dataset = dataset;
        this.parentList = parentList;
        this.context = commodityDetailsActivity;
    }

    //  获得某个父项的某个子项
    @Override
    public Object getChild(int parentPos, int childPos) {
        return dataset.get(parentList[parentPos]).get(childPos);
    }

    //  获得父项的数量
    @Override
    public int getGroupCount() {
        return dataset.size();
    }

    //  获得某个父项的子项数目
    @Override
    public int getChildrenCount(int parentPos) {
        return dataset.get(parentList[parentPos]).size();
    }

    //  获得某个父项
    @Override
    public Object getGroup(int parentPos) {
        return dataset.get(parentList[parentPos]);
    }

    //  获得某个父项的id
    @Override
    public long getGroupId(int parentPos) {
        return parentPos;
    }

    //  获得某个父项的某个子项的id
    @Override
    public long getChildId(int parentPos, int childPos) {
        return childPos;
    }

    //  按函数的名字来理解应该是是否具有稳定的id，这个方法目前一直都是返回false，没有去改动过
    @Override
    public boolean hasStableIds() {
        return false;
    }


    //  获得父项显示的view
    @Override
    public View getGroupView(int parentPos, boolean b, View view, ViewGroup viewGroup) {
        if (view == null) {

            view = LayoutInflater.from(context).inflate(R.layout.parent_item, null);
        }
        view.setTag(R.layout.parent_item, parentPos);
        view.setTag(R.layout.child_item, -1);
        TextView text = (TextView) view.findViewById(R.id.parent_title);
        final TextView text1 = (TextView) view.findViewById(R.id.parent_title_right);
        final ImageView iv_parent_right = (ImageView) view.findViewById(R.id.iv_parent_right);
        text.setText(parentList[parentPos]);
        if(isOpen){
            text1.setVisibility(View.GONE);
            iv_parent_right.setImageResource(R.mipmap.top_arrow_icon_product_detail);
        }else{
            text1.setVisibility(View.VISIBLE);
            iv_parent_right.setImageResource(R.mipmap.bottom_arrow_icon_product_detail);
        }
        return view;
    }

    //  获得子项显示的view
    @Override
    public View getChildView(int parentPos, int childPos, boolean b, View view, ViewGroup viewGroup) {
        if (view == null) {

            view = LayoutInflater.from(context).inflate(R.layout.child_item, null);
        }
        view.setTag(R.layout.parent_item, parentPos);
        view.setTag(R.layout.child_item, childPos);
        TextView text = (TextView) view.findViewById(R.id.child_title_left);
        TextView text1 = (TextView) view.findViewById(R.id.child_title_right);
        text.setText(dataset.get(parentList[parentPos]).get(childPos).getName());
        text1.setText(dataset.get(parentList[parentPos]).get(childPos).getDesc().get(0));

        return view;
    }

    //  子项是否可选中，如果需要设置子项的点击事件，需要返回true
    @Override
    public boolean isChildSelectable(int i, int i1) {
        return false;
    }


}
