package com.jiyun.asus.yintai_two_demo.Fragments.homepage.searchforgoods;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;


import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.jiyun.asus.yintai_two_demo.Fragments.homepage.searchforgoods.adapter.SearchAdapter;
import com.jiyun.asus.yintai_two_demo.Fragments.homepage.searchforgoods.bean.SearchBean;
import com.jiyun.asus.yintai_two_demo.Fragments.homepage.searchforgoods.fragments.Search_One;
import com.jiyun.asus.yintai_two_demo.Fragments.homepage.searchforgoods.fragments.Search_Two;
import com.jiyun.asus.yintai_two_demo.Http.Presenter.MyPresenter;
import com.jiyun.asus.yintai_two_demo.Http.View.MyView;
import com.jiyun.asus.yintai_two_demo.Http.tools.BaseParams;
import com.jiyun.asus.yintai_two_demo.Http.tools.Concat;
import com.jiyun.asus.yintai_two_demo.Http.tools.Tools;
import com.jiyun.asus.yintai_two_demo.OverallActivity;
import com.jiyun.asus.yintai_two_demo.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static android.support.coreui.BuildConfig.DEBUG;


public class SearchActivity extends AppCompatActivity implements MyView<SearchBean>, TextWatcher, View.OnClickListener {

    private CharSequence temp;//监听前的文本
    private int editStart;//光标开始位置
    private int editEnd;//光标结束位置
    private final int charMaxNum = 10;

    private RelativeLayout relativeLayout;
    private EditText et_search;
    private TextView tv_quxiao;

    private MyPresenter myPresenter;
    private ArrayList<SearchBean.DataBean> dataBeen;
    private SearchAdapter searchAdapter;

    private Button bt_one;
    private Button bt_two;
    private LinearLayout tb_tab_search;
    private FrameLayout fl;
    private Search_One search_one;
    private Search_Two search_two;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        initView();
        myPresenter = new MyPresenter(this);
        Map<String, String> httpParams = Tools.getHttpParams(this);
        BaseParams.getParams(httpParams, this);
        httpParams.put("ver", "1.2");
        httpParams.put("method", "products.GetSearchPage");
        httpParams.put("pageid", "104001");
        httpParams.put("pageindex", "1");
        HashMap<String, String> stringStringHashMap = Tools.signBusinessParameter(this, (HashMap<String, String>) httpParams);
        myPresenter.quest(stringStringHashMap);
        dataBeen = new ArrayList<>();




    }


    private void initView() {
        relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        et_search = (EditText) findViewById(R.id.et_search);
        tv_quxiao = (TextView) findViewById(R.id.tv_quxiao);
        tv_quxiao.setOnClickListener(this);
        fl = (FrameLayout) findViewById(R.id.fl);

        bt_one = (Button) findViewById(R.id.bt_one);
        bt_one.setOnClickListener(this);
        bt_two = (Button) findViewById(R.id.bt_two);
        bt_two.setOnClickListener(this);
        tb_tab_search = (LinearLayout) findViewById(R.id.tb_tab_search);
        tb_tab_search.setOnClickListener(this);
    }


    @Override
    public void success(SearchBean searchBean) {
        List<SearchBean.DataBean> data = searchBean.getData();
        dataBeen.addAll(data);
        bt_one.setText(dataBeen.get(0).getTitle());
        bt_two.setText(dataBeen.get(1).getTitle());



    }

    @Override
    public void deteat(String s) {
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }



    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        if (DEBUG)
            Log.i("TAG", "输入文本之前的状态");
        temp = s;
    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        if (DEBUG)
            Log.i("TAG", "输入文字中的状态，count是一次性输入字符数");
//        mTvAvailableCharNum.setText("还能输入" + (charMaxNum - s.length()) + "字符");
    }

    @Override
    public void afterTextChanged(Editable s) {
        if (DEBUG)
            Log.i("TAG", "输入文字后的状态");
        /** 得到光标开始和结束位置 ,超过最大数后记录刚超出的数字索引进行控制 */
        editStart = et_search.getSelectionStart();
        editEnd = et_search.getSelectionEnd();
        if (temp.length() > charMaxNum) {
            Toast.makeText(getApplicationContext(), "你输入的字数已经超过了限制！", Toast.LENGTH_LONG).show();
            s.delete(editStart - 1, editEnd);
            int tempSelection = editStart;
            et_search.setText(s);
            et_search.setSelection(tempSelection);
        }
    }

    @Override
    public void onClick(View v) {
        FragmentManager fm = getFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();


        switch (v.getId()) {
            case R.id.bt_one:
                if (search_one==null){
                    search_one = new Search_One(SearchActivity.this);

                }
                transaction.replace(R.id.fl,search_one);
                break;
            case R.id.bt_two:
                if (search_two==null){
                    search_two = new Search_Two(SearchActivity.this);
                }
                transaction.replace(R.id.fl,search_two);
                break;
            case R.id.tv_quxiao:

                Intent intent2 = new Intent(SearchActivity.this, OverallActivity.class);
                intent2.putExtra("num",1);
                startActivity(intent2);

                break;
        }
        transaction.commit();
    }
}

