package com.jiyun.asus.yintai_two_demo.Fragments.Beat.Jump;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.jiyun.asus.yintai_two_demo.Fragments.Beat.Jump.Adapters.JumpCvpAdapter;
import com.jiyun.asus.yintai_two_demo.Fragments.Beat.Jump.Fragments.PriceFragment;
import com.jiyun.asus.yintai_two_demo.Fragments.Beat.Jump.Fragments.ReductionFragment;
import com.jiyun.asus.yintai_two_demo.Fragments.Beat.Jump.Fragments.SalesVolume;
import com.jiyun.asus.yintai_two_demo.OverallActivity;
import com.jiyun.asus.yintai_two_demo.R;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class JumpBeatActivity extends AppCompatActivity implements View.OnClickListener {


    private ImageView iv_jump_back;
    private TextView tv_jump_top_name;
    private FragmentTransaction fragmentTransaction;
    private SalesVolume salesVolume;
    private PriceFragment priceFragment;
    private ReductionFragment reductionFragment;
    private TextView tv_time_jump;
    private ImageView iv_top_right_jump;
    private RelativeLayout rl_sale_jump;
    private ImageView iv_price_jump;
    private ImageView iv_reduction_jump;
    private int index;
    int a = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jump_beat);

        initView();
        //获取传值
        index = getIntent().getIntExtra("index", 0);
        String name = getIntent().getStringExtra("name");
        String endtime = getIntent().getStringExtra("endtime");


        tv_jump_top_name.setText(name);
        String[] ts = endtime.split("T");
        String t = ts[0];
        String t1 = ts[1];
        String t2 = " ";
        final String t3 = t + t2 + t1;
        TimerTask task = new TimerTask() {
            public void run() {

                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String beginTime = simpleDateFormat.format(new Date());
                DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Date firstDateTimeDate = null;
                try {
                    firstDateTimeDate = format.parse(t3);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                Date secondDateTimeDate = null;
                try {
                    secondDateTimeDate = format.parse(beginTime);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                //得到两个日期对象的总毫秒数
                long firstDateMilliSeconds = firstDateTimeDate.getTime();
                long secondDateMilliSeconds = secondDateTimeDate.getTime();

                //得到两者之差
                long firstMinusSecond = firstDateMilliSeconds - secondDateMilliSeconds;

                //毫秒转为秒
                long milliSeconds = firstMinusSecond;
                int totalSeconds = (int) (milliSeconds / 1000);

                //得到总天数
                int days = totalSeconds / (3600 * 24);
                int days_remains = totalSeconds % (3600 * 24);

                //得到总小时数
                int hours = days_remains / 3600;
                int remains_hours = days_remains % 3600;

                //得到分种数
                int minutes = remains_hours / 60;

                //得到总秒数
                int seconds = remains_hours % 60;

                final String s = "倒计时:" + days + "天" + hours + ":" + minutes + ":" + seconds;


                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        tv_time_jump.setText(s);
                    }
                });


            }
        };
        Timer timer = new Timer();
        timer.schedule(task, 0, 1000);


        Bundle bundle = new Bundle();
        bundle.putInt("id", index);
        //销售
        salesVolume = new SalesVolume(JumpBeatActivity.this);
        salesVolume.setArguments(bundle);
        //价格
        priceFragment = new PriceFragment(JumpBeatActivity.this);
        priceFragment.setArguments(bundle);
        //折扣
        reductionFragment = new ReductionFragment(JumpBeatActivity.this);
        reductionFragment.setArguments(bundle);

    }

    private void initView() {

        iv_jump_back = (ImageView) findViewById(R.id.iv_jump_back);
        iv_jump_back.setOnClickListener(this);
        tv_jump_top_name = (TextView) findViewById(R.id.tv_jump_top_name);
        tv_jump_top_name.setOnClickListener(this);

        tv_jump_top_name.setSelected(true);
        //倒计时
        tv_time_jump = (TextView) findViewById(R.id.tv_time_jump);
        //头部右边图片
        iv_top_right_jump = (ImageView) findViewById(R.id.iv_top_right_jump);
        iv_top_right_jump.setOnClickListener(this);
        //销量
        rl_sale_jump = (RelativeLayout) findViewById(R.id.rl_sale_jump);
        rl_sale_jump.setOnClickListener(this);
        //价格
        RelativeLayout rl_price_jump = (RelativeLayout) findViewById(R.id.rl_price_jump);
        rl_price_jump.setOnClickListener(this);
        //折扣
        RelativeLayout rl_reduction_jump = (RelativeLayout) findViewById(R.id.rl_reduction_jump);
        rl_reduction_jump.setOnClickListener(this);

        iv_price_jump = (ImageView) findViewById(R.id.iv_price_jump);
        iv_reduction_jump = (ImageView) findViewById(R.id.iv_reduction_jump);


    }

    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager = getFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        Bundle bundle = new Bundle();
        bundle.putInt("id", index);

        switch (v.getId()) {
            //销量页面
            case R.id.rl_sale_jump:
                //销售
                salesVolume = new SalesVolume(JumpBeatActivity.this);
                salesVolume.setArguments(bundle);
                fragmentTransaction.replace(R.id.cvp_jump_beat, salesVolume);
                fragmentTransaction.commit();
                break;
            //价格页面
            case R.id.rl_price_jump:
                int i = a++;
                priceFragment = new PriceFragment(JumpBeatActivity.this);
                if (i % 2 == 0) {
                    bundle.putString("order_type", "3");
                    iv_price_jump.setImageResource(R.mipmap.product_blackbar1);
                    priceFragment.setArguments(bundle);
                    fragmentTransaction.replace(R.id.cvp_jump_beat, priceFragment);
                    fragmentTransaction.commit();
                } else {
                    iv_price_jump.setImageResource(R.mipmap.product_blackbar2);
                    bundle.putString("order_type", "4");
                    priceFragment.setArguments(bundle);
                    fragmentTransaction.replace(R.id.cvp_jump_beat, priceFragment);
                    fragmentTransaction.commit();
                }
                //价格

                break;
            //折扣页面
            case R.id.rl_reduction_jump:
                //折扣
                int i2 = a++;
                reductionFragment = new ReductionFragment(JumpBeatActivity.this);
                if (i2 % 2 == 0) {
                    bundle.putString("order_type", "2");
                    iv_reduction_jump.setImageResource(R.mipmap.product_blackbar1);
                    reductionFragment.setArguments(bundle);
                    fragmentTransaction.replace(R.id.cvp_jump_beat, reductionFragment);
                    fragmentTransaction.commit();
                } else {
                    bundle.putString("order_type", "1");
                    iv_reduction_jump.setImageResource(R.mipmap.product_blackbar2);
                    reductionFragment.setArguments(bundle);
                    fragmentTransaction.replace(R.id.cvp_jump_beat, reductionFragment);
                    fragmentTransaction.commit();
                }


                break;
            //右侧显示popu
            case R.id.iv_top_right_jump:
                //显示POPU
                View contentView = LayoutInflater.from(JumpBeatActivity.this).inflate(R.layout.popu_jump, null);
                PopupWindow mPopupWindow = new PopupWindow(contentView, LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
                mPopupWindow.setAnimationStyle(R.style.PopupAnimation);
                mPopupWindow.setBackgroundDrawable(JumpBeatActivity.this.getResources().getDrawable(R.color.transparent));
                mPopupWindow.setOutsideTouchable(true);
                mPopupWindow.setFocusable(true);
                mPopupWindow.setInputMethodMode(PopupWindow.INPUT_METHOD_NOT_NEEDED);
                View view = LayoutInflater.from(JumpBeatActivity.this).inflate(R.layout.activity_jump_beat, null);
                mPopupWindow.showAtLocation(view, Gravity.BOTTOM, 0, 0);
                break;
            //左侧回退页面
            case R.id.iv_jump_back:
                startActivity(new Intent(JumpBeatActivity.this, OverallActivity.class));
                break;
        }
    }
}
