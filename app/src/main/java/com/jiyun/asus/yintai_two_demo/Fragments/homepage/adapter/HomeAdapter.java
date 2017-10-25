package com.jiyun.asus.yintai_two_demo.Fragments.homepage.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import com.jiyun.asus.yintai_two_demo.Fragments.homepage.bigonclick.BigOnClickActivity;
import com.jiyun.asus.yintai_two_demo.Fragments.homepage.JumpActivityUtils;
import com.jiyun.asus.yintai_two_demo.Fragments.homepage.bean.HomeBean;
import com.jiyun.asus.yintai_two_demo.R;
import com.recker.flybanner.FlyBanner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by asus on 2017/10/17.
 */

public class HomeAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private View productdoublecolumn;
    private ProductSingleRowAdapter productSingleRowAdapter;

    public interface Click{
        void click(int position,int num);
    }

    public Click click;
    public void setClick(Click click){
        this.click=click;
    }

    public interface Click_One{
        void click(int position);
    }

    public Click_One click_one;
    public void setClick(Click_One click_one){
        this.click_one=click_one;
    }
    private ArrayList<HomeBean.DataBean.TemplatelistBean> BeanArrayList;
    ArrayList<String> image;
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
    private View header_main;

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
    private static final String PRODUCTDOUUBLECOLUMN = "ProductDoubleColumn";

    public HomeAdapter(ArrayList<HomeBean.DataBean.TemplatelistBean> BeanArrayList, ArrayList<String> image) {
        this.BeanArrayList=BeanArrayList;
        this.image=image;
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
        productdoublecolumn = View.inflate(context, R.layout.productdoublecolumn, null);
        header_main = View.inflate(context, R.layout.header_main, null);

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

                holder= new TwoImgAverage_One(one);
                break;
            case 7:

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
            case 13:
                holder=new ProductDoubleViewHolder(productdoublecolumn);
                break;
            case 0:
                holder=new Header(header_main);
                break;
        }
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {

        if (holder instanceof Header){
            ((Header) holder).fb_title.setImagesUrl(image);
            ((Header) holder).fb_title.setOnItemClickListener(new FlyBanner.OnItemClickListener() {
                @Override
                public void onItemClick(int position) {
                    click.click(position,100);
                }
            });
        }


        if (holder instanceof FuncAreaFiveImg) {
            HomeAdapter.FuncAreaFiveImg funcAreaFiveImg = (FuncAreaFiveImg) holder;
            funcAreaFiveImg.itemView.setTag(BeanArrayList.get(position-1).getItems());
            Glide.with(context).load(BeanArrayList.get(position-1).getItems().get(0).getImgurl()).into(((FuncAreaFiveImg) holder).iv_items_one);
            Glide.with(context).load(BeanArrayList.get(position-1).getItems().get(1).getImgurl()).into(((FuncAreaFiveImg) holder).iv_items_two);
            Glide.with(context).load(BeanArrayList.get(position-1).getItems().get(2).getImgurl()).into(((FuncAreaFiveImg) holder).iv_items_three);
            Glide.with(context).load(BeanArrayList.get(position-1).getItems().get(3).getImgurl()).into(((FuncAreaFiveImg) holder).iv_items_four);
            Glide.with(context).load(BeanArrayList.get(position-1).getItems().get(4).getImgurl()).into(((FuncAreaFiveImg) holder).iv_items_five);
            funcAreaFiveImg.tv_items_one.setText(BeanArrayList.get(position-1).getItems().get(0).getImgname());
            funcAreaFiveImg.tv_items_two.setText(BeanArrayList.get(position-1).getItems().get(1).getImgname());
            funcAreaFiveImg.tv_items_three.setText(BeanArrayList.get(position-1).getItems().get(2).getImgname());
            funcAreaFiveImg.tv_items_four.setText(BeanArrayList.get(position-1).getItems().get(3).getImgname());
            funcAreaFiveImg.tv_items_five.setText(BeanArrayList.get(position-1).getItems().get(4).getImgname());

        }
        if (holder instanceof FloorSpace){
            ((FloorSpace) holder).iv_floorspace.setImageResource(R.drawable.line_list_short);

        }
        if (holder instanceof FloorHead){
            Glide.with(context).load(BeanArrayList.get(position-1).getItems().get(0).getImgurl()).into(((FloorHead) holder).iv_head);
            ((FloorHead) holder).iv_head.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    click.click(position-1,0);
                }
            });
        }
        if (holder instanceof ProductSingleRow){
            HomeAdapter.ProductSingleRow holder1 = (ProductSingleRow) holder;
            holder1.itemView.setTag(BeanArrayList.get(position-1).getItems());
            StaggeredGridLayoutManager staggeredGridLayoutManager=new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL);
            holder1.rl_pro_title.setLayoutManager(staggeredGridLayoutManager);
            productSingleRowAdapter = new ProductSingleRowAdapter(BeanArrayList.get(position-1).getItems());
            holder1.rl_pro_title.setAdapter(productSingleRowAdapter);
            productSingleRowAdapter.setOnClick(new ProductSingleRowAdapter.OnClick() {
                @Override
                public void onclick(int position) {
                    Intent intent = new Intent(context, BigOnClickActivity.class);
                    context.startActivity(intent);
                }
            });

        }
        if (holder instanceof FloorFoot){
            ((FloorFoot) holder).iv_foot.setImageResource(R.drawable.line_list_short);

        }
        if (holder instanceof TwoImgAverage_One) {

            ((TwoImgAverage_One) holder).itemView.setTag(BeanArrayList.get(position-1).getItems());
            Glide.with(context).load(BeanArrayList.get(position-1).getItems().get(0).getImgurl()).into(((TwoImgAverage_One) holder).iv_one);

            Glide.with(context).load(BeanArrayList.get(position-1).getItems().get(1).getImgurl()).into(((TwoImgAverage_One) holder).iv_two);

        }

        if (holder instanceof OneImg) {
            OneImg holder1 = (OneImg) holder;
            holder1.itemView.setTag(BeanArrayList.get(position-1).getItems());

            Glide.with(context).load(BeanArrayList.get(position-1).getItems().get(0).getImgurl()).into(((OneImg) holder).iv_five);

        }
        if (holder instanceof ThreeImgLeftOne){
            ThreeImgLeftOne holder1 = (ThreeImgLeftOne) holder;
            holder1.itemView.setTag(BeanArrayList.get(position-1).getItems());
            Glide.with(context).load(BeanArrayList.get(position-1).getItems().get(0).getImgurl()).into(((ThreeImgLeftOne) holder).iv_one_left);
            Glide.with(context).load(BeanArrayList.get(position-1).getItems().get(1).getImgurl()).into(((ThreeImgLeftOne) holder).iv_two_left);
            Glide.with(context).load(BeanArrayList.get(position-1).getItems().get(2).getImgurl()).into(((ThreeImgLeftOne) holder).iv_three_left);

        }
        if (holder instanceof ThreeImgAbreast){
            ThreeImgAbreast holder1 = (ThreeImgAbreast) holder;
            holder1.itemView.setTag(BeanArrayList.get(position-1).getItems());

            Glide.with(context).load(BeanArrayList.get(position-1).getItems().get(0).getImgurl()).into(((ThreeImgAbreast) holder).iv_one_three);
            Glide.with(context).load(BeanArrayList.get(position-1).getItems().get(1).getImgurl()).into(((ThreeImgAbreast) holder).iv_two_three);
            Glide.with(context).load(BeanArrayList.get(position-1).getItems().get(2).getImgurl()).into(((ThreeImgAbreast) holder).iv_three_three);

        }
        if (holder instanceof ThreeImgLeftTwo){
            ThreeImgLeftTwo holder1 = (ThreeImgLeftTwo) holder;
            holder1.itemView.setTag(BeanArrayList.get(position-1).getItems());
            Glide.with(context).load(BeanArrayList.get(position-1).getItems().get(0).getImgurl()).into(((ThreeImgLeftTwo) holder).iv_left_one);
            Glide.with(context).load(BeanArrayList.get(position-1).getItems().get(1).getImgurl()).into(((ThreeImgLeftTwo) holder).iv_left_two);
            Glide.with(context).load(BeanArrayList.get(position-1).getItems().get(2).getImgurl()).into(((ThreeImgLeftTwo) holder).iv_left_three);

        }
        if (holder instanceof CarouselFigure){
            ArrayList<String> strings = new ArrayList<>();
            for (int i = 0; i < BeanArrayList.get(position-1).getItems().size(); i++) {
                strings.add(BeanArrayList.get(position-1).getItems().get(i).getImgurl());
            }
            ((CarouselFigure) holder).fb.setImagesUrl(strings);
            ((CarouselFigure) holder).fb.setOnItemClickListener(new FlyBanner.OnItemClickListener() {
                @Override
                public void onItemClick(int position) {
                    click.click(position,200);
                }
            });
        }
        if (holder instanceof ProductDoubleViewHolder) {
            ProductDoubleViewHolder productDoubleViewHolder = (ProductDoubleViewHolder) holder;
            HomeBean.DataBean.TemplatelistBean.ItemsBean itemsBean;
            List<HomeBean.DataBean.TemplatelistBean.ItemsBean> items = BeanArrayList.get(0).getItems();
            if ((itemsBean = items.get(0)) != null) {
                productDoubleViewHolder.mTextView1.setText(itemsBean.getExtra().getProductdetail().getName());
                productDoubleViewHolder.mTextView2.setText(itemsBean.getExtra().getProductdetail().getPrice() + "");
                Glide.with(context).load(itemsBean.getImgurl()).into(((ProductDoubleViewHolder) holder).mImageView1);
            }
            if ((itemsBean = items.get(1)) != null) {
                productDoubleViewHolder.mTextView3.setText(itemsBean.getExtra().getProductdetail().getName());
                productDoubleViewHolder.mTextView4.setText(itemsBean.getExtra().getProductdetail().getPrice() + "");
                Glide.with(context).load(itemsBean.getImgurl()).into(((ProductDoubleViewHolder) holder).mImageView2);
            }
        }

        }
    @Override
    public int getItemViewType(int position) {

        int viewType = 1;
        if (image.size() != 0 && position == 0) {
            viewType = 0;
            return viewType;
        }
        if (image.size() != 0 && position != 0) {
            Integer x = switchType(position - 1);
            if (x != null)
                return x;

            }else {
            Integer x = switchType(position);
            if (x != null)
                return x;


        }
        return super.getItemViewType(position);
    }
    private Integer switchType(int position){
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

                return viewType;
            case OneImg:

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
            case PRODUCTDOUUBLECOLUMN:
                viewType=13;

        }
        return viewType;
    }

    @Override
    public int getItemCount() {
        if (image.size()!=0){
            return BeanArrayList.size()+1;

        }else {
            return BeanArrayList.size();
        }
    }
    class Header extends RecyclerView.ViewHolder{

        private  FlyBanner fb_title;

        public Header(View itemView) {
            super(itemView);
            fb_title = itemView.findViewById(R.id.fb_title);
        }
    }
    class FuncAreaFiveImg extends RecyclerView.ViewHolder implements View.OnClickListener {

        private final View itemView;
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
        private List<HomeBean.DataBean.TemplatelistBean.ItemsBean> items;


        public FuncAreaFiveImg(View itemView) {
            super(itemView);
            tv_items_one = itemView.findViewById(R.id.tv_items_one);

            tv_items_two = itemView.findViewById(R.id.tv_items_two);

            tv_items_three = itemView.findViewById(R.id.tv_items_three);
            tv_items_four = itemView.findViewById(R.id.tv_items_four);
            tv_items_five = itemView.findViewById(R.id.tv_items_five);
            iv_items_one = itemView.findViewById(R.id.iv_items_one);
            iv_items_one.setOnClickListener(this);
            iv_items_two = itemView.findViewById(R.id.iv_items_two);
            iv_items_two.setOnClickListener(this);
            iv_items_three = itemView.findViewById(R.id.iv_items_three);
            iv_items_three.setOnClickListener(this);
            iv_items_four = itemView.findViewById(R.id.iv_items_four);
            iv_items_four.setOnClickListener(this);
            iv_items_five = itemView.findViewById(R.id.iv_items_five);
            iv_items_five.setOnClickListener(this);
            this.itemView = itemView;

        }

        @Override
        public void onClick(View v) {
            switch(v.getId()){
                case R.id.iv_items_one:
                    items = (List<HomeBean.DataBean.TemplatelistBean.ItemsBean>) itemView.getTag();

                    JumpActivityUtils.init(context);
                    JumpActivityUtils.analyzeJump(items.get(0).getJumpurl());

                    break;
                case R.id.iv_items_two:
                    items = (List<HomeBean.DataBean.TemplatelistBean.ItemsBean>) itemView.getTag();

                    JumpActivityUtils.init(context);
                    JumpActivityUtils.analyzeJump(items.get(1).getJumpurl());

                    break;
                case R.id.iv_items_three:
                    items = (List<HomeBean.DataBean.TemplatelistBean.ItemsBean>) itemView.getTag();

                    JumpActivityUtils.init(context);
                    JumpActivityUtils.analyzeJump(items.get(2).getJumpurl());

                    break;
                case R.id.iv_items_four:
                    items = (List<HomeBean.DataBean.TemplatelistBean.ItemsBean>) itemView.getTag();

                    JumpActivityUtils.init(context);
                    JumpActivityUtils.analyzeJump(items.get(3).getJumpurl());

                    break;
                case R.id.iv_items_five:
                    items = (List<HomeBean.DataBean.TemplatelistBean.ItemsBean>) itemView.getTag();

                    JumpActivityUtils.init(context);
                    JumpActivityUtils.analyzeJump(items.get(4).getJumpurl());

                    break;
            }
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
        private  List<HomeBean.DataBean.TemplatelistBean.ItemsBean> itemViewTag;
        private final View itemView;

        public ProductSingleRow(View itemView) {
            super(itemView);
            rl_pro_title = itemView.findViewById(R.id.rl_pro_title);
            this.itemView = itemView;

          /*  productSingleRowAdapter.setOnClick(new ProductSingleRowAdapter.OnClick() {
                @Override
                public void onclick(int position) {
                    itemViewTag = (List<HomeBean.DataBean.TemplatelistBean.ItemsBean>) itemView.getTag();

                    JumpActivityUtils.analyzeJump(itemViewTag.get(position).getJumpurl());
                    JumpActivityUtils.init(context);
                }
            });*/
        }
    }
    class FloorFoot extends RecyclerView.ViewHolder{

        private  ImageView iv_foot;

        public FloorFoot(View itemView) {
            super(itemView);
            iv_foot = itemView.findViewById(R.id.iv_foot);
        }
    }

    class TwoImgAverage_One extends RecyclerView.ViewHolder implements View.OnClickListener {

        private  ImageView iv_one;
        private  ImageView iv_two;
        private final View itemView;
        private List<HomeBean.DataBean.TemplatelistBean.ItemsBean> itemViewTag;


        public TwoImgAverage_One(View itemView) {
            super(itemView);
            iv_one = itemView.findViewById(R.id.iv_one);
            iv_one.setOnClickListener(this);
            iv_two = itemView.findViewById(R.id.iv_two);
            iv_two.setOnClickListener(this);
            this.itemView = itemView;



        }

        @Override
        public void onClick(View v) {

            switch (v.getId()){
                case R.id.iv_one:

                    itemViewTag = (List<HomeBean.DataBean.TemplatelistBean.ItemsBean>) this.itemView.getTag();

                    Log.e("TAG",itemViewTag.toString());

                    JumpActivityUtils.init(context);
                    JumpActivityUtils.analyzeJump(itemViewTag.get(0).getJumpurl());



                    break;
                case R.id.iv_two:
                    itemViewTag = (List<HomeBean.DataBean.TemplatelistBean.ItemsBean>) this.itemView.getTag();

                    JumpActivityUtils.init(context);
                    JumpActivityUtils.analyzeJump(this.itemViewTag.get(1).getJumpurl());


                    break;
            }
        }
    }

    class OneImg extends RecyclerView.ViewHolder implements View.OnClickListener {
        private  ImageView iv_five;
        private final View itemView;
        private  List<HomeBean.DataBean.TemplatelistBean.ItemsBean> itemViewTag;

        public OneImg(View itemView) {
            super(itemView);
            iv_five = itemView.findViewById(R.id.iv_five);
            iv_five.setOnClickListener(this);
           this. itemView = itemView;


        }

        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.iv_five:
                    itemViewTag = (List<HomeBean.DataBean.TemplatelistBean.ItemsBean>) itemView.getTag();

                    JumpActivityUtils.init(context);
                    JumpActivityUtils.analyzeJump(itemViewTag.get(0).getJumpurl());

                    break;
            }
        }
    }
    class ThreeImgLeftOne extends RecyclerView.ViewHolder implements View.OnClickListener {

        private  ImageView iv_one_left;
        private  ImageView iv_two_left;
        private  ImageView iv_three_left;
        private final View itemView;
        private  List<HomeBean.DataBean.TemplatelistBean.ItemsBean> itemViewTag;

        public ThreeImgLeftOne(View itemView) {
            super(itemView);
            iv_one_left = itemView.findViewById(R.id.iv_one_left);
            iv_one_left.setOnClickListener(this);
            iv_two_left = itemView.findViewById(R.id.iv_two_left);
            iv_two_left.setOnClickListener(this);
            iv_three_left = itemView.findViewById(R.id.iv_three_left);
            iv_three_left.setOnClickListener(this);

            this.itemView = itemView;



        }

        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.iv_one_left:
                    itemViewTag = (List<HomeBean.DataBean.TemplatelistBean.ItemsBean>) itemView.getTag();
                    JumpActivityUtils.init(context);
                    JumpActivityUtils.analyzeJump(itemViewTag.get(0).getJumpurl());

                    break;
                case R.id.iv_two_left:
                    itemViewTag = (List<HomeBean.DataBean.TemplatelistBean.ItemsBean>) itemView.getTag();
                    JumpActivityUtils.init(context);
                    JumpActivityUtils.analyzeJump(itemViewTag.get(1).getJumpurl());

                    break;
                case R.id.iv_three_left:
                    itemViewTag = (List<HomeBean.DataBean.TemplatelistBean.ItemsBean>) itemView.getTag();
                    JumpActivityUtils.init(context);
                    JumpActivityUtils.analyzeJump(itemViewTag.get(3).getJumpurl());

                    break;

            }
        }
    }
    class ThreeImgAbreast extends RecyclerView.ViewHolder implements View.OnClickListener {

        private  ImageView iv_one_three;
        private  ImageView iv_two_three;
        private  ImageView iv_three_three;
        private final View itemView;
        private  List<HomeBean.DataBean.TemplatelistBean.ItemsBean> itemViewTag;


        public ThreeImgAbreast(View itemView) {
            super(itemView);
            iv_one_three = itemView.findViewById(R.id.iv_one_three);
            iv_one_three.setOnClickListener(this);
            iv_two_three = itemView.findViewById(R.id.iv_two_three);
            iv_two_three.setOnClickListener(this);
            iv_three_three = itemView.findViewById(R.id.iv_three_three);
            iv_three_three.setOnClickListener(this);
            this.itemView = itemView;
        }

        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.iv_one_three:
                    itemViewTag = (List<HomeBean.DataBean.TemplatelistBean.ItemsBean>) itemView.getTag();

                    JumpActivityUtils.init(context);
                    JumpActivityUtils.analyzeJump(itemViewTag.get(0).getJumpurl());

                    break;
                case R.id.iv_two_three:
                    itemViewTag = (List<HomeBean.DataBean.TemplatelistBean.ItemsBean>) itemView.getTag();

                    JumpActivityUtils.init(context);
                    JumpActivityUtils.analyzeJump(itemViewTag.get(1).getJumpurl());

                    break;
                case R.id.iv_three_three:
                    itemViewTag = (List<HomeBean.DataBean.TemplatelistBean.ItemsBean>) itemView.getTag();

                    JumpActivityUtils.init(context);
                    JumpActivityUtils.analyzeJump(itemViewTag.get(2).getJumpurl());

                    break;

            }
        }
    }
    class ThreeImgLeftTwo extends RecyclerView.ViewHolder implements View.OnClickListener {

        private  ImageView iv_left_one;
        private  ImageView iv_left_two;
        private  ImageView iv_left_three;
        private final View itemView;
        private  List<HomeBean.DataBean.TemplatelistBean.ItemsBean> itemViewTag;


        public ThreeImgLeftTwo(View itemView) {
            super(itemView);
            iv_left_one = itemView.findViewById(R.id.iv_left_one);
            iv_left_one.setOnClickListener(this);
            iv_left_two = itemView.findViewById(R.id.iv_left_two);
            iv_left_two.setOnClickListener(this);
            iv_left_three = itemView.findViewById(R.id.iv_left_three);
            iv_left_three.setOnClickListener(this);

            this.itemView = itemView;

        }

        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.iv_left_one:
                    itemViewTag = (List<HomeBean.DataBean.TemplatelistBean.ItemsBean>) itemView.getTag();

                    JumpActivityUtils.init(context);
                    JumpActivityUtils.analyzeJump(itemViewTag.get(0).getJumpurl());

                    break;
                case R.id.iv_left_two:
                    itemViewTag = (List<HomeBean.DataBean.TemplatelistBean.ItemsBean>) itemView.getTag();

                    JumpActivityUtils.init(context);
                    JumpActivityUtils.analyzeJump(itemViewTag.get(1).getJumpurl());

                    break;
                case R.id.iv_left_three:
                    itemViewTag = (List<HomeBean.DataBean.TemplatelistBean.ItemsBean>) itemView.getTag();

                    JumpActivityUtils.init(context);
                    JumpActivityUtils.analyzeJump(itemViewTag.get(2).getJumpurl());

                    break;

            }
        }
    }
    class CarouselFigure extends RecyclerView.ViewHolder{

        private FlyBanner fb;

        public CarouselFigure(View itemView) {
            super(itemView);
            fb = itemView.findViewById(R.id.fb);
        }
    }

    public class ProductDoubleViewHolder extends RecyclerView.ViewHolder {

        public ImageView mImageView1;
        public ImageView mImageView2;
        public TextView mTextView1;
        public TextView mTextView3;
        public TextView mTextView2;
        public TextView mTextView4;

        public ProductDoubleViewHolder(View itemView) {
            super(itemView);
            mImageView1 = itemView.findViewById(R.id.mImageView1);
            mImageView2 = itemView.findViewById(R.id.mImageView2);
            mTextView1 = itemView.findViewById(R.id.mTextView1);
            mTextView3 = itemView.findViewById(R.id.mTextView3);
            mTextView2 = itemView.findViewById(R.id.mTextView2);
            mTextView4 = itemView.findViewById(R.id.mTextView4);

        }
    }

}
