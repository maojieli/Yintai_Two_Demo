package com.jiyun.asus.yintai_two_demo.Fragments.homepage.webview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.jiyun.asus.yintai_two_demo.OverallActivity;
import com.jiyun.asus.yintai_two_demo.R;

public class WebActivity extends AppCompatActivity implements View.OnClickListener {

    private WebView rv_same;
    private SwipeRefreshLayout swr_same;
    private TextView textView7;
    private ImageView iv_same_break;
    private ImageView iv_fenxiang;
    private RelativeLayout rv;
    private ProgressBar progressbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_same);
        initView();
        Intent intent = getIntent();
        final String url = intent.getStringExtra("url");
        Log.e("URL", url);
        geturl(url);


        swr_same.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                swr_same.setRefreshing(true);
                geturl(url);
                swr_same.setRefreshing(false);
            }
        });
    }

    private void geturl(String url) {
        //获取一个webviewsetting对象
        WebSettings setting = rv_same.getSettings();
        //支持JavaScript
        setting.setJavaScriptEnabled(true);
        //显示缩放控制工具
        setting.setDisplayZoomControls(true);
        //设置webview支持缩放
        setting.setSupportZoom(true);
        setting.setBuiltInZoomControls(true);
        //设置加载进来的页面自适应手机屏幕
        //设置缓存
        setting.setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        //设置适应Html5的一些方法
        setting.setDomStorageEnabled(true);
        setting.setUseWideViewPort(true);
        setting.setLoadWithOverviewMode(true);
        rv_same.setWebChromeClient(new WebChromeClient());
        rv_same.setWebViewClient(new WebViewClient());
//        rv_same.getSettings().setJavaScriptEnabled(true);
        rv_same.loadUrl(url);
//        WebSettings settings = rv_same.getSettings();
//        settings.setJavaScriptEnabled(true);
        rv_same.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
        rv_same.setWebChromeClient(new WebChromeClient() {
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                if (newProgress == 100) {
                    progressbar.setVisibility(View.GONE);//加载完网页进度条消失
                } else {
                    progressbar.setVisibility(View.VISIBLE);//开始加载网页时显示进度条
                    progressbar.setProgress(newProgress);//设置进度值
                }

            }
        });
    }


    private void initView() {
        rv_same = (WebView) findViewById(R.id.rv_same);
        swr_same = (SwipeRefreshLayout) findViewById(R.id.swr_same);
        textView7 = (TextView) findViewById(R.id.textView7);

        iv_same_break = (ImageView) findViewById(R.id.iv_same_break);
        iv_same_break.setOnClickListener(this);
        iv_fenxiang = (ImageView) findViewById(R.id.iv_fenxiang);
        iv_fenxiang.setOnClickListener(this);
        rv = (RelativeLayout) findViewById(R.id.rv);
        rv.setOnClickListener(this);
        progressbar = (ProgressBar) findViewById(R.id.progressbar);
        progressbar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_same_break:
                Intent intent = new Intent(WebActivity.this, OverallActivity.class);
                intent.putExtra("num", 1);
                startActivity(intent);
                break;
            case R.id.iv_fenxiang:
                Toast.makeText(this, "友盟", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
