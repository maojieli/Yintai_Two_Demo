package com.jiyun.asus.yintai_two_demo.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.jiyun.asus.yintai_two_demo.LogInActivity;
import com.jiyun.asus.yintai_two_demo.R;
import com.umeng.socialize.UMAuthListener;
import com.umeng.socialize.UMShareAPI;
import com.umeng.socialize.bean.SHARE_MEDIA;

import java.util.Map;

/**eeee
 * 当你的才华满足不了你的野心的时候，那么你应该静下心来学习.
 */

public class MyFragment extends Fragment {

    private View imageView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.myfragment, container, false);
        imageView = inflate.findViewById(R.id.img_dengluzhuce);
        View v= inflate.findViewById(R.id.disanfangdenglu);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getActivity(), LogInActivity.class);
                startActivity(intent);
            }
        });
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                UMShareAPI mShareAPI = UMShareAPI.get(getActivity());
                mShareAPI.getPlatformInfo(getActivity(), SHARE_MEDIA.QQ, new UMAuthListener() {
                    @Override
                    public void onStart(SHARE_MEDIA platform) {
                    }

                    @Override
                    public void onComplete(SHARE_MEDIA platform, int action, Map<String, String> data) {
                        String temp = "";
                        for (String key : data.keySet()) {
                            temp = temp + key + " : " + data.get(key) + "\n";
                        }

                        Toast.makeText(getActivity(), platform + " 成功啦", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onError(SHARE_MEDIA platform, int action, Throwable t) {

                        Toast.makeText(getActivity(), platform + " 失败啦", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onCancel(SHARE_MEDIA platform, int action) {
                        Toast.makeText(getActivity(), platform + " 取消了", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });

        return inflate;
    }
}
