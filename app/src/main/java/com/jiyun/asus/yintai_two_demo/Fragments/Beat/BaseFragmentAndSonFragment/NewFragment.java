package com.jiyun.asus.yintai_two_demo.Fragments.Beat.BaseFragmentAndSonFragment;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import com.jiyun.asus.yintai_two_demo.Fragments.Beat.Adapters.CommendLvAdapters;
import com.jiyun.asus.yintai_two_demo.Fragments.Beat.BeatBean.BeatBean;
import com.jiyun.asus.yintai_two_demo.Http.Presenter.MyPresenter;
import com.jiyun.asus.yintai_two_demo.Http.View.MyView;
import com.jiyun.asus.yintai_two_demo.Http.tools.BaseParams;
import com.jiyun.asus.yintai_two_demo.Http.tools.Concat;
import com.jiyun.asus.yintai_two_demo.Http.tools.Tools;
import com.jiyun.asus.yintai_two_demo.R;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 当你的才华满足不了你的野心的时候，那么你应该静下心来学习.
 */
//最后疯抢
public class NewFragment extends BaseFragment implements MyView<BeatBean> {
    private Context context;
    private ListView lv_beat_base;
    private SwipeRefreshLayout srl_beat_base;
    private List<BeatBean.DataBean.ActivityinfoBean.ActivitylistBean> activitylistBeen;
    private CommendLvAdapters adapters;

    public NewFragment(Context context) {
        this.context = context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.basefragment, container, false);
        lv_beat_base = view.findViewById(R.id.lv_beat_base);
        activitylistBeen = new ArrayList<>();
        adapters = new CommendLvAdapters(activitylistBeen, context);
        lv_beat_base.setAdapter(adapters);
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
        //  httpParams.put("pageindex", "1");
        httpParams.put("type", 1 + "");


        Map<String, String> stringStringHashMap = Tools.signBusinessParameter(context, (HashMap<String, String>) httpParams);
        presenter.quest(stringStringHashMap);
    }

    @Override
    public void success(BeatBean beatBean) {
        activitylistBeen.clear();
        List<BeatBean.DataBean.ActivityinfoBean.ActivitylistBean> activitylist = beatBean.getData().getActivityinfo().get(0).getActivitylist();
        for (int x = 0; x < activitylist.size(); x++) {
            //获取当前时间
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String format1 = df.format(new Date());
            //结束时间
            String endtime = activitylist.get(x).getEndtime();
            String[] ts = endtime.split("T");

            String t = ts[0];
            String t1 = ts[1];
            String t2 = " ";
            String t3 = t + t2 + t1;
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            try {
                Date firstDateTimeDate = format.parse(format1);
                Date secondDateTimeDate = format.parse(t3);
                long firstDateMilliSeconds = firstDateTimeDate.getTime();
                long secondDateMilliSeconds = secondDateTimeDate.getTime();
                long subDateMilliSeconds = secondDateMilliSeconds - firstDateMilliSeconds;
                int totalSeconds = (int) (subDateMilliSeconds / 1000);

                int days_remains = totalSeconds / (3600 * 24);
                Log.e("NewFragment", days_remains + "");
                if (days_remains < 1) {
                    BeatBean.DataBean.ActivityinfoBean.ActivitylistBean activitylistBean = activitylist.get(x);
                    activitylistBeen.add(activitylistBean);
                }


            } catch (ParseException e) {
                e.printStackTrace();
            }

            adapters.notifyDataSetChanged();
        }

    }
    @Override
    public void deteat(String s) {
        Toast.makeText(context, s, Toast.LENGTH_SHORT).show();
    }


}
