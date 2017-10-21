package com.jiyun.asus.yintai_two_demo.Fragments.Beat;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.jiyun.asus.yintai_two_demo.Fragments.Beat.BeatBean.BeatBean;
import com.jiyun.asus.yintai_two_demo.Fragments.Beat.BeatBean.JumpBean;
import com.jiyun.asus.yintai_two_demo.R;
import com.jiyun.asus.yintai_two_demo.Utils.CustomViewPager;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class BeatJumpActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView iv_back_jump;
    private TextView tv_name_top_jump;
    private Button bu_count_jump;
    private Button bu_price_jump;
    private Button bu_discount_jump;
    private CustomViewPager cvp_jump;
    private TextView tv_time_jump;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        EventBus.getDefault().register(this);
        setContentView(R.layout.activity_beat_jump);
        initView();
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

    @Subscribe(threadMode = ThreadMode.POSTING)
    public void getJump(JumpBean jumpBean) {

        int id = jumpBean.getId();
        Log.e("BeatJumpActivity", id + "");
        List<BeatBean.DataBean.ActivityinfoBean.ActivitylistBean> list = jumpBean.getList();
        String name = list.get(id).getName();
        Log.e("BeatJumpActivity", name);
        tv_name_top_jump.setText(name);

        //获取当前时间
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format1 = df.format(new Date());
        //结束时间
        String endtime = list.get(id).getEndtime();
        String[] ts = endtime.split("T");

        String t = ts[0];
        String t1 = ts[1];
        String t2 = " ";
        String t3 = t + t2 + t1;
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date firstDateTimeDate = format.parse(format1);
            Date secondDateTimeDate = format.parse(t3);
            long firstDateMilliSeconds = firstDateTimeDate.getTime();
            long secondDateMilliSeconds = secondDateTimeDate.getTime();
            long subDateMilliSeconds = secondDateMilliSeconds - firstDateMilliSeconds;
            int totalSeconds = (int) (subDateMilliSeconds / 1000);

            int days_remains = totalSeconds / (3600 * 24);
            int hours = days_remains / 3600;
            int hours_remains = days_remains % 3600;
            int minutes = hours_remains / 60;
            int seconds = hours_remains % 60;

            String outTime = ((hours < 10) ? "0" : "") + hours + ":" +
                    ((minutes < 10) ? "0" : "") + minutes + ":" +
                    ((seconds < 10) ? "0" : "") + seconds;
            Log.e("BeatJumpActivity", outTime);
            tv_time_jump.setText(outTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
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
}
