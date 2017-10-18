package com.jiyun.asus.yintai_two_demo.Fragments.homepage.searchforgoods;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.jiyun.asus.yintai_two_demo.Fragments.homepage.bean.HomeBean;
import com.jiyun.asus.yintai_two_demo.Fragments.homepage.searchforgoods.adapter.SearchAdapter;
import com.jiyun.asus.yintai_two_demo.Fragments.homepage.searchforgoods.bean.SearchBean;
import com.jiyun.asus.yintai_two_demo.Http.Presenter.MyPresenter;
import com.jiyun.asus.yintai_two_demo.Http.View.MyView;
import com.jiyun.asus.yintai_two_demo.Http.tools.BaseParams;
import com.jiyun.asus.yintai_two_demo.Http.tools.Concat;
import com.jiyun.asus.yintai_two_demo.Http.tools.Tools;
import com.jiyun.asus.yintai_two_demo.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.jiyun.asus.yintai_two_demo.Http.tools.Tools.getSystemVersion;

public class SearchActivity extends AppCompatActivity implements MyView<SearchBean>{


    private RelativeLayout relativeLayout;
    private EditText et_search;
    private TextView tv_quxiao;
    private RecyclerView rv_search;
    private MyPresenter myPresenter;
    private ArrayList<SearchBean.DataBean> dataBeen;
    private SearchAdapter searchAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        initView();
        myPresenter = new MyPresenter(this);
        Map<String, String> httpParams = Tools.getHttpParams(this);
        BaseParams.getParams(httpParams,this);
        httpParams.put("ver", "1.2");
        httpParams.put("method", "products.GetSearchPage");
        httpParams.put("pageid", "104001");
        httpParams.put("pageindex", "1");
        HashMap<String, String> stringStringHashMap = Tools.signBusinessParameter(this, (HashMap<String, String>) httpParams);
        myPresenter.quest(Concat.NETURL, SearchBean.class, stringStringHashMap);
        dataBeen = new ArrayList<>();
        StaggeredGridLayoutManager staggeredGridLayoutManager=new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.VERTICAL);
        rv_search.setLayoutManager(staggeredGridLayoutManager);
        searchAdapter = new SearchAdapter(dataBeen);
        rv_search.setAdapter(searchAdapter);

    }


    private void initView() {
        relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        et_search = (EditText) findViewById(R.id.et_search);
        tv_quxiao = (TextView) findViewById(R.id.tv_quxiao);
        rv_search = (RecyclerView) findViewById(R.id.rv_search);
    }


    @Override
    public void success(SearchBean searchBean) {
        List<SearchBean.DataBean> data = searchBean.getData();
        dataBeen.addAll(data);
        searchAdapter.notifyDataSetChanged();
    }

    @Override
    public void defeat(String s) {
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }
}
