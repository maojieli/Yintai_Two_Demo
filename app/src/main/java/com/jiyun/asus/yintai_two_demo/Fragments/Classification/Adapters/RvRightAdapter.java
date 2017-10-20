package com.jiyun.asus.yintai_two_demo.Fragments.Classification.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.jiyun.asus.yintai_two_demo.Beans.ClassBean;
import com.jiyun.asus.yintai_two_demo.Fragments.Classification.Adapters.topGlAdapter;
import com.jiyun.asus.yintai_two_demo.Fragments.Classification.NonScrollGridView;
import com.jiyun.asus.yintai_two_demo.R;

import java.util.List;

/**
 * 当你的才华满足不了你的野心的时候，那么你应该静下心来学习.
 */

public class RvRightAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private List<String> stringList;
    private List<ClassBean.DataBean.BrandBean.BrandrecommendBean> brandrecommend;
    private List<ClassBean.DataBean.RecommendBean.CategoryrecommendBean> categoryrecommend;
    private List<ClassBean.DataBean.MoreBean.MorerecommendBean> morerecommend;


    public RvRightAdapter(List<String> BigstringList, List<ClassBean.DataBean.BrandBean.BrandrecommendBean> brandrecommend, List<ClassBean.DataBean.RecommendBean.CategoryrecommendBean> categoryrecommend, List<ClassBean.DataBean.MoreBean.MorerecommendBean> morerecommend, Context context) {
        this.context = context;
        this.stringList = BigstringList;
        this.categoryrecommend = categoryrecommend;
        this.morerecommend = morerecommend;
        this.brandrecommend = brandrecommend;
    }

    @Override
    public int getItemViewType(int position) {
        if ("推荐类目".equals(stringList.get(position))) {
            return 0;
        } else if ("推荐品牌".equals(stringList.get(position))) {
            return 1;
        } else if ("更多类目".equals(stringList.get(position))) {
            return 2;
        } else {
            return 0;
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

                View v3 = from.inflate(R.layout.threeitem, parent, false);
                view1 = new ThreeViewHolder(v3);
                break;
            case 2:
                View v2 = from.inflate(R.layout.twoitem, parent, false);
                view1 = new TwoViewHolder(v2);
                break;
        }

        return view1;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof OneViewHolder) {
            ((OneViewHolder) holder).tv_name_top.setText(stringList.get(position));
            // List<ClassBean.DataBean.RecommendBean.CategoryrecommendBean> categoryrecommend = classBean.getData().getRecommend().getCategoryrecommend();
//推荐类目
            topGlAdapter adapter = new topGlAdapter(categoryrecommend, context);
            ((OneViewHolder) holder).gv_top.setAdapter(adapter);
        } else if (holder instanceof TwoViewHolder) {
            ((TwoViewHolder) holder).tv_name_center.setText(stringList.get(position));
            // List<ClassBean.DataBean.MoreBean.MorerecommendBean> morerecommend = classBean.getData().getMore().getMorerecommend();
            //更多类目
            CenterGvAdapter adapter = new CenterGvAdapter(morerecommend, context);
            ((TwoViewHolder) holder).gv_center.setAdapter(adapter);
        } else if (holder instanceof ThreeViewHolder) {
            ((ThreeViewHolder) holder).tv_name_buttom.setText(stringList.get(position));
            ButtomGvAdapter buttomGvAdapter = new ButtomGvAdapter(brandrecommend, context);
            ((ThreeViewHolder) holder).gv_buttom.setAdapter(buttomGvAdapter);
        }
    }

    @Override
    public int getItemCount() {
        return stringList.size();
    }

    private class OneViewHolder extends RecyclerView.ViewHolder {

        private TextView tv_name_top;
        private NonScrollGridView gv_top;

        public OneViewHolder(View v1) {
            super(v1);
            tv_name_top = v1.findViewById(R.id.tv_name_top);
            gv_top = v1.findViewById(R.id.gv_top);
        }
    }

    private class TwoViewHolder extends RecyclerView.ViewHolder {

        private TextView tv_name_center;
        private NonScrollGridView gv_center;

        public TwoViewHolder(View v2) {
            super(v2);
            tv_name_center = v2.findViewById(R.id.tv_name_center);
            gv_center = v2.findViewById(R.id.gv_center);
        }
    }

    private class ThreeViewHolder extends RecyclerView.ViewHolder {

        private TextView tv_name_buttom;
        private NonScrollGridView gv_buttom;

        public ThreeViewHolder(View v3) {
            super(v3);
            tv_name_buttom = v3.findViewById(R.id.tv_name_buttom);
            gv_buttom = v3.findViewById(R.id.gv_buttom);
        }
    }

    private class CenterGvAdapter extends BaseAdapter {
        private List<ClassBean.DataBean.MoreBean.MorerecommendBean> morerecommend;
        private Context context;

        public CenterGvAdapter(List<ClassBean.DataBean.MoreBean.MorerecommendBean> morerecommend, Context context) {
            this.morerecommend = morerecommend;
            this.context = context;
        }

        @Override
        public int getCount() {
            return morerecommend.size();
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
                convertView = LayoutInflater.from(context).inflate(R.layout.buttomgvitem, null);
                holder.textView = convertView.findViewById(R.id.tv_buttom_gv);
                convertView.setTag(holder);
            } else {
                holder = (ViewHolder) convertView.getTag();
            }
            holder.textView.setText(morerecommend.get(position).getName());
            return convertView;
        }

        class ViewHolder {
            TextView textView;
        }
    }

    private class ButtomGvAdapter extends BaseAdapter {
        private List<ClassBean.DataBean.BrandBean.BrandrecommendBean> brandrecommend;
        private Context context;

        public ButtomGvAdapter(List<ClassBean.DataBean.BrandBean.BrandrecommendBean> brandrecommend, Context context) {
            this.brandrecommend = brandrecommend;
            this.context = context;
        }

        @Override
        public int getCount() {
            return brandrecommend.size();
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
                convertView = LayoutInflater.from(context).inflate(R.layout.centergvitem, null);
                holder.imageView = convertView.findViewById(R.id.iv_center_gv);
                convertView.setTag(holder);
            } else {
                holder = (ViewHolder) convertView.getTag();
            }

            Glide.with(context).load(brandrecommend.get(position).getImageurl()).into(holder.imageView);
            return convertView;
        }

        class ViewHolder {
            ImageView imageView;
        }
    }
}
