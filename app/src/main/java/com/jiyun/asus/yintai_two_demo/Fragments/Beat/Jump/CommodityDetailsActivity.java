package com.jiyun.asus.yintai_two_demo.Fragments.Beat.Jump;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.jiyun.asus.yintai_two_demo.Fragments.Beat.Jump.Adapters.CommodityGvAdapter;
import com.jiyun.asus.yintai_two_demo.Fragments.Beat.Jump.Adapters.MyExpandableListViewAdapter;
import com.jiyun.asus.yintai_two_demo.Fragments.Beat.Jump.Beans.CommodityBeam;
import com.jiyun.asus.yintai_two_demo.Http.Presenter.MyPresenter;
import com.jiyun.asus.yintai_two_demo.Http.View.MyView;
import com.jiyun.asus.yintai_two_demo.Http.tools.BaseParams;
import com.jiyun.asus.yintai_two_demo.Http.tools.Tools;
import com.jiyun.asus.yintai_two_demo.R;
import com.jiyun.asus.yintai_two_demo.Utils.ScrollViewExpandableListView;
import com.jiyun.asus.yintai_two_demo.Utils.ScrollViewGridView;
import com.recker.flybanner.FlyBanner;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

//商品详情页面+1
public class CommodityDetailsActivity extends AppCompatActivity implements MyView<CommodityBeam>, View.OnClickListener {

    private ImageView iv_top_left_commodity;
    private ImageView iv_top_right_commodity;
    private FlyBanner banner_top_body;
    private TextView tv_name_left_body;
    private TextView tv_price_yintai_body;
    private TextView tv_price_market_body;
    private TextView tv_brand_body;
    private TextView tv_code_body;
    private ScrollViewExpandableListView promotion_body;
    private LinearLayout promotion_ll;

    private ViewPager vp_footer_commodity;
    private LinearLayout footer_commodity;
    private Button bu_insert_commodity;
    private Button bu_now_buy_commodity;
    private RelativeLayout cat_commdity;
    private TabLayout tl_footer_commodity;
    private LinearLayout ll_shopcar_commodity;
    private ImageView favority_iv;
    private List<CommodityBeam.DataBean.CurrentBean.PromotionsBean> stringList;
    private MyExpandableListViewAdapter adapter;
    private RelativeLayout choise_color_size_quantity_body;
    private ImageView pop_iv_image;
    private TextView pop_title_tv;
    private TextView pop_price_tv;
    private TextView pop_choice_size_tv;
    private TextView pop_choice_color_tv;

