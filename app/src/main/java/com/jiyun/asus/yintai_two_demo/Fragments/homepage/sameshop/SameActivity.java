package com.jiyun.asus.yintai_two_demo.Fragments.homepage.sameshop;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.jiyun.asus.yintai_two_demo.MainActivity;
import com.jiyun.asus.yintai_two_demo.OverallActivity;
import com.jiyun.asus.yintai_two_demo.R;

public class SameActivity extends AppCompatActivity implements View.OnClickListener {

    private RecyclerView rv_same;
    private SwipeRefreshLayout swr_same;
    private TextView textView7;
    private ImageView iv_same_break;
    private ImageView iv_fenxiang;
    private RelativeLayout rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_same);
        initView();

    }

    private void initView() {
        rv_same = (RecyclerView) findViewById(R.id.rv_same);
        swr_same = (SwipeRefreshLayout) findViewById(R.id.swr_same);
        textView7 = (TextView) findViewById(R.id.textView7);

        iv_same_break = (ImageView) findViewById(R.id.iv_same_break);
        iv_same_break.setOnClickListener(this);
        iv_fenxiang = (ImageView) findViewById(R.id.iv_fenxiang);
        iv_fenxiang.setOnClickListener(this);
        rv = (RelativeLayout) findViewById(R.id.rv);
        rv.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.iv_same_break:
                Intent intent = new Intent(SameActivity.this, OverallActivity.class);
                intent.putExtra("num",1);
                startActivity(intent);
                break;
            case R.id.iv_fenxiang:
                Toast.makeText(this, "友盟", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
