package com.jiyun.asus.yintai_two_demo.Fragments.homepage.bigonclick;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.jiyun.asus.yintai_two_demo.Fragments.homepage.SysApplication;
import com.jiyun.asus.yintai_two_demo.OverallActivity;
import com.jiyun.asus.yintai_two_demo.R;

public class BigOnClickActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView iv_big_break;
    private TextView tv_big_name;
    private ImageView iv_big_fenxiang;
    private TextView tv_xiaoliang;
    private LinearLayout ll_price;
    private TextView tv_time;
    private ImageView iv_bianhua;
    private RecyclerView rv_big;
    private ListView lv_big;
    private int num ;
    private int sax;
    private TextView bt_price;

    private ImageView iv_price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SysApplication.getInstance().addActivity(this);
        setContentView(R.layout.big);
        initView();
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
    private static final Integer[] imagelist={R.drawable.product_blackbar_unselected,R.drawable.product_blackbar_top,R.drawable.product_blackbar_bottom};
    private static  final Integer[] image={R.drawable.a1,R.drawable.productlist_sort_showtype_double};
    //用来显示图片
    public View makeView(){
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

                break;
            case R.id.bt_price:
//                Toast.makeText(this, num+"bt_price"+imagelist.length, Toast.LENGTH_SHORT).show();
                // TODO Auto-generated method stub
                num++;
                if(num>=imagelist.length){
                    num=0;
                }else if (num>=imagelist.length){
                    num=0;
                }

                iv_price.setImageResource(imagelist[num]);

                break;
            case R.id.iv_price:
//                Toast.makeText(this, num+"iv_price"+imagelist.length, Toast.LENGTH_SHORT).show();
                // TODO Auto-generated method stub
                num++;
                if(num>=imagelist.length){
                    num=0;
                }else if (num>=imagelist.length){
                    num=0;
                }

                iv_price.setImageResource(imagelist[num]);
                break;
            case R.id.iv_bianhua:
//                Toast.makeText(this, num+"bt_price"+image.length, Toast.LENGTH_SHORT).show();
                // TODO Auto-generated method stub
                sax++;
                if(sax>=image.length){
                    sax=0;
                }else if (sax>=image.length){
                    sax=0;
                }

                iv_bianhua.setImageResource(image[sax]);
                break;

        }

    }

    private static long back_pressed = 0;

    @Override
    public void onBackPressed() {
        if (back_pressed + 2000 > System.currentTimeMillis()) {
            SysApplication.getInstance().exit();
            super.onBackPressed();
//        System.exit(0);

        } else {
            Toast.makeText(this, "再按一次退出", Toast.LENGTH_SHORT).show();
            back_pressed = System.currentTimeMillis();

        }
    }
}
