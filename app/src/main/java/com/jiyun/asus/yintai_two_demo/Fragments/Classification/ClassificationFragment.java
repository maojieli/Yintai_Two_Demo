package com.jiyun.asus.yintai_two_demo.Fragments.Classification;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.jiyun.asus.yintai_two_demo.Beans.ClassLeftBean;
import com.jiyun.asus.yintai_two_demo.Fragments.Classification.Adapters.LvAdapter;
import com.jiyun.asus.yintai_two_demo.Fragments.Classification.Bean.EventBean;
import com.jiyun.asus.yintai_two_demo.Fragments.homepage.searchforgoods.SearchActivity;
import com.jiyun.asus.yintai_two_demo.Http.Presenter.MyPresenter;
import com.jiyun.asus.yintai_two_demo.Http.View.MyView;
import com.jiyun.asus.yintai_two_demo.Http.tools.BaseParams;
import com.jiyun.asus.yintai_two_demo.Http.tools.Concat;
import com.jiyun.asus.yintai_two_demo.Http.tools.Tools;
import com.jiyun.asus.yintai_two_demo.OverallActivity;
import com.jiyun.asus.yintai_two_demo.R;
import com.uuzuche.lib_zxing.activity.CaptureActivity;
import com.uuzuche.lib_zxing.activity.CodeUtils;

import org.greenrobot.eventbus.EventBus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 当你的才华满足不了你的野心的时候，那么你应该静下心来学习.
 */

public class ClassificationFragment extends Fragment implements MyView<ClassLeftBean>, View.OnClickListener {

    private ListView lv_classification;

    private List<ClassLeftBean.DataBeanX.DataBean> been;
    private LvAdapter adapter;
    private Context context;
    private OverallActivity activity;


    private ImageView iv_scan;
    private RelativeLayout rl;

    public ClassificationFragment(OverallActivity overallActivity) {
        this.context = overallActivity;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.classfragment, container, false);
        //找ID
        activity = (OverallActivity) getActivity();
        lv_classification = view.findViewById(R.id.lv_classification);


        //设置左侧的Listview
        been = new ArrayList<>();
        MyPresenter presenter = new MyPresenter(this);
        Map<String, String> httpParams = Tools.getHttpParams(context);
        BaseParams.getParams(httpParams, context);
        httpParams.put("ver", "3.0");
        httpParams.put("method", "products.category.getcategory");
        httpParams.put("pageid", "104001");
        httpParams.put("pageindex", "1");
        httpParams.put("sign", "caee86bb6fabdcfc7a1da855f9932800");
        Map<String, String> stringStringHashMap = Tools.signBusinessParameter(context, (HashMap<String, String>) httpParams);
        presenter.quest(stringStringHashMap);
        adapter = new LvAdapter(been, context);
        lv_classification.setAdapter(adapter);
        //设置左侧Listview的点击时间
        lv_classification.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int categoryid = been.get(position).getId();
                EventBus.getDefault().post(new EventBean(categoryid));


                FragmentManager manager = ClassificationFragment.this.activity.getFragmentManager();
                FragmentTransaction fragmentTransaction = manager.beginTransaction();
                classificationrightfragment classificationrightfragment = new classificationrightfragment(context);
                fragmentTransaction.add(R.id.fl_classification, classificationrightfragment);
                fragmentTransaction.show(classificationrightfragment);
                fragmentTransaction.commit();
            }

        });
        initView(view);
        return view;
    }


    @Override
    public void success(ClassLeftBean classLeftBean) {
        List<ClassLeftBean.DataBeanX.DataBean> data = classLeftBean.getData().getData();
        been.addAll(data);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void deteat(String s) {
        Toast.makeText(context, s, Toast.LENGTH_SHORT).show();
    }


    private void initView(View view) {

        iv_scan = (ImageView) view.findViewById(R.id.iv_scan);
        rl = (RelativeLayout) view.findViewById(R.id.rl);
        rl.setOnClickListener(this);
        iv_scan.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.rl:
                startActivity(new Intent(getActivity(), SearchActivity.class));
                break;
            case R.id.iv_scan:
                Intent intent = new Intent(getActivity(), CaptureActivity.class);
                startActivityForResult(intent, 0);
                break;
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        /**
         * 处理二维码扫描结果
         */
        if (requestCode == 0) {
            //处理扫描结果（在界面上显示）
            if (null != data) {
                Bundle bundle = data.getExtras();
                if (bundle == null) {
                    return;
                }
                if (bundle.getInt(CodeUtils.RESULT_TYPE) == CodeUtils.RESULT_SUCCESS) {
                    String result = bundle.getString(CodeUtils.RESULT_STRING);
                    Toast.makeText(getContext(), "解析结果:" + result, Toast.LENGTH_LONG).show();
                } else if (bundle.getInt(CodeUtils.RESULT_TYPE) == CodeUtils.RESULT_FAILED) {
                    Toast.makeText(getContext(), "解析二维码失败", Toast.LENGTH_LONG).show();
                }
            }
        }
    }
}