    private ImageView pop_close_iv;
    private ScrollViewGridView pop_color_gv;
    private ScrollViewGridView pop_size_gv;
    private Button pop_quantity_reduction_iv;
    private TextView pop_quantity_value_tv;
    private Button pop_quantity_plus_iv;
    private LinearLayout bottom_ll;
    private RelativeLayout content_rl;
    private View top_empty_v;
    private RelativeLayout rl_cat_popu;
    int a = 0;
    private String itemcode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commodity_details);
        itemcode = getIntent().getStringExtra("itemcode");
        int tag = getIntent().getIntExtra("tag", 0);
        switch (tag) {
            case 1:
                LoadData();
                break;
            case 2:
                LoadData();
                break;
        }
        initView();
        LoadData();
        Map<String, List<CommodityBeam.DataBean.CurrentBean.PromotionsBean>> dataset = new HashMap<>();
        String[] parentList = new String[]{"促销"};
        stringList = new ArrayList<>();
        dataset.put(parentList[0], stringList);
        adapter = new MyExpandableListViewAdapter(dataset, parentList, CommodityDetailsActivity.this);
        promotion_body.setAdapter(adapter);
        //隐藏默认的组 右侧图标
        promotion_body.setGroupIndicator(null);
        //监听二级列表组打开
        promotion_body.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int groupPosition) {
                if (null != adapter) {
                    adapter.setOpen(true);
                    adapter.notifyDataSetChanged();
                }
            }
        });
        //监听二级列表组关闭
        promotion_body.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {
            @Override
            public void onGroupCollapse(int groupPosition) {
                if (null != adapter) {
                    adapter.setOpen(false);
                    adapter.notifyDataSetChanged();
                }
            }
        });


    }

    private void LoadData() {

        MyPresenter presenter = new MyPresenter(this);
        Map<String, String> httpParams = Tools.getHttpParams(CommodityDetailsActivity.this);
        BaseParams.getParams(httpParams, CommodityDetailsActivity.this);
        httpParams.put("ver", "3.0");
        httpParams.put("method", "products.getproduct");
        try {
            JSONObject jsonObject = new JSONObject();
            JSONObject itemcode1 = jsonObject.put("itemcode", itemcode);
            httpParams.put("data", String.valueOf(itemcode1));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        Map<String, String> stringStringHashMap = Tools.signBusinessParameter(CommodityDetailsActivity.this, (HashMap<String, String>) httpParams);
        presenter.quest(stringStringHashMap);
    }

    @Override
    public void success(CommodityBeam commodityBeam) {

        String name = commodityBeam.getData().getCurrent().getName();
        tv_name_left_body.setText(name);
        double price = commodityBeam.getData().getCurrent().getPrice();
        tv_price_market_body.setText("" + price);
        double yt_price = commodityBeam.getData().getCurrent().getYt_price();
        tv_price_yintai_body.setText("" + yt_price);
        String brand = commodityBeam.getData().getCurrent().getBrand();
        tv_brand_body.setText("品牌:" + brand);
        String imageitemcode = commodityBeam.getData().getCurrent().getImageitemcode();
        tv_code_body.setText("商品编号:" + imageitemcode);
        //设置轮播图
        List<String> large_img_urls = commodityBeam.getData().getCurrent().getLarge_img_urls();
        banner_top_body.setImagesUrl(large_img_urls);
        //设置二级列表
        List<CommodityBeam.DataBean.CurrentBean.PromotionsBean> promotions = commodityBeam.getData().getCurrent().getPromotions();
        stringList.addAll(promotions);
        adapter.notifyDataSetChanged();

        pop_price_tv.setText("￥" + commodityBeam.getData().getCurrent().getYt_price() + "");
        pop_title_tv.setText(commodityBeam.getData().getCurrent().getName());
        Set<String> colorSet = new TreeSet<>();
        Set<String> sizeSet = new TreeSet<>();
        List<CommodityBeam.DataBean.ProductListBean> product_list = commodityBeam.getData().getProduct_list();
        for (int x = 0; x < product_list.size(); x++) {
            List<CommodityBeam.DataBean.ProductListBean.SkuPropertyBeanX> sku_property = product_list.get(x).getSku_property();

            String value = sku_property.get(0).getValue();
            colorSet.add(value);
            String value1 = sku_property.get(1).getValue();
            sizeSet.add(value1);


        }
        CommodityGvAdapter adapter = new CommodityGvAdapter(colorSet, CommodityDetailsActivity.this);
        pop_color_gv.setAdapter(adapter);
        pop_choice_size_tv.setText("尺码:" + commodityBeam.getData().getCurrent().getSku_property().get(1).getValue());
        pop_choice_color_tv.setText("颜色分类:" + commodityBeam.getData().getCurrent().getSku_property().get(0).getValue());

    }

    @Override
    public void deteat(String s) {
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }

    private void initView() {
        //回退+分享
        iv_top_left_commodity = (ImageView) findViewById(R.id.iv_top_left_commodity);
        iv_top_right_commodity = (ImageView) findViewById(R.id.iv_top_right_commodity);

        iv_top_left_commodity.setOnClickListener(this);
        iv_top_right_commodity.setOnClickListener(this);
        //轮播图
        banner_top_body = (FlyBanner) findViewById(R.id.banner_top_body);
        //名字
        tv_name_left_body = (TextView) findViewById(R.id.tv_name_left_body);
        //收藏
        favority_iv = (ImageView) findViewById(R.id.favority_iv);
        favority_iv.setOnClickListener(this);
        //银泰价
        tv_price_yintai_body = (TextView) findViewById(R.id.tv_price_yintai_body);
        //市场价
        tv_price_market_body = (TextView) findViewById(R.id.tv_price_market_body);
        //品牌
        tv_brand_body = (TextView) findViewById(R.id.tv_brand_body);
        //编号
        tv_code_body = (TextView) findViewById(R.id.tv_code_body);
        //促销
        promotion_body = (ScrollViewExpandableListView) findViewById(R.id.promotion_body);

        //TabLayout+ViewPager
        tl_footer_commodity = (TabLayout) findViewById(R.id.tl_footer_commodity);
        vp_footer_commodity = (ViewPager) findViewById(R.id.vp_footer_commodity);
        tl_footer_commodity.setupWithViewPager(vp_footer_commodity);
        //请选择 颜色 分类 尺寸
        choise_color_size_quantity_body = (RelativeLayout) findViewById(R.id.choise_color_size_quantity_body);
        choise_color_size_quantity_body.setOnClickListener(this);
        //购物车图片
        ll_shopcar_commodity = (LinearLayout) findViewById(R.id.ll_shopcar_commodity);
        ll_shopcar_commodity.setOnClickListener(this);
        //加入购物车
        bu_insert_commodity = (Button) findViewById(R.id.bu_insert_commodity);
        bu_insert_commodity.setOnClickListener(this);
        //立即购买
        bu_now_buy_commodity = (Button) findViewById(R.id.bu_now_buy_commodity);
        bu_now_buy_commodity.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            //回退图片
            case R.id.iv_top_left_commodity:
                startActivity(new Intent(CommodityDetailsActivity.this, JumpBeatActivity.class));
                break;
            //分享图片
            case R.id.iv_top_right_commodity:
                break;
            //购物车
            case R.id.ll_shopcar_commodity:

                break;
            //加入购物车
            case R.id.bu_insert_commodity:

                break;
            //立即购买
            case R.id.bu_now_buy_commodity:

                break;
            //收藏图片
            case R.id.favority_iv:
                break;
            //请选择
            case R.id.choise_color_size_quantity_body:
                LoadData();
                //显示POPU
                View contentView = LayoutInflater.from(CommodityDetailsActivity.this).inflate(R.layout.popuwindow, null);
                /*加载popu布局控件*/
                //上左图片
                pop_iv_image = (ImageView) contentView.findViewById(R.id.pop_iv_image);
                //商品名称
                pop_title_tv = (TextView) contentView.findViewById(R.id.pop_title_tv);

                //商品价格
                pop_price_tv = (TextView) contentView.findViewById(R.id.pop_price_tv);
                //商品尺码
                pop_choice_size_tv = (TextView) contentView.findViewById(R.id.pop_choice_size_tv);
                //商品颜色
                pop_choice_color_tv = (TextView) contentView.findViewById(R.id.pop_choice_color_tv);
                //关闭POPU图片
                pop_close_iv = (ImageView) contentView.findViewById(R.id.pop_close_iv);
                pop_close_iv.setOnClickListener(this);
                //颜色布局
                pop_color_gv = (ScrollViewGridView) contentView.findViewById(R.id.pop_color_gv);
                //尺码布局
                pop_size_gv = (ScrollViewGridView) contentView.findViewById(R.id.pop_size_gv);
                //减少数量
                pop_quantity_reduction_iv = (Button) contentView.findViewById(R.id.pop_quantity_reduction_iv);
                pop_quantity_reduction_iv.setOnClickListener(this);
                //数量
                pop_quantity_value_tv = (TextView) contentView.findViewById(R.id.pop_quantity_value_tv);
                //添加数量
                pop_quantity_plus_iv = (Button) contentView.findViewById(R.id.pop_quantity_plus_iv);
                pop_quantity_plus_iv.setOnClickListener(this);

                PopupWindow mPopupWindow = new PopupWindow(contentView, LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
                mPopupWindow.setAnimationStyle(R.style.PopupAnimation);
                mPopupWindow.setBackgroundDrawable(CommodityDetailsActivity.this.getResources().getDrawable(R.color.transparent));
                mPopupWindow.setOutsideTouchable(true);
                mPopupWindow.setFocusable(true);
                mPopupWindow.setInputMethodMode(PopupWindow.INPUT_METHOD_NOT_NEEDED);
                View view = LayoutInflater.from(CommodityDetailsActivity.this).inflate(R.layout.activity_commodity_details, null);
                mPopupWindow.showAtLocation(view, Gravity.BOTTOM, 0, 0);
                break;

            case R.id.pop_quantity_reduction_iv:
                String s = pop_quantity_value_tv.getText().toString();

                int i = Integer.parseInt(s);
                int i1 = i--;

                if (i1 <= 0) {
                    pop_quantity_value_tv.setText(0 + "");
                } else {
                    pop_quantity_value_tv.setText(i1 + "");
                }
                break;
            case R.id.pop_quantity_plus_iv:
                a++;
                pop_quantity_value_tv.setText(a + "");
                break;
        }
    }


}
