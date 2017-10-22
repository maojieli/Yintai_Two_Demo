package com.jiyun.asus.yintai_two_demo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jiyun.asus.yintai_two_demo.Fragments.homepage.SysApplication;

public class MainActivity extends AppCompatActivity {

    private Handler handler=new Handler();
    private static final String MYSP = "yitai";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SysApplication.getInstance().addActivity(this);
        setContentView(R.layout.activity_main);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                SharedPreferences preferences = getSharedPreferences(MYSP, MODE_PRIVATE);
                int count = preferences.getInt("Count", 0);
                if (count==0){
                    startActivity(new Intent(MainActivity.this,BannerActivity.class));
                }else {
                    startActivity(new Intent(MainActivity.this,OverallActivity.class));
                }
            }
        },2000);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        SysApplication.getInstance().exit();
    }
}
