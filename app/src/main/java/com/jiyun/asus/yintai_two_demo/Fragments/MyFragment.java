package com.jiyun.asus.yintai_two_demo.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jiyun.asus.yintai_two_demo.LogInActivity;
import com.jiyun.asus.yintai_two_demo.R;

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


        return inflate;
    }
}
