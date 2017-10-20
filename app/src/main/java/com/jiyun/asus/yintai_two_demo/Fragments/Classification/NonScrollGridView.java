package com.jiyun.asus.yintai_two_demo.Fragments.Classification;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridView;

/**
 * 当你的才华满足不了你的野心的时候，那么你应该静下心来学习.
 */

public class NonScrollGridView extends GridView {

    public NonScrollGridView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public NonScrollGridView(Context context) {
        super(context);
    }

    public NonScrollGridView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

        int expandSpec = MeasureSpec.makeMeasureSpec(
                Integer.MAX_VALUE >> 2, MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, expandSpec);
    }
}