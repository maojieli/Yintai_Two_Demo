package com.jiyun.asus.yintai_two_demo.Fragments.Classification.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.jiyun.asus.yintai_two_demo.Beans.ClassBean;
import com.jiyun.asus.yintai_two_demo.R;

import java.util.List;

/**
 * 当你的才华满足不了你的野心的时候，那么你应该静下心来学习.
 */

public class RvRightAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<ClassBean.DataBean> been;
    private Context context;

    public RvRightAdapter(List<ClassBean.DataBean> been, Context context) {
        this.been = been;
        this.context = context;
    }
    @Override
    public int getItemViewType(int position) {
        if (been.get(position).getRecommend().getName().equals("推荐类目")){
            return  0;
        }else  if (been.get(position).getMore().getName().equals("更多类目")){
              return  1;
        }else  if (been.get(position).getBrand().getName().equals("推荐类目")){
            return  2;
        }else {
            return  0;
        }
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater from = LayoutInflater.from(context);
        RecyclerView.ViewHolder view1 = null;
        switch (viewType) {
            case 0:
                View v1 = from.inflate(R.layout.oneitem, parent, false);
                view1 = new OneViewHolder(v1);
                break;
            case 1:
                View v2 = from.inflate(R.layout.twoitem, parent, false);
                view1 = new TwoViewHolder(v2);
                break;
            case 2:
                View v3 = from.inflate(R.layout.threeitem, parent, false);
                view1 = new ThreeViewHolder(v3);
                break;
        }

        return view1;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return been.size();
    }

    private class OneViewHolder extends RecyclerView.ViewHolder {
        public OneViewHolder(View v1) {
            super(v1);
            TextView tv_name_top = v1.findViewById(R.id.tv_name_top);
            GridView gv_top = v1.findViewById(R.id.gv_top);
        }
    }

    private class TwoViewHolder extends RecyclerView.ViewHolder {
        public TwoViewHolder(View v2) {
            super(v2);
            TextView tv_name_top = v2.findViewById(R.id.tv_name_center);
            GridView gv_top = v2.findViewById(R.id.gv_center);
        }
    }

    private class ThreeViewHolder extends RecyclerView.ViewHolder {
        public ThreeViewHolder(View v3) {
            super(v3);
            TextView tv_name_buttom = v3.findViewById(R.id.tv_name_buttom);
            GridView gv_buttom = v3.findViewById(R.id.gv_buttom);
        }
    }
}
