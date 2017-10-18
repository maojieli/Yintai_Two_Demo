package com.jiyun.asus.yintai_two_demo.Fragments.homepage.searchforgoods;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.EditText;
import android.widget.TextView;

import com.jiyun.asus.yintai_two_demo.R;

public class SearchActivity extends AppCompatActivity {

    private Toolbar tb_too_sear;
    private EditText et_search;
    private TextView tv_quxiao;
    private TabLayout tab_lay_search;
    private ViewPager vp_search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        initView();
    }

    private void initView() {
        tb_too_sear = (Toolbar) findViewById(R.id.tb_too_sear);
        et_search = (EditText) findViewById(R.id.et_search);
        tv_quxiao = (TextView) findViewById(R.id.tv_quxiao);
        tab_lay_search = (TabLayout) findViewById(R.id.tab_lay_search);
        vp_search = (ViewPager) findViewById(R.id.vp_search);
    }


}
