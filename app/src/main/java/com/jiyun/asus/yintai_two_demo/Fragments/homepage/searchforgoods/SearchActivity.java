package com.jiyun.asus.yintai_two_demo.Fragments.homepage.searchforgoods;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
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

import static android.support.coreui.BuildConfig.DEBUG;


public class SearchActivity extends AppCompatActivity implements MyView<SearchBean>,TextWatcher{

    private CharSequence temp;//监听前的文本
    private int editStart;//光标开始位置
    private int editEnd;//光标结束位置
    private final int charMaxNum = 10;

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

    }

