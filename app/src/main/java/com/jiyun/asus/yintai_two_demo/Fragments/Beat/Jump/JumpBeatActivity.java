package com.jiyun.asus.yintai_two_demo.Fragments.Beat.Jump;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.jiyun.asus.yintai_two_demo.Fragments.Beat.Jump.Adapters.JumpCvpAdapter;
import com.jiyun.asus.yintai_two_demo.Fragments.Beat.Jump.Fragments.PriceFragment;
import com.jiyun.asus.yintai_two_demo.Fragments.Beat.Jump.Fragments.ReductionFragment;
import com.jiyun.asus.yintai_two_demo.Fragments.Beat.Jump.Fragments.SalesVolume;
import com.jiyun.asus.yintai_two_demo.OverallActivity;
import com.jiyun.asus.yintai_two_demo.R;

import java.util.ArrayList;
import java.util.List;

public class JumpBeatActivity extends AppCompatActivity implements View.OnClickListener {


    private ImageView iv_jump_back;
    private TextView tv_jump_top_name;
    private Button bu_sale;
    private Button bu_price;
    private Button bu_reduction;
    private FrameLayout cvp_jump_beat;
    private FragmentTransaction fragmentTransaction;
    private SalesVolume salesVolume;
    private PriceFragment priceFragment;
    private ReductionFragment reductionFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jump_beat);
        String name = getIntent().getStringExtra("name");
        initView();

        tv_jump_top_name.setText(name);


        int index = getIntent().getIntExtra("index", 0);
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
        iv_jump_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(JumpBeatActivity.this, OverallActivity.class));
            }
        });
    }

    private void initView() {

        iv_jump_back = (ImageView) findViewById(R.id.iv_jump_back);
        iv_jump_back.setOnClickListener(this);
        tv_jump_top_name = (TextView) findViewById(R.id.tv_jump_top_name);
        tv_jump_top_name.setOnClickListener(this);
        bu_sale = (Button) findViewById(R.id.bu_sale);
        bu_sale.setOnClickListener(this);
        bu_price = (Button) findViewById(R.id.bu_price);
        bu_price.setOnClickListener(this);
        bu_reduction = (Button) findViewById(R.id.bu_reduction);
        bu_reduction.setOnClickListener(this);
        cvp_jump_beat = (FrameLayout) findViewById(R.id.cvp_jump_beat);
        cvp_jump_beat.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager = getFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        switch (v.getId()) {
            case R.id.bu_sale:
                fragmentTransaction.replace(R.id.cvp_jump_beat, salesVolume);
                fragmentTransaction.commit();
                break;
            case R.id.bu_price:
                fragmentTransaction.replace(R.id.cvp_jump_beat, priceFragment);
                fragmentTransaction.commit();
                break;
            case R.id.bu_reduction:
                fragmentTransaction.replace(R.id.cvp_jump_beat, reductionFragment);
                fragmentTransaction.commit();
                break;
        }
    }
}
