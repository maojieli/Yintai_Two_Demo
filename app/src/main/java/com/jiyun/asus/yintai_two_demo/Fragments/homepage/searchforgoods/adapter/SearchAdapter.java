package com.jiyun.asus.yintai_two_demo.Fragments.homepage.searchforgoods.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.jiyun.asus.yintai_two_demo.Fragments.homepage.searchforgoods.bean.SearchBean;
import com.jiyun.asus.yintai_two_demo.R;

import java.util.ArrayList;

/**
 * Created by asus on 2017/10/18.
 */

public class SearchAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private ArrayList<SearchBean.DataBean> dataBeen;
    private View search_one;
    private View search_two;

    public SearchAdapter(ArrayList<SearchBean.DataBean> dataBeen) {
        this.dataBeen=dataBeen;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder holder=null;
        Context context = parent.getContext();
        search_one = LayoutInflater.from(context).inflate(R.layout.search_one, null);
        search_two = LayoutInflater.from(context).inflate(R.layout.search_two, null);
        switch (viewType){
            case 0:
                holder=new search_One(search_one);
                break;
            case 1:
                holder=new search_Two(search_two);
                break;
        }
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
            if (holder instanceof search_One){
                ((search_One) holder).bt_one.setText(dataBeen.get(position).getTags().get(0).getName());
                ((search_One) holder).bt_two.setText(dataBeen.get(position).getTags().get(1).getName());
                ((search_One) holder).bt_three.setText(dataBeen.get(position).getTags().get(2).getName());
                ((search_One) holder).bt_four.setText(dataBeen.get(position).getTags().get(3).getName());
                ((search_One) holder).bt_five.setText(dataBeen.get(position).getTags().get(4).getName());
                ((search_One) holder).bt_six.setText(dataBeen.get(position).getTags().get(5).getName());
                ((search_One) holder).bt_seven.setText(dataBeen.get(position).getTags().get(6).getName());
                ((search_One) holder).bt_eight.setText(dataBeen.get(position).getTags().get(7).getName());
                ((search_One) holder).bt_nine.setText(dataBeen.get(position).getTags().get(8).getName());
                ((search_One) holder).bt_ten.setText(dataBeen.get(position).getTags().get(9).getName());
            }
            if (holder instanceof search_Two){
                ((search_Two) holder).bt_one.setText(dataBeen.get(position).getTags().get(0).getName());
                ((search_Two) holder).bt_two.setText(dataBeen.get(position).getTags().get(1).getName());
                ((search_Two) holder).bt_three.setText(dataBeen.get(position).getTags().get(2).getName());
                ((search_Two) holder).bt_four.setText(dataBeen.get(position).getTags().get(3).getName());
                ((search_Two) holder).bt_five.setText(dataBeen.get(position).getTags().get(4).getName());
                ((search_Two) holder).bt_six.setText(dataBeen.get(position).getTags().get(5).getName());
                ((search_Two) holder).bt_seven.setText(dataBeen.get(position).getTags().get(6).getName());
                ((search_Two) holder).bt_eight.setText(dataBeen.get(position).getTags().get(7).getName());
                ((search_Two) holder).bt_nine.setText(dataBeen.get(position).getTags().get(8).getName());
                ((search_Two) holder).bt_ten.setText(dataBeen.get(position).getTags().get(9).getName());
            }
    }

    @Override
    public int getItemViewType(int position) {
        int viewType=1;
        switch (position){
            case 0:
                viewType=0;
                return viewType;
            case 1:
                viewType=1;
                return viewType;
        }
        return super.getItemViewType(position);
    }

    @Override
    public int getItemCount() {
        return dataBeen.size();
    }
    class search_One extends RecyclerView.ViewHolder{

        private final Button bt_one;
        private final Button bt_two;
        private final Button bt_three;
        private final Button bt_four;
        private final Button bt_five;
        private final Button bt_six;
        private final Button bt_seven;
        private final Button bt_eight;
        private final Button bt_nine;
        private final Button bt_ten;


        public search_One(View itemView) {
            super(itemView);
            bt_one = itemView.findViewById(R.id.bt_one);
            bt_two = itemView.findViewById(R.id.bt_two);
            bt_three = itemView.findViewById(R.id.bt_three);
            bt_four = itemView.findViewById(R.id.bt_four);
            bt_five = itemView.findViewById(R.id.bt_five);
            bt_six = itemView.findViewById(R.id.bt_six);
            bt_seven = itemView.findViewById(R.id.bt_seven);
            bt_eight = itemView.findViewById(R.id.bt_eight);
            bt_nine = itemView.findViewById(R.id.bt_nine);
            bt_ten = itemView.findViewById(R.id.bt_ten);

        }
    }
    class search_Two extends RecyclerView.ViewHolder{

        private final Button bt_one;
        private final Button bt_two;
        private final Button bt_three;
        private final Button bt_four;
        private final Button bt_five;
        private final Button bt_six;
        private final Button bt_seven;
        private final Button bt_eight;
        private final Button bt_nine;
        private final Button bt_ten;


        public search_Two(View itemView) {
            super(itemView);
            bt_one = itemView.findViewById(R.id.bt_one);
            bt_two = itemView.findViewById(R.id.bt_two);
            bt_three = itemView.findViewById(R.id.bt_three);
            bt_four = itemView.findViewById(R.id.bt_four);
            bt_five = itemView.findViewById(R.id.bt_five);
            bt_six = itemView.findViewById(R.id.bt_six);
            bt_seven = itemView.findViewById(R.id.bt_seven);
            bt_eight = itemView.findViewById(R.id.bt_eight);
            bt_nine = itemView.findViewById(R.id.bt_nine);
            bt_ten = itemView.findViewById(R.id.bt_ten);

        }
    }
}
