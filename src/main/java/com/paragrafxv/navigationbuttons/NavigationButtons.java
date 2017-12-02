package com.paragrafxv.navigationbuttons;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import static android.view.ViewGroup.LayoutParams.MATCH_PARENT;

/**
 * Created by Moni on 2017-12-02.
 */

public class NavigationButtons extends LinearLayout implements LeftRight {
    public NavigationButtons(Context context) {
        super(context);
        init();
    }

    public NavigationButtons(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public NavigationButtons(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public NavigationButtons(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    public void init() {
        View root = LayoutInflater.from(getContext()).inflate(R.layout.left_right, null, false);

        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(MATCH_PARENT, MATCH_PARENT);

        root.setLayoutParams(layoutParams);

        addView(root);
    }

    @Override
    public void setMiddleTitle(String title) {

    }



}
