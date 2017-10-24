package com.jiyun.asus.yintai_two_demo.Fragments.Beat.BaseFragmentAndSonFragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.jiyun.asus.yintai_two_demo.Fragments.Beat.Adapters.CommendLvAdapters;
import com.jiyun.asus.yintai_two_demo.Fragments.Beat.BeatBean.BeatBean;
import com.jiyun.asus.yintai_two_demo.Fragments.Beat.Jump.Beans.JumpEventBean;
import com.jiyun.asus.yintai_two_demo.Fragments.Beat.Jump.JumpBeatActivity;
import com.jiyun.asus.yintai_two_demo.Http.Presenter.MyPresenter;
import com.jiyun.asus.yintai_two_demo.Http.View.MyView;
import com.jiyun.asus.yintai_two_demo.Http.tools.BaseParams;
import com.jiyun.asus.yintai_two_demo.Http.tools.Tools;
import com.jiyun.asus.yintai_two_demo.OverallActivity;
import com.jiyun.asus.yintai_two_demo.R;

import org.greenrobot.eventbus.EventBus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 当你的才华满足不了你的野心的时候，那么你应该静下心来学习.
 */
//正在进行
public class CommendFragment extends BaseFragment implements MyView<BeatBean> {
    private Context context;
    private ListView lv_beat_base;
    private SwipeRefreshLayout srl_beat_base;
    private List<BeatBean.DataBean.ActivityinfoBean.ActivitylistBean> activitylistBeen;
    private CommendLvAdapters adapters;
    private OverallActivity activity;

    public CommendFragment(Context context) {
        this.context = context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.basefragment, container, false);
        activity = (OverallActivity) getActivity();
        lv_beat_base = view.findViewById(R.id.lv_beat_base);
        activitylistBeen = new ArrayList<>();
        adapters = new CommendLvAdapters(activitylistBeen, context);
        lv_beat_base.setAdapter(adapters);
        lv_beat_base.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // 传值

                Intent intent = new Intent(activity, JumpBeatActivity.class);
                int id1 = activitylistBeen.get(position).getId();
                EventBus.getDefault().post(new JumpEventBean(id1));
                String name = activitylistBeen.get(position).getName();
                intent.putExtra("name", name);
                intent.putExtra("index", id1);

                context.startActivity(intent);
            }
        });
        srl_beat_base = view.findViewById(R.id.srl_beat_base);
        srl_beat_base.setColorSchemeResources(android.R.color.holo_blue_light, android.R.color.holo_red_light, android.R.color.holo_orange_light, android.R.color.holo_green_light);
        srl_beat_base.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                srl_beat_base.setRefreshing(true);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        activitylistBeen.clear();
                        innidata();
                        if (srl_beat_base.isRefreshing()) {
                            srl_beat_base.setRefreshing(false);
                        }
                    }
                }, 3000);
            }
        });
        return view;
    }

    @Override
    public void uninnidata() {

    }

    @Override
    public void innidata() {
        MyPresenter presenter = new MyPresenter(this);
        Map<String, String> httpParams = Tools.getHttpParams(context);
        BaseParams.getParams(httpParams, context);
        httpParams.put("ver", "3.0");
        httpParams.put("method", "products.limitbuy");
        httpParams.put("pageid", "104001");

        httpParams.put("type", 1 + "");


        Map<String, String> stringStringHashMap = Tools.signBusinessParameter(context, (HashMap<String, String>) httpParams);
        presenter.quest(stringStringHashMap);
    }

    @Override
    public void success(BeatBean beatBean) {
        activitylistBeen.clear();
        List<BeatBean.DataBean.ActivityinfoBean.ActivitylistBean> activitylist = beatBean.getData().getActivityinfo().get(0).getActivitylist();
        activitylistBeen.addAll(activitylist);
        adapters.notifyDataSetChanged();

    }

    @Override
    public void deteat(String s) {
        Toast.makeText(context, s, Toast.LENGTH_SHORT).show();
    }


}
