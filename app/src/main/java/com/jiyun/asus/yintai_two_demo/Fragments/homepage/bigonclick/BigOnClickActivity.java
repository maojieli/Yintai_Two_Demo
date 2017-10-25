package com.jiyun.asus.yintai_two_demo.Fragments.homepage.bigonclick;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.jiyun.asus.yintai_two_demo.Fragments.Beat.Jump.CommodityDetailsActivity;
import com.jiyun.asus.yintai_two_demo.Fragments.homepage.JumpActivityUtils;
import com.jiyun.asus.yintai_two_demo.Fragments.homepage.SysApplication;
import com.jiyun.asus.yintai_two_demo.Fragments.homepage.bigonclick.adapter.MyBigRecAdapter;
import com.jiyun.asus.yintai_two_demo.Fragments.homepage.bigonclick.adapter.MyListAdapter;
import com.jiyun.asus.yintai_two_demo.Fragments.homepage.bigonclick.adapter.PopItemAdapter;
import com.jiyun.asus.yintai_two_demo.Fragments.homepage.bigonclick.adapter.PopListAdapter;
import com.jiyun.asus.yintai_two_demo.Fragments.homepage.bigonclick.bean.BigOnClickBean;
import com.jiyun.asus.yintai_two_demo.Http.Presenter.MyPresenter;
import com.jiyun.asus.yintai_two_demo.Http.View.MyView;
import com.jiyun.asus.yintai_two_demo.Http.tools.BaseParams;
import com.jiyun.asus.yintai_two_demo.Http.tools.Tools;
import com.jiyun.asus.yintai_two_demo.OverallActivity;
import com.jiyun.asus.yintai_two_demo.R;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BigOnClickActivity extends AppCompatActivity implements MyView<BigOnClickBean>,View.OnClickListener {

    private ImageView iv_big_break;
    private TextView tv_big_name;
    private ImageView iv_big_fenxiang;
    private TextView tv_xiaoliang;
    private LinearLayout ll_price;
    private TextView tv_time;
    private ImageView iv_bianhua;
    private RecyclerView rv_big;
    private ListView lv_big;
    private int num;
    private int sax;
    private TextView bt_price;

    private ImageView iv_price;
    private PopupWindow popupWindow;

    private TextView tv_one;
    private ArrayList<BigOnClickBean.DataBean.FilterGroupBean.ItemsBean> itemsBeen;
    private List<BigOnClickBean.DataBean.FilterGroupBean.ItemsBean> items;
    private List<BigOnClickBean.DataBean.FilterGroupBean.ItemsBean> items1;
    private List<BigOnClickBean.DataBean.FilterGroupBean.ItemsBean> items2;
    private List<BigOnClickBean.DataBean.FilterGroupBean.ItemsBean> items3;
    private List<BigOnClickBean.DataBean.FilterGroupBean.ItemsBean> items4;

    private PopupWindow popupWindow1;
    private View inflate1;
    private TextView textView6;
    private TextView textView8;
    private TextView textView9;
    private TextView textView10;
    private TextView textView11;
    private TextView tv_buxian_five;

    private String  order_type;
    private MyPresenter myPresenter;
    private ImageView iv_jinru_five;
    private TextView tv_clear1;
    private ListView pop_list;
    private ListView lv_pop_item;
    private String searchCondition;
    private View inflate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.big);
        Intent intent = getIntent();
        String url = intent.getStringExtra("jumpUrl");
        String title = intent.getStringExtra("title");
        searchCondition = intent.getStringExtra("searchCondition");
        String showtype = intent.getStringExtra("showtype");

        initView();

       getStringStringMap("5");
        tv_big_name.setText(title);


        inflate = LayoutInflater.from(BigOnClickActivity.this).inflate(R.layout.pop, null);
        pop(inflate);
        popupWindow = new PopupWindow(inflate, ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT,true);

        itemsBeen = new ArrayList<>();
        inflate1 = LayoutInflater.from(BigOnClickActivity.this).inflate(R.layout.pop_item, null);
        popupWindow1 = new PopupWindow(inflate1, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT, true);
        popitem(inflate1);
        }

    @NonNull
    private void getStringStringMap(String order_type) {

        myPresenter = new MyPresenter(this);
        Map<String, String> httpParams = Tools.getHttpParams(this);
        BaseParams.getParams(httpParams, this);



        httpParams.put("ver", "2.1");
        httpParams.put("method", "products.getlist");

//        httpParams.put("data", "{\"query_string\":\"" + searchCondition + "\",\"displaycount\":\"30\",\"order_type\":\"" + order_type + "\",\"page_index\":\"1\",\"keyword\":\"\"}");
        JSONObject jsonObject = new JSONObject();
        JSONObject itemcode1 = null;
        try {
            itemcode1 = jsonObject.put("query_string", searchCondition)
            .put("displaycount", "30")
           .put("order_type", order_type+"")
           .put("page_index", 1+"")
           .put("keyword", "");
            httpParams.put("data", String.valueOf(itemcode1));

        } catch (JSONException e) {
            e.printStackTrace();
        }

        HashMap<String, String> stringStringHashMap = Tools.signBusinessParameter(this, (HashMap<String, String>) httpParams);
        myPresenter.quest(stringStringHashMap);
    }

    private void initView() {
        iv_big_break = (ImageView) findViewById(R.id.iv_big_break);
        iv_big_break.setOnClickListener(this);
        tv_big_name = (TextView) findViewById(R.id.tv_big_name);
        iv_big_fenxiang = (ImageView) findViewById(R.id.iv_big_fenxiang);
        iv_big_fenxiang.setOnClickListener(this);
        tv_xiaoliang = (TextView) findViewById(R.id.tv_xiaoliang);
        tv_xiaoliang.setOnClickListener(this);
        ll_price = (LinearLayout) findViewById(R.id.ll_price);
        ll_price.setOnClickListener(this);
        tv_time = (TextView) findViewById(R.id.tv_time);
        tv_time.setOnClickListener(this);
        iv_bianhua = (ImageView) findViewById(R.id.iv_bianhua);
        iv_bianhua.setOnClickListener(this);
        iv_big_fenxiang.setOnClickListener(this);
        rv_big = (RecyclerView) findViewById(R.id.rv_big);
        lv_big = (ListView) findViewById(R.id.lv_big);
        bt_price = (TextView) findViewById(R.id.bt_price);
        bt_price.setOnClickListener(this);

        iv_price = (ImageView) findViewById(R.id.iv_price);
        iv_price.setOnClickListener(this);



    }

    //图片表
    private static final Integer[] imagelist = {R.drawable.product_blackbar_unselected, R.drawable.product_blackbar_top, R.drawable.product_blackbar_bottom};
    private static final Integer[] image = {R.drawable.a1, R.drawable.productlist_sort_showtype_double};

    //用来显示图片
    public View makeView() {
        return new ImageView(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_big_break:
                Intent intent = new Intent(BigOnClickActivity.this, OverallActivity.class);
                intent.putExtra("num", 1);
                startActivity(intent);
                break;
            case R.id.iv_big_fenxiang:



                popupWindow.setAnimationStyle(R.style.pop_main);
                popupWindow.setTouchable(true);
                popupWindow.setBackgroundDrawable(new ColorDrawable(0x00000000));
                popupWindow.showAtLocation(LayoutInflater.from(BigOnClickActivity.this).inflate(R.layout.big, null), Gravity.TOP, 0, 0);


                // 设置背景颜色变暗
                WindowManager.LayoutParams lp = getWindow().getAttributes();
                lp.alpha = 0.7f;
                getWindow().setAttributes(lp);
                popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() {

                    @Override
                    public void onDismiss() {
                        WindowManager.LayoutParams lp = getWindow().getAttributes();
                        lp.alpha = 1f;
                        getWindow().setAttributes(lp);
                    }
                });
                break;
            case R.id.bt_price:
//                Toast.makeText(this, num+"bt_price"+imagelist.length, Toast.LENGTH_SHORT).show();
                // TODO Auto-generated method stub
                num++;
                if (num >= imagelist.length) {
                    num = 0;
                } else if (num >= imagelist.length) {
                    num = 0;
                }

                iv_price.setImageResource(imagelist[num]);


                if (num==0){
                    getStringStringMap(5+"");
                }else if (num==2){
                    getStringStringMap(4+"");
                }else if (num==3){
                    getStringStringMap(3+"");
                }



                break;
            case R.id.iv_price:
//                Toast.makeText(this, num+"iv_price"+imagelist.length, Toast.LENGTH_SHORT).show();
                // TODO Auto-generated method stub
                num++;
                if (num >= imagelist.length) {
                    num = 0;
                } else if (num >= imagelist.length) {
                    num = 0;
                }

                iv_price.setImageResource(imagelist[num]);

                if (num==0){
                    getStringStringMap(5+"");
                }else if (num==2){
                    getStringStringMap(4+"");
                }else if (num==3){
                    getStringStringMap(3+"");
                }
                break;
            case R.id.iv_bianhua:
//                Toast.makeText(this, num+"bt_price"+image.length, Toast.LENGTH_SHORT).show();
                // TODO Auto-generated method stub
                sax++;
                if (sax >= image.length) {
                    sax = 0;
                } else if (sax >= image.length) {
                    sax = 0;
                }

                iv_bianhua.setImageResource(image[sax]);
                if (sax==0){
                    rv_big.setVisibility(View.VISIBLE);
                    lv_big.setVisibility(View.GONE);
                }else {
                    rv_big.setVisibility(View.GONE);
                    lv_big.setVisibility(View.VISIBLE);
                }
                break;

            case R.id.bt_queding:
                popupWindow.dismiss();
                break;
            case R.id.tv_tiqi:
                popupWindow.dismiss();
                break;
            case R.id.tv_time:
                getStringStringMap(1+"");
                break;
            case R.id.tv_xiaoliang:
                getStringStringMap(5+"");
                break;



        }

    }

    private void popitem(View inflate1) {
        tv_one = inflate1.findViewById(R.id.tv_one);
        tv_one.setOnClickListener(this);
        lv_pop_item = inflate1.findViewById(R.id.lv_pop_item);

    }
    private void pop(View inflate) {
         tv_clear1 = inflate.findViewById(R.id.tv_clear);
         pop_list = inflate.findViewById(R.id.pop_list);

    }

    private static long back_pressed = 0;



    @Override
    public void success(BigOnClickBean bigOnClickBean) {
        Toast.makeText(this, "请求成功", Toast.LENGTH_SHORT).show();

        Log.e("TAG",bigOnClickBean.toString());
        final List<BigOnClickBean.DataBean.FilterGroupBean> filter_group = bigOnClickBean.getData().getFilter_group();
        if (filter_group!=null){
            PopListAdapter popListAdapter = new PopListAdapter(BigOnClickActivity.this,filter_group);
            pop_list.setAdapter(popListAdapter);
            pop_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                    popupWindow1.setAnimationStyle(R.style.pop_main);
//                    inflate.setVisibility(View.GONE);
                    pop_list.setVisibility(View.GONE);
                    popupWindow1.setTouchable(true);
                    popupWindow1.setBackgroundDrawable(new ColorDrawable(0x00000000));
                    popupWindow1.showAtLocation(LayoutInflater.from(BigOnClickActivity.this).inflate(R.layout.big, null), Gravity.TOP, 0, 0);

                    List<BigOnClickBean.DataBean.FilterGroupBean.ItemsBean> items = filter_group.get(position).getItems();
                    PopItemAdapter popItemAdapter = new PopItemAdapter(BigOnClickActivity.this,items);
                    lv_pop_item.setAdapter(popItemAdapter);
                    lv_pop_item.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                            popupWindow1.dismiss();
                            pop_list.setVisibility(View.VISIBLE);

                        }
                    });
                }
            });
        }else {
            Toast.makeText(this, "filter_group 是空的", Toast.LENGTH_SHORT).show();
        }

        final List<BigOnClickBean.DataBean.ProductListBean> product_list = bigOnClickBean.getData().getProduct_list();
        if (product_list!=null){
            Toast.makeText(this, "product_list 不是空的", Toast.LENGTH_SHORT).show();
            StaggeredGridLayoutManager staggeredGridLayoutManager=new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
            rv_big.setLayoutManager(staggeredGridLayoutManager);
            MyBigRecAdapter myBigRecAdapter = new MyBigRecAdapter(product_list);
            rv_big.setAdapter(myBigRecAdapter);
            myBigRecAdapter.setBigClick(new MyBigRecAdapter.BigClick() {
                @Override
                public void bigclick(int position) {
                    String itemcode = product_list.get(position).getItemcode();
                    Intent intent = new Intent(BigOnClickActivity.this, CommodityDetailsActivity.class);
                    intent.putExtra("itemcode",itemcode);
                    intent.putExtra("tag",1);
                    startActivity(intent);
                }
            });

            MyListAdapter myListAdapter = new MyListAdapter(BigOnClickActivity.this,product_list);
            lv_big.setAdapter(myListAdapter);
            lv_big.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    String itemcode = product_list.get(position).getItemcode();
                    Intent intent = new Intent(BigOnClickActivity.this, CommodityDetailsActivity.class);
                    intent.putExtra("itemcode",itemcode);
                    intent.putExtra("tag",1);
                    startActivity(intent);
                }
            });

        }else {
            Toast.makeText(this, "product_list 是空的", Toast.LENGTH_SHORT).show();
        }


    }

    @Override
    public void deteat(String s) {
        Log.e("TAG====",s);
        Toast.makeText(this, "请求失败", Toast.LENGTH_SHORT).show();
    }
}
