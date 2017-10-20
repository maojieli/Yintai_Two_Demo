package com.jiyun.asus.yintai_two_demo.Fragments.homepage.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import com.jiyun.asus.yintai_two_demo.Fragments.homepage.bean.HomeBean;
import com.jiyun.asus.yintai_two_demo.R;
import com.recker.flybanner.FlyBanner;

import java.util.ArrayList;

/**
 * Created by asus on 2017/10/17.
 */

public class HomeAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private ArrayList<HomeBean.DataBean.TemplatelistBean> BeanArrayList;
    private Context context;

    private View fiveImg_main;
    private View floorspace_main;
    private View head;
    private View sh;
    private View foot;
    private View one;
    private View img;
    private View left;
    private View breast;
    private View a;
    private View bi;

    private final String FuncAreaFiveImg="FuncAreaFiveImg";
    private final String FloorSpace="FloorSpace";
    private final String FloorHead="FloorHead";
    private final String ProductSingleRow="ProductSingleRow";
    private final String FloorFoot="FloorFoot";
    private final String TwoImgAverage="TwoImgAverage";
    private final String OneImg="OneImg";
    private final String ThreeImgLeftOne="ThreeImgLeftOne";
    private final String ThreeImgAbreast="ThreeImgAbreast";
    private final String ThreeImgLeftTwo="ThreeImgLeftTwo";
    private final String CarouselFigure="CarouselFigure";


    public HomeAdapter(ArrayList<HomeBean.DataBean.TemplatelistBean> BeanArrayList) {
        this.BeanArrayList=BeanArrayList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        context = parent.getContext();
        RecyclerView.ViewHolder holder = null;
        fiveImg_main = View.inflate(context, R.layout.items_main, null);
        floorspace_main = View.inflate(context, R.layout.floorspace_main, null);
        head = View.inflate(context, R.layout.floorhead, null);
        sh = View.inflate(context, R.layout.productsinglerow, null);
        foot = View.inflate(context, R.layout.floorfoot, null);
        one = View.inflate(context, R.layout.twoimgaverage_one, null);
        left = View.inflate(context, R.layout.threeimgleftone, null);
        img = View.inflate(context, R.layout.oneimg, null);
        breast = View.inflate(context, R.layout.threeimgabreast, null);
        a = View.inflate(context, R.layout.threeiglefttwo, null);
        bi = View.inflate(context, R.layout.carouselfigure, null);
        Log.e("TAG------------------",viewType+"");
        switch (viewType){
            case 1:
                holder= new FuncAreaFiveImg(fiveImg_main);
                break;
            case 2:
                holder= new FloorSpace(floorspace_main);
                break;
            case 3:
                holder= new FloorHead(head);
                break;
            case 4:
                holder= new ProductSingleRow(sh);
                break;
            case 5:
                holder= new FloorFoot(foot);
                break;
            case 12:
                Log.e("TAG--",viewType+"");
                holder= new TwoImgAverage_One(one);
                break;
            case 7:
                Log.e("TAG--",viewType+"");
                holder=new OneImg(img);
                break;
            case 8:
                holder=new ThreeImgLeftOne(left);
                break;
            case 9:
                holder=new ThreeImgAbreast(breast);
                break;
            case 10:
                holder=new ThreeImgLeftTwo(a);
                break;
            case 11:
                holder=new CarouselFigure(bi);
                break;
        }
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof FuncAreaFiveImg) {
            Glide.with(context).load(BeanArrayList.get(0).getItems().get(0).getImgurl()).into(((FuncAreaFiveImg) holder).iv_items_one);
            Glide.with(context).load(BeanArrayList.get(0).getItems().get(1).getImgurl()).into(((FuncAreaFiveImg) holder).iv_items_two);
            Glide.with(context).load(BeanArrayList.get(0).getItems().get(2).getImgurl()).into(((FuncAreaFiveImg) holder).iv_items_three);
            Glide.with(context).load(BeanArrayList.get(0).getItems().get(3).getImgurl()).into(((FuncAreaFiveImg) holder).iv_items_four);
            Glide.with(context).load(BeanArrayList.get(0).getItems().get(4).getImgurl()).into(((FuncAreaFiveImg) holder).iv_items_five);
            ((FuncAreaFiveImg) holder).tv_items_one.setText(BeanArrayList.get(position).getItems().get(0).getImgname());
            ((FuncAreaFiveImg) holder).tv_items_two.setText(BeanArrayList.get(position).getItems().get(1).getImgname());
            ((FuncAreaFiveImg) holder).tv_items_three.setText(BeanArrayList.get(position).getItems().get(2).getImgname());
            ((FuncAreaFiveImg) holder).tv_items_four.setText(BeanArrayList.get(position).getItems().get(3).getImgname());
            ((FuncAreaFiveImg) holder).tv_items_five.setText(BeanArrayList.get(position).getItems().get(4).getImgname());
        }
        if (holder instanceof FloorSpace){
            ((FloorSpace) holder).iv_floorspace.setImageResource(R.drawable.line_list_short);
        }
        if (holder instanceof FloorHead){
            Glide.with(context).load(BeanArrayList.get(position).getItems().get(0).getImgurl()).into(((FloorHead) holder).iv_head);
        }
        if (holder instanceof ProductSingleRow){
            StaggeredGridLayoutManager staggeredGridLayoutManager=new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL);
            ((ProductSingleRow) holder).rl_pro_title.setLayoutManager(staggeredGridLayoutManager);
            ProductSingleRowAdapter productSingleRowAdapter = new ProductSingleRowAdapter(BeanArrayList.get(position).getItems());
            ((ProductSingleRow) holder).rl_pro_title.setAdapter(productSingleRowAdapter);
        }
        if (holder instanceof FloorFoot){
            ((FloorFoot) holder).iv_foot.setImageResource(R.drawable.line_list_short);

        }
        if (holder instanceof TwoImgAverage_One) {
            Log.e("HOLDER","TwoImgAverage_One");
            Glide.with(context).load(BeanArrayList.get(position).getItems().get(0).getImgurl()).into(((TwoImgAverage_One) holder).iv_one);
            Log.e("HOLDER_0",BeanArrayList.get(position).getItems().get(0).getImgurl());
            Glide.with(context).load(BeanArrayList.get(position).getItems().get(1).getImgurl()).into(((TwoImgAverage_One) holder).iv_two);
            Log.e("HOLDER_1",BeanArrayList.get(position).getItems().get(1).getImgurl());
        }

        if (holder instanceof OneImg) {
            Log.e("HOLDER","OneImg");

            Glide.with(context).load(BeanArrayList.get(position).getItems().get(0).getImgurl()).into(((OneImg) holder).iv_five);
            Log.e("HOLDER_ONE",BeanArrayList.get(position).getItems().get(0).getImgurl());
        }
        if (holder instanceof ThreeImgLeftOne){
            Log.e("HOLDER","ThreeImgLeftOne");
            Glide.with(context).load(BeanArrayList.get(position).getItems().get(0).getImgurl()).into(((ThreeImgLeftOne) holder).iv_one_left);
            Glide.with(context).load(BeanArrayList.get(position).getItems().get(1).getImgurl()).into(((ThreeImgLeftOne) holder).iv_two_left);
            Glide.with(context).load(BeanArrayList.get(position).getItems().get(2).getImgurl()).into(((ThreeImgLeftOne) holder).iv_three_left);

        }
        if (holder instanceof ThreeImgAbreast){
            Glide.with(context).load(BeanArrayList.get(position).getItems().get(0).getImgurl()).into(((ThreeImgAbreast) holder).iv_one_three);
            Glide.with(context).load(BeanArrayList.get(position).getItems().get(1).getImgurl()).into(((ThreeImgAbreast) holder).iv_two_three);
            Glide.with(context).load(BeanArrayList.get(position).getItems().get(2).getImgurl()).into(((ThreeImgAbreast) holder).iv_three_three);

        }
        if (holder instanceof ThreeImgLeftTwo){
            Glide.with(context).load(BeanArrayList.get(position).getItems().get(0).getImgurl()).into(((ThreeImgLeftTwo) holder).iv_left_one);
            Glide.with(context).load(BeanArrayList.get(position).getItems().get(1).getImgurl()).into(((ThreeImgLeftTwo) holder).iv_left_two);
            Glide.with(context).load(BeanArrayList.get(position).getItems().get(2).getImgurl()).into(((ThreeImgLeftTwo) holder).iv_left_three);

        }
        if (holder instanceof CarouselFigure){
            ArrayList<String> strings = new ArrayList<>();
            for (int i = 0; i < BeanArrayList.get(position).getItems().size(); i++) {
                strings.add(BeanArrayList.get(position).getItems().get(i).getImgurl());
            }
            ((CarouselFigure) holder).fb.setImagesUrl(strings);
        }

    }
    @Override
    public int getItemViewType(int position) {
        int viewType = 1;
        String type = BeanArrayList.get(position).getTemplatetype();
        switch (type) {
            case FuncAreaFiveImg:
                viewType = 1;
                return viewType;
            case FloorSpace:
                viewType = 2;
                return viewType;
            case FloorHead:
                viewType = 3;
                return viewType;
            case ProductSingleRow:
                viewType = 4;
                return viewType;
            case FloorFoot:
                viewType = 5;
                return viewType;
            case TwoImgAverage:
                viewType =12 ;
                Log.e("TAG===", viewType + "");
                return viewType;
            case OneImg:
                Log.e("TAG===", viewType + "");
                viewType = 7;
                return viewType;
            case ThreeImgLeftOne:
                viewType = 8;
                return viewType;
            case ThreeImgAbreast:
                viewType = 9;
                return viewType;
            case ThreeImgLeftTwo:
                viewType = 10;
                return viewType;
            case CarouselFigure:
                viewType = 11;
                return viewType;


        }
        return super.getItemViewType(position);
    }
    @Override
    public int getItemCount() {
        return BeanArrayList.size();
    }
    class FuncAreaFiveImg extends RecyclerView.ViewHolder {

        private TextView tv_items_one;
        private  TextView tv_items_two;
        private  TextView tv_items_three;
        private  TextView tv_items_four;
        private  TextView tv_items_five;
        private ImageView iv_items_one;
        private  ImageView iv_items_two;
        private  ImageView iv_items_three;
        private  ImageView iv_items_four;
        private  ImageView iv_items_five;


        public FuncAreaFiveImg(View itemView) {
            super(itemView);
            tv_items_one = itemView.findViewById(R.id.tv_items_one);
            tv_items_two = itemView.findViewById(R.id.tv_items_two);
            tv_items_three = itemView.findViewById(R.id.tv_items_three);
            tv_items_four = itemView.findViewById(R.id.tv_items_four);
            tv_items_five = itemView.findViewById(R.id.tv_items_five);
            iv_items_one = itemView.findViewById(R.id.iv_items_one);
            iv_items_two = itemView.findViewById(R.id.iv_items_two);
            iv_items_three = itemView.findViewById(R.id.iv_items_three);
            iv_items_four = itemView.findViewById(R.id.iv_items_four);
            iv_items_five = itemView.findViewById(R.id.iv_items_five);


        }
    }
    class FloorSpace extends RecyclerView.ViewHolder{

        private  ImageView iv_floorspace;

        public FloorSpace(View itemView) {
            super(itemView);
            iv_floorspace = itemView.findViewById(R.id.iv_floorspace);
        }
    }
    class FloorHead extends RecyclerView.ViewHolder{

        private  ImageView iv_head;

        public FloorHead(View itemView) {
            super(itemView);
            iv_head = itemView.findViewById(R.id.iv_head);
        }
    }
    class ProductSingleRow extends RecyclerView.ViewHolder{

        private  RecyclerView rl_pro_title;

        public ProductSingleRow(View itemView) {
            super(itemView);
            rl_pro_title = itemView.findViewById(R.id.rl_pro_title);
        }
    }
    class FloorFoot extends RecyclerView.ViewHolder{

        private  ImageView iv_foot;

        public FloorFoot(View itemView) {
            super(itemView);
            iv_foot = itemView.findViewById(R.id.iv_foot);
        }
    }

    class TwoImgAverage_One extends RecyclerView.ViewHolder{

        private  ImageView iv_one;
        private  ImageView iv_two;

        public TwoImgAverage_One(View itemView) {
            super(itemView);
            iv_one = itemView.findViewById(R.id.iv_one);
            iv_two = itemView.findViewById(R.id.iv_two);

        }
    }

    class OneImg extends RecyclerView.ViewHolder{
        private  ImageView iv_five;
        public OneImg(View itemView) {
            super(itemView);
            iv_five = itemView.findViewById(R.id.iv_five);

        }
    }
    class ThreeImgLeftOne extends RecyclerView.ViewHolder{

        private  ImageView iv_one_left;
        private  ImageView iv_two_left;
        private  ImageView iv_three_left;

        public ThreeImgLeftOne(View itemView) {
            super(itemView);
            iv_one_left = itemView.findViewById(R.id.iv_one_left);
            iv_two_left = itemView.findViewById(R.id.iv_two_left);
            iv_three_left = itemView.findViewById(R.id.iv_three_left);

        }
    }
    class ThreeImgAbreast extends RecyclerView.ViewHolder{

        private  ImageView iv_one_three;
        private  ImageView iv_two_three;
        private  ImageView iv_three_three;

        public ThreeImgAbreast(View itemView) {
            super(itemView);
            iv_one_three = itemView.findViewById(R.id.iv_one_three);
            iv_two_three = itemView.findViewById(R.id.iv_two_three);
            iv_three_three = itemView.findViewById(R.id.iv_three_three);

        }
    }
    class ThreeImgLeftTwo extends RecyclerView.ViewHolder{

        private  ImageView iv_left_one;
        private  ImageView iv_left_two;
        private  ImageView iv_left_three;

        public ThreeImgLeftTwo(View itemView) {
            super(itemView);
            iv_left_one = itemView.findViewById(R.id.iv_left_one);
            iv_left_two = itemView.findViewById(R.id.iv_left_two);
            iv_left_three = itemView.findViewById(R.id.iv_left_three);

        }
    }
    class CarouselFigure extends RecyclerView.ViewHolder{

        private FlyBanner fb;

        public CarouselFigure(View itemView) {
            super(itemView);
            fb = itemView.findViewById(R.id.fb);
        }
    }


}