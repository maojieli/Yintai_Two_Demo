package com.jiyun.asus.yintai_two_demo.Fragments.homepage.searchforgoods.fragments;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.jiyun.asus.yintai_two_demo.Fragments.homepage.searchforgoods.SearchActivity;
import com.jiyun.asus.yintai_two_demo.Fragments.homepage.searchforgoods.bean.SearchBean;
import com.jiyun.asus.yintai_two_demo.Http.Presenter.MyPresenter;
import com.jiyun.asus.yintai_two_demo.Http.View.MyView;
import com.jiyun.asus.yintai_two_demo.Http.tools.BaseParams;
import com.jiyun.asus.yintai_two_demo.Http.tools.Concat;
import com.jiyun.asus.yintai_two_demo.Http.tools.Tools;
import com.jiyun.asus.yintai_two_demo.R;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by asus on 2017/10/23.
 */

public class Search_Two extends Fragment implements MyView<SearchBean> {
    private TextView tv_search_left_one;
    private TextView tv_search_left_two;
    private TextView tv_search_left_three;
    private TextView tv_search_left_four;
    private TextView tv_search_left_five;
    private LinearLayout ll_search_one_left;
    private TextView tv_search_right_one;
    private TextView tv_search_right_two;
    private TextView tv_search_right_three;
    private TextView tv_search_right_four;
    private LinearLayout ll_search_one_right;
    private Context context;
    private MyPresenter myPresenter;

    public Search_Two(SearchActivity searchActivity) {

        this.context=searchActivity;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.search_one_main, container, false);
        initView(inflate);

        myPresenter = new MyPresenter(this);
        Map<String, String> httpParams = Tools.getHttpParams(context);
        BaseParams.getParams(httpParams, context);
        httpParams.put("ver", "1.2");
        httpParams.put("method", "products.GetSearchPage");
        httpParams.put("pageid", "104001");
        httpParams.put("pageindex", "1");
        HashMap<String, String> stringStringHashMap = Tools.signBusinessParameter(context, (HashMap<String, String>) httpParams);
        myPresenter.quest( stringStringHashMap);


        Animation search_one_left = AnimationUtils.loadAnimation(context, R.anim.search_one_left);
        ll_search_one_left.setAnimation(search_one_left);
        Animation search_one_rigth = AnimationUtils.loadAnimation(context, R.anim.search_one_rigth);
        ll_search_one_right.setAnimation(search_one_rigth);
        return inflate;
    }
    private void initView(View inflate) {
        tv_search_left_one = (TextView) inflate.findViewById(R.id.tv_search_left_one);
        tv_search_left_two = (TextView) inflate.findViewById(R.id.tv_search_left_two);
        tv_search_left_three = (TextView) inflate.findViewById(R.id.tv_search_left_three);
        tv_search_left_four = (TextView) inflate.findViewById(R.id.tv_search_left_four);
        tv_search_left_five = (TextView) inflate.findViewById(R.id.tv_search_left_five);
        ll_search_one_left = (LinearLayout) inflate.findViewById(R.id.ll_search_one_left);
        tv_search_right_one = (TextView) inflate.findViewById(R.id.tv_search_right_one);
        tv_search_right_two = (TextView) inflate.findViewById(R.id.tv_search_right_two);
        tv_search_right_three = (TextView) inflate.findViewById(R.id.tv_search_right_three);
        tv_search_right_four = (TextView) inflate.findViewById(R.id.tv_search_right_four);
        ll_search_one_right = (LinearLayout) inflate.findViewById(R.id.ll_search_one_right);
    }

    @Override
    public void success(SearchBean searchBean) {

        List<SearchBean.DataBean.TagsBean> tags = searchBean.getData().get(1).getTags();
        tv_search_left_one.setText(tags.get(0).getName());
        tv_search_left_two.setText(tags.get(1).getName());
        tv_search_left_three.setText(tags.get(2).getName());
        tv_search_left_four.setText(tags.get(3).getName());
        tv_search_left_five.setText(tags.get(4).getName());
        tv_search_right_one.setText(tags.get(5).getName());
        tv_search_right_two.setText(tags.get(6).getName());
        tv_search_right_three.setText(tags.get(7).getName());
        tv_search_right_four.setText(tags.get(8).getName());
    }

    @Override
    public void deteat(String s) {
        Toast.makeText(context, s, Toast.LENGTH_SHORT).show();
    }


}
