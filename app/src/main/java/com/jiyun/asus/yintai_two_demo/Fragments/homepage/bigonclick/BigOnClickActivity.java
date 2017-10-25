package com.jiyun.asus.yintai_two_demo.Fragments.homepage.bigonclick;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.jiyun.asus.yintai_two_demo.Fragments.homepage.SysApplication;
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
    private TextView textView7;
    private TextView tv_clear;
    private TextView tv_fenlei;
    private TextView tv_buxian_one;
    private ImageView iv_jinru_one;
    private TextView tv_pinpai;
    private TextView tv_buxian_two;
    private ImageView iv_jinru_two;
    private TextView tv_jiage;
    private TextView tv_buxian_three;
    private ImageView iv_jinru_three;
    private TextView tv_zhekou;
    private TextView tv_buxian_four;
    private ImageView iv_jinru_four;
    private Button bt_queding;
    private LinearLayout linearLayout5;
    private TextView tv_tiqi;
    private RelativeLayout rl_five;
    private TextView tv_sexi;
    private RelativeLayout rl_one;
    private RelativeLayout rl_two;
    private RelativeLayout rl_three;
    private RelativeLayout rl_four;
    private TextView tv_one;
    private ArrayList<BigOnClickBean.DataBean.FilterGroupBean.ItemsBean> itemsBeen;
    private List<BigOnClickBean.DataBean.FilterGroupBean.ItemsBean> items;
    private List<BigOnClickBean.DataBean.FilterGroupBean.ItemsBean> items1;
    private List<BigOnClickBean.DataBean.FilterGroupBean.ItemsBean> items2;
    private List<BigOnClickBean.DataBean.FilterGroupBean.ItemsBean> items3;
    private List<BigOnClickBean.DataBean.FilterGroupBean.ItemsBean> items4;
    private TextView tv_two;
    private TextView tv_three;
    private TextView tv_four;
    private TextView tv_five;
    private TextView tv_six;
    private TextView tv_seven;
    private TextView tv_eight;
    private TextView tv_nine;
    private TextView tv_ten;
    private PopupWindow popupWindow1;
    private View inflate1;
    private TextView textView6;
    private TextView textView8;
    private TextView textView9;
    private TextView textView10;
    private TextView textView11;
    private TextView tv_buxian_five;

    private int order_type;
    private MyPresenter myPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.big);
        initView();
       getStringStringMap(5);





        itemsBeen = new ArrayList<>();
        inflate1 = LayoutInflater.from(BigOnClickActivity.this).inflate(R.layout.pop_item, null);
        popupWindow1 = new PopupWindow(inflate1, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT, true);
    }

    @NonNull
    private void getStringStringMap(int order_type) {
        Intent intent = getIntent();
        String url = intent.getStringExtra("jumpUrl");
        String title = intent.getStringExtra("title");
        String searchCondition = intent.getStringExtra("searchCondition");
        String showtype = intent.getStringExtra("showtype");
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
        ll_price = (LinearLayout) findViewById(R.id.ll_price);
        ll_price.setOnClickListener(this);
        tv_time = (TextView) findViewById(R.id.tv_time);
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
                View inflate = LayoutInflater.from(BigOnClickActivity.this).inflate(R.layout.pop, null);
                pop(inflate);


                popupWindow = new PopupWindow(inflate, ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT,true);
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
                    getStringStringMap(5);
                }else if (num==2){
                    getStringStringMap(4);
                }else if (num==3){
                    getStringStringMap(3);
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
                    getStringStringMap(5);
                }else if (num==2){
                    getStringStringMap(4);
                }else if (num==3){
                    getStringStringMap(3);
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
                break;

            case R.id.bt_queding:
                popupWindow.dismiss();
                break;
            case R.id.tv_tiqi:
                popupWindow.dismiss();
                break;
            case R.id.rl_two:
                itemsBeen.clear();
                itemsBeen.addAll(items);

                popupWindow1.setTouchable(true);
                popupWindow1.setBackgroundDrawable(new ColorDrawable(0x00000000));
                popupWindow1.showAtLocation(LayoutInflater.from(BigOnClickActivity.this).inflate(R.layout.big, null), Gravity.TOP, 0, 0);
                popitem(inflate1);

                tv_one.setText(tv_pinpai.getText().toString());
                tv_two.setText("     全部");

                if (itemsBeen.size()>=1){
                    tv_three.setText("     "+itemsBeen.get(0).getName());
                }
                if (itemsBeen.size()>=2){
                    tv_four.setText("     "+itemsBeen.get(1).getName());
                }
                if (itemsBeen.size()>=3){
                    tv_five.setText("     "+itemsBeen.get(2).getName());
                }
                if (itemsBeen.size()>=4){
                    tv_six.setText("     "+itemsBeen.get(3).getName());
                }
                if (itemsBeen.size()>=5){
                    tv_seven.setText("     "+itemsBeen.get(4).getName());
                }
                if (itemsBeen.size()>=6){
                    tv_eight.setText("     "+itemsBeen.get(5).getName());
                }
                if (itemsBeen.size()>=7){
                    tv_nine.setText("     "+itemsBeen.get(6).getName());
                }
                if (itemsBeen.size()>=8){
                    tv_ten.setText("     "+itemsBeen.get(7).getName());
                }

                tv_two.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popupWindow1.dismiss();
                        tv_buxian_two.setText(tv_two.getText().toString());
                        textView8.setVisibility(View.VISIBLE);
                    }
                });
                tv_three.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popupWindow1.dismiss();
                        tv_buxian_two.setText(tv_three.getText().toString());
                        textView8.setVisibility(View.VISIBLE);
                    }
                });
                tv_four.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popupWindow1.dismiss();
                        tv_buxian_two.setText(tv_four.getText().toString());
                        textView8.setVisibility(View.VISIBLE);
                    }
                });
                tv_five.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popupWindow1.dismiss();
                        tv_buxian_two.setText(tv_five.getText().toString());
                        textView8.setVisibility(View.VISIBLE);
                    }
                });
                tv_six.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popupWindow1.dismiss();
                        tv_buxian_two.setText(tv_six.getText().toString());
                        textView8.setVisibility(View.VISIBLE);
                    }
                });
                tv_seven.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popupWindow1.dismiss();
                        tv_buxian_two.setText(tv_seven.getText().toString());
                        textView8.setVisibility(View.VISIBLE);
                    }
                });
                tv_eight.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popupWindow1.dismiss();
                        tv_buxian_two.setText(tv_eight.getText().toString());
                        textView8.setVisibility(View.VISIBLE);
                    }
                });
                tv_nine.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popupWindow1.dismiss();
                        tv_buxian_two.setText(tv_nine.getText().toString());
                        textView8.setVisibility(View.VISIBLE);
                    }
                });
                tv_ten.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popupWindow1.dismiss();
                        tv_buxian_two.setText(tv_ten.getText().toString());
                        textView8.setVisibility(View.VISIBLE);
                    }
                });



                break;

            case R.id.rl_three:
                itemsBeen.clear();
                itemsBeen.addAll(items);

                popupWindow1.setTouchable(true);
                popupWindow1.setBackgroundDrawable(new ColorDrawable(0x00000000));
                popupWindow1.showAtLocation(LayoutInflater.from(BigOnClickActivity.this).inflate(R.layout.big, null), Gravity.TOP, 0, 0);
                popitem(inflate1);

                tv_one.setText(tv_jiage.getText().toString());
                tv_two.setText("     全部");

                if (itemsBeen.size()>=1){
                    tv_three.setText("     "+itemsBeen.get(0).getName());
                }
                if (itemsBeen.size()>=2){
                    tv_four.setText("     "+itemsBeen.get(1).getName());
                }
                if (itemsBeen.size()>=3){
                    tv_five.setText("     "+itemsBeen.get(2).getName());
                }
                if (itemsBeen.size()>=4){
                    tv_six.setText("     "+itemsBeen.get(3).getName());
                }
                if (itemsBeen.size()>=5){
                    tv_seven.setText("     "+itemsBeen.get(4).getName());
                }
                if (itemsBeen.size()>=6){
                    tv_eight.setText("     "+itemsBeen.get(5).getName());
                }
                if (itemsBeen.size()>=7){
                    tv_nine.setText("     "+itemsBeen.get(6).getName());
                }
                if (itemsBeen.size()>=8){
                    tv_ten.setText("     "+itemsBeen.get(7).getName());
                }

                tv_two.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popupWindow1.dismiss();
                        tv_buxian_three.setText(tv_two.getText().toString());
                        textView9.setVisibility(View.VISIBLE);
                    }
                });
                tv_three.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popupWindow1.dismiss();
                        tv_buxian_three.setText(tv_three.getText().toString());
                        textView9.setVisibility(View.VISIBLE);
                    }
                });
                tv_four.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popupWindow1.dismiss();
                        tv_buxian_three.setText(tv_four.getText().toString());
                        textView9.setVisibility(View.VISIBLE);
                    }
                });
                tv_five.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popupWindow1.dismiss();
                        tv_buxian_three.setText(tv_five.getText().toString());
                        textView9.setVisibility(View.VISIBLE);
                    }
                });
                tv_six.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popupWindow1.dismiss();
                        tv_buxian_three.setText(tv_six.getText().toString());
                        textView9.setVisibility(View.VISIBLE);
                    }
                });
                tv_seven.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popupWindow1.dismiss();
                        tv_buxian_three.setText(tv_seven.getText().toString());
                        textView9.setVisibility(View.VISIBLE);
                    }
                });
                tv_eight.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popupWindow1.dismiss();
                        tv_buxian_three.setText(tv_eight.getText().toString());
                        textView9.setVisibility(View.VISIBLE);
                    }
                });
                tv_nine.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popupWindow1.dismiss();
                        tv_buxian_three.setText(tv_nine.getText().toString());
                        textView9.setVisibility(View.VISIBLE);
                    }
                });
                tv_ten.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popupWindow1.dismiss();
                        tv_buxian_three.setText(tv_ten.getText().toString());
                        textView9.setVisibility(View.VISIBLE);
                    }
                });
                break;
            case R.id.rl_four:
                itemsBeen.clear();
                itemsBeen.addAll(items);

                popupWindow1.setTouchable(true);
                popupWindow1.setBackgroundDrawable(new ColorDrawable(0x00000000));
                popupWindow1.showAtLocation(LayoutInflater.from(BigOnClickActivity.this).inflate(R.layout.big, null), Gravity.TOP, 0, 0);
                popitem(inflate1);

                tv_one.setText(tv_zhekou.getText().toString());
                tv_two.setText("     全部");

                if (itemsBeen.size()>=1){
                    tv_three.setText("     "+itemsBeen.get(0).getName());
                }
                if (itemsBeen.size()>=2){
                    tv_four.setText("     "+itemsBeen.get(1).getName());
                }
                if (itemsBeen.size()>=3){
                    tv_five.setText("     "+itemsBeen.get(2).getName());
                }
                if (itemsBeen.size()>=4){
                    tv_six.setText("     "+itemsBeen.get(3).getName());
                }
                if (itemsBeen.size()>=5){
                    tv_seven.setText("     "+itemsBeen.get(4).getName());
                }
                if (itemsBeen.size()>=6){
                    tv_eight.setText("     "+itemsBeen.get(5).getName());
                }
                if (itemsBeen.size()>=7){
                    tv_nine.setText("     "+itemsBeen.get(6).getName());
                }
                if (itemsBeen.size()>=8){
                    tv_ten.setText("     "+itemsBeen.get(7).getName());
                }

                tv_two.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popupWindow1.dismiss();
                        tv_buxian_four.setText(tv_two.getText().toString());
                        textView10.setVisibility(View.VISIBLE);
                    }
                });
                tv_three.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popupWindow1.dismiss();
                        tv_buxian_four.setText(tv_three.getText().toString());
                        textView10.setVisibility(View.VISIBLE);
                    }
                });
                tv_four.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popupWindow1.dismiss();
                        tv_buxian_four.setText(tv_four.getText().toString());
                        textView10.setVisibility(View.VISIBLE);
                    }
                });
                tv_five.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popupWindow1.dismiss();
                        tv_buxian_four.setText(tv_five.getText().toString());
                        textView10.setVisibility(View.VISIBLE);
                    }
                });
                tv_six.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popupWindow1.dismiss();
                        tv_buxian_four.setText(tv_six.getText().toString());
                        textView10.setVisibility(View.VISIBLE);
                    }
                });
                tv_seven.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popupWindow1.dismiss();
                        tv_buxian_four.setText(tv_seven.getText().toString());
                        textView10.setVisibility(View.VISIBLE);
                    }
                });
                tv_eight.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popupWindow1.dismiss();
                        tv_buxian_four.setText(tv_eight.getText().toString());
                        textView10.setVisibility(View.VISIBLE);
                    }
                });
                tv_nine.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popupWindow1.dismiss();
                        tv_buxian_four.setText(tv_nine.getText().toString());
                        textView10.setVisibility(View.VISIBLE);
                    }
                });
                tv_ten.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popupWindow1.dismiss();
                        tv_buxian_four.setText(tv_ten.getText().toString());
                        textView10.setVisibility(View.VISIBLE);
                    }
                });
                break;
            case R.id.rl_five:
                itemsBeen.clear();
                itemsBeen.addAll(items);

                popupWindow1.setTouchable(true);
                popupWindow1.setBackgroundDrawable(new ColorDrawable(0x00000000));
                popupWindow1.showAtLocation(LayoutInflater.from(BigOnClickActivity.this).inflate(R.layout.big, null), Gravity.TOP, 0, 0);
                popitem(inflate1);

                tv_one.setText(tv_sexi.getText().toString());
                tv_two.setText("     全部");

                if (itemsBeen.size()>=1){
                    tv_three.setText("     "+itemsBeen.get(0).getName());
                }
                if (itemsBeen.size()>=2){
                    tv_four.setText("     "+itemsBeen.get(1).getName());
                }
                if (itemsBeen.size()>=3){
                    tv_five.setText("     "+itemsBeen.get(2).getName());
                }
                if (itemsBeen.size()>=4){
                    tv_six.setText("     "+itemsBeen.get(3).getName());
                }
                if (itemsBeen.size()>=5){
                    tv_seven.setText("     "+itemsBeen.get(4).getName());
                }
                if (itemsBeen.size()>=6){
                    tv_eight.setText("     "+itemsBeen.get(5).getName());
                }
                if (itemsBeen.size()>=7){
                    tv_nine.setText("     "+itemsBeen.get(6).getName());
                }
                if (itemsBeen.size()>=8){
                    tv_ten.setText("     "+itemsBeen.get(7).getName());
                }

                tv_two.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popupWindow1.dismiss();
                        tv_buxian_five.setText(tv_two.getText().toString());
                        textView11.setVisibility(View.VISIBLE);
                    }
                });
                tv_three.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popupWindow1.dismiss();
                        tv_buxian_five.setText(tv_three.getText().toString());
                        textView11.setVisibility(View.VISIBLE);
                    }
                });
                tv_four.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popupWindow1.dismiss();
                        tv_buxian_five.setText(tv_four.getText().toString());
                        textView11.setVisibility(View.VISIBLE);
                    }
                });
                tv_five.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popupWindow1.dismiss();
                        tv_buxian_five.setText(tv_five.getText().toString());
                        textView11.setVisibility(View.VISIBLE);
                    }
                });
                tv_six.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popupWindow1.dismiss();
                        tv_buxian_five.setText(tv_six.getText().toString());
                        textView11.setVisibility(View.VISIBLE);
                    }
                });
                tv_seven.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popupWindow1.dismiss();
                        tv_buxian_five.setText(tv_seven.getText().toString());
                        textView11.setVisibility(View.VISIBLE);
                    }
                });
                tv_eight.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popupWindow1.dismiss();
                        tv_buxian_five.setText(tv_eight.getText().toString());
                        textView11.setVisibility(View.VISIBLE);
                    }
                });
                tv_nine.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popupWindow1.dismiss();
                        tv_buxian_five.setText(tv_nine.getText().toString());
                        textView11.setVisibility(View.VISIBLE);
                    }
                });
                tv_ten.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popupWindow1.dismiss();
                        tv_buxian_five.setText(tv_ten.getText().toString());
                        textView11.setVisibility(View.VISIBLE);
                    }
                });
                break;

        }

    }

    private void popitem(View inflate1) {
        tv_one = inflate1.findViewById(R.id.tv_one);
        tv_one.setOnClickListener(this);
        tv_two = inflate1.findViewById(R.id.tv_two);
        tv_two.setOnClickListener(this);
        tv_three = inflate1.findViewById(R.id.tv_three);
        tv_three.setOnClickListener(this);
        tv_four = inflate1.findViewById(R.id.tv_four);
        tv_four.setOnClickListener(this);
        tv_five = inflate1.findViewById(R.id.tv_five);
        tv_five.setOnClickListener(this);
        tv_six = inflate1.findViewById(R.id.tv_six);
        tv_six.setOnClickListener(this);
        tv_seven = inflate1.findViewById(R.id.tv_seven);
        tv_seven.setOnClickListener(this);
        tv_eight = inflate1.findViewById(R.id.tv_eight);
        tv_eight.setOnClickListener(this);
        tv_nine = inflate1.findViewById(R.id.tv_nine);
        tv_nine.setOnClickListener(this);
        tv_ten = inflate1.findViewById(R.id.tv_ten);
        tv_ten.setOnClickListener(this);
    }

    private void pop(View inflate) {
        //                Toast.makeText(this, "傻逼啊", Toast.LENGTH_SHORT).show();
        textView7 = (TextView) inflate.findViewById(R.id.textView7);
        textView7.setOnClickListener(this);
        tv_clear = (TextView) inflate.findViewById(R.id.tv_clear);
        tv_clear.setOnClickListener(this);
        tv_fenlei = (TextView)inflate. findViewById(R.id.tv_fenlei);
        tv_fenlei.setOnClickListener(this);
        tv_buxian_one = (TextView) inflate.findViewById(R.id.tv_buxian_one);
        tv_buxian_one.setOnClickListener(this);
        iv_jinru_one = (ImageView) inflate.findViewById(R.id.iv_jinru_one);
        iv_jinru_one.setOnClickListener(this);
        tv_pinpai = (TextView) inflate.findViewById(R.id.tv_pinpai);
        tv_pinpai.setOnClickListener(this);
        tv_buxian_two = (TextView) inflate.findViewById(R.id.tv_buxian_two);
        tv_buxian_two.setOnClickListener(this);
        iv_jinru_two = (ImageView)inflate. findViewById(R.id.iv_jinru_two);
        iv_jinru_two.setOnClickListener(this);
        tv_jiage = (TextView) inflate.findViewById(R.id.tv_jiage);
        tv_jiage.setOnClickListener(this);
        tv_buxian_three = (TextView) inflate.findViewById(R.id.tv_buxian_three);
        tv_buxian_three.setOnClickListener(this);
        iv_jinru_three = (ImageView)inflate. findViewById(R.id.iv_jinru_three);
        iv_jinru_three.setOnClickListener(this);
        tv_zhekou = (TextView)inflate. findViewById(R.id.tv_zhekou);
        tv_zhekou.setOnClickListener(this);
        tv_buxian_four = (TextView)inflate. findViewById(R.id.tv_buxian_four);
        tv_buxian_four.setOnClickListener(this);
        iv_jinru_four = (ImageView)inflate. findViewById(R.id.iv_jinru_four);
        iv_jinru_four.setOnClickListener(this);
        bt_queding = (Button) inflate.findViewById(R.id.bt_queding);
        bt_queding.setOnClickListener(this);
        linearLayout5 = (LinearLayout)inflate. findViewById(R.id.linearLayout5);
        linearLayout5.setOnClickListener(this);
        tv_tiqi = (TextView)inflate. findViewById(R.id.tv_tiqi);
        tv_tiqi.setOnClickListener(this);
        rl_five = inflate.findViewById(R.id.rl_five);
        rl_five.setOnClickListener(this);
        rl_one = inflate.findViewById(R.id.rl_one);

        rl_two = inflate.findViewById(R.id.rl_two);
        rl_two.setOnClickListener(this);
        rl_three = inflate.findViewById(R.id.rl_three);
        rl_three.setOnClickListener(this);
        rl_four = inflate.findViewById(R.id.rl_four);
        rl_four.setOnClickListener(this);
        tv_sexi = inflate.findViewById(R.id.tv_sexi);
        textView6 = inflate.findViewById(R.id.textView6);
        textView8 = inflate.findViewById(R.id.textView8);
        textView9 = inflate.findViewById(R.id.textView9);
        textView10 = inflate.findViewById(R.id.textView10);
        textView11 = inflate.findViewById(R.id.textView11);
        tv_buxian_five = inflate.findViewById(R.id.tv_buxian_five);

    }

    private static long back_pressed = 0;



    @Override
    public void success(BigOnClickBean bigOnClickBean) {
        List<BigOnClickBean.DataBean.FilterGroupBean> filter_group = bigOnClickBean.getData().getFilter_group();

            tv_fenlei.setText(filter_group.get(0).getTitle());
             items = filter_group.get(0).getItems();
        Toast.makeText(this, items.get(0).getCount(), Toast.LENGTH_SHORT).show();
        iv_jinru_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupWindow.dismiss();
                Toast.makeText(BigOnClickActivity.this, "zoua ", Toast.LENGTH_SHORT).show();
                itemsBeen.clear();
                itemsBeen.addAll(items);

                popupWindow1.setTouchable(true);
                popupWindow1.setBackgroundDrawable(new ColorDrawable(0x00000000));
                popupWindow1.showAtLocation(LayoutInflater.from(BigOnClickActivity.this).inflate(R.layout.big, null), Gravity.TOP, 0, 0);
                popitem(inflate1);

                tv_one.setText(tv_fenlei.getText().toString());
                tv_two.setText("     全部");

                if (itemsBeen.size()>=1){
                    tv_three.setText("     "+itemsBeen.get(0).getName());
                }
                if (itemsBeen.size()>=2){
                    tv_four.setText("     "+itemsBeen.get(1).getName());
                }
                if (itemsBeen.size()>=3){
                    tv_five.setText("     "+itemsBeen.get(2).getName());
                }
                if (itemsBeen.size()>=4){
                    tv_six.setText("     "+itemsBeen.get(3).getName());
                }
                if (itemsBeen.size()>=5){
                    tv_seven.setText("     "+itemsBeen.get(4).getName());
                }
                if (itemsBeen.size()>=6){
                    tv_eight.setText("     "+itemsBeen.get(5).getName());
                }
                if (itemsBeen.size()>=7){
                    tv_nine.setText("     "+itemsBeen.get(6).getName());
                }
                if (itemsBeen.size()>=8){
                    tv_ten.setText("     "+itemsBeen.get(7).getName());
                }

                tv_two.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popupWindow1.dismiss();
                        tv_buxian_one.setText(tv_two.getText().toString());
                        textView6.setVisibility(View.VISIBLE);
                    }
                });
                tv_three.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popupWindow1.dismiss();
                        tv_buxian_one.setText(tv_three.getText().toString());
                        textView6.setVisibility(View.VISIBLE);
                    }
                });
                tv_four.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popupWindow1.dismiss();
                        tv_buxian_one.setText(tv_four.getText().toString());
                        textView6.setVisibility(View.VISIBLE);
                    }
                });
                tv_five.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popupWindow1.dismiss();
                        tv_buxian_one.setText(tv_five.getText().toString());
                        textView6.setVisibility(View.VISIBLE);
                    }
                });
                tv_six.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popupWindow1.dismiss();
                        tv_buxian_one.setText(tv_six.getText().toString());
                        textView6.setVisibility(View.VISIBLE);
                    }
                });
                tv_seven.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popupWindow1.dismiss();
                        tv_buxian_one.setText(tv_seven.getText().toString());
                        textView6.setVisibility(View.VISIBLE);
                    }
                });
                tv_eight.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popupWindow1.dismiss();
                        tv_buxian_one.setText(tv_eight.getText().toString());
                        textView6.setVisibility(View.VISIBLE);
                    }
                });
                tv_nine.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popupWindow1.dismiss();
                        tv_buxian_one.setText(tv_nine.getText().toString());
                        textView6.setVisibility(View.VISIBLE);
                    }
                });
                tv_ten.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popupWindow1.dismiss();
                        tv_buxian_one.setText(tv_ten.getText().toString());
                        textView6.setVisibility(View.VISIBLE);
                    }
                });


            }
        });

        tv_pinpai.setText(filter_group.get(1).getTitle());
        items1 = filter_group.get(1).getItems();
        tv_jiage.setText(filter_group.get(2).getTitle());
        items2 = filter_group.get(2).getItems();
            tv_zhekou.setText(filter_group.get(3).getTitle());
        items3 = filter_group.get(3).getItems();
        if (filter_group.size()>=5){
            rl_five.setVisibility(View.VISIBLE);
            tv_sexi.setText(filter_group.get(4).getTitle());
            items4 = filter_group.get(4).getItems();
        }
        List<BigOnClickBean.DataBean.ProductListBean> product_list = bigOnClickBean.getData().getProduct_list();


    }

    @Override
    public void deteat(String s) {
        Log.e("TAG====",s);
    }
}
