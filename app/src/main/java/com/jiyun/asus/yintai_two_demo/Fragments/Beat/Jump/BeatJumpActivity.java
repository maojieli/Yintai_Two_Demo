package com.jiyun.asus.yintai_two_demo.Fragments.Beat;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.jiyun.asus.yintai_two_demo.Fragments.Beat.BeatBean.BeatBean;
import com.jiyun.asus.yintai_two_demo.Fragments.Beat.BeatBean.JumpBean;
import com.jiyun.asus.yintai_two_demo.Fragments.Beat.BeatBean.MeiZhuangBean;
import com.jiyun.asus.yintai_two_demo.Http.Presenter.MyPresenter;
import com.jiyun.asus.yintai_two_demo.Http.View.MyView;
import com.jiyun.asus.yintai_two_demo.Http.tools.BaseParams;
import com.jiyun.asus.yintai_two_demo.Http.tools.Concat;
import com.jiyun.asus.yintai_two_demo.Http.tools.Tools;
import com.jiyun.asus.yintai_two_demo.R;
import com.jiyun.asus.yintai_two_demo.Utils.CustomViewPager;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BeatJumpActivity extends AppCompatActivity implements View.OnClickListener, MyView<MeiZhuangBean> {

    private ImageView iv_back_jump;
    private TextView tv_name_top_jump;
    private Button bu_count_jump;
    private Button bu_price_jump;
    private Button bu_discount_jump;
    private CustomViewPager cvp_jump;
    private TextView tv_time_jump;
    private int bargainid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        EventBus.getDefault().register(this);
        setContentView(R.layout.activity_beat_jump);
        bargainid = getIntent().getIntExtra("bargainid", 0);
        initView();
        innidata();
    }

    private void initView() {
        iv_back_jump = (ImageView) findViewById(R.id.iv_back_jump);
        tv_name_top_jump = (TextView) findViewById(R.id.tv_name_top_jump);
        bu_count_jump = (Button) findViewById(R.id.bu_count_jump);
        bu_price_jump = (Button) findViewById(R.id.bu_price_jump);
        bu_discount_jump = (Button) findViewById(R.id.bu_discount_jump);
        cvp_jump = (CustomViewPager) findViewById(R.id.cvp_jump);
        tv_time_jump = (TextView) findViewById(R.id.tv_time_jump);
        cvp_jump.setScanScroll(false);
        bu_count_jump.setOnClickListener(this);
        bu_price_jump.setOnClickListener(this);
        bu_discount_jump.setOnClickListener(this);
    }


    public void innidata() {
        MyPresenter presenter = new MyPresenter(this);
        Map<String, String> httpParams = Tools.getHttpParams(BeatJumpActivity.this);
        BaseParams.getParams(httpParams, BeatJumpActivity.this);
        httpParams.put("ver", "3.0");
        httpParams.put("method", "products.getlimitlist");
        httpParams.put("page_index", "1");
        httpParams.put("order_type", "5");
        httpParams.put("query_string", "");
        httpParams.put("displaycount", "12");
        httpParams.put("bargainid", "" + bargainid);


        Map<String, String> stringStringHashMap = Tools.signBusinessParameter(BeatJumpActivity.this, (HashMap<String, String>) httpParams);
        presenter.quest(Concat.NETURL, MeiZhuangBean.class, stringStringHashMap);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bu_count_jump:

                break;
            case R.id.bu_price_jump:

                break;
            case R.id.bu_discount_jump:

                break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    @Override
    public void success(MeiZhuangBean meiZhuangBean) {
        String barginname = meiZhuangBean.getData().getBarginname();
       tv_name_top_jump.setText(barginname);
        meiZhuangBean.getData().get
    }

    @Override
    public void defeat(String s) {

    }
}
