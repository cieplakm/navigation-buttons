package com.paragrafxv.navigationbuttons;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import static android.view.ViewGroup.LayoutParams.MATCH_PARENT;

/**
 * Created by Moni on 2017-12-02.
 */

public class NavigationButtons extends LinearLayout implements INavigationButtons {
    private View root;
    private OnNavigateClickListener onClicksListener;

    private ImageButton btnLeft;
    private ImageButton btnRight;
    private TextView tvTitle;


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

    private void init() {
        inflateRootView();
        bindViews();
        setupListenrs();

    }

    private void inflateRootView() {
        root = LayoutInflater.from(getContext()).inflate(R.layout.left_right, null, false);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(MATCH_PARENT, MATCH_PARENT);
        root.setLayoutParams(layoutParams);
        addView(root);
    }

    private void bindViews() {

        btnLeft = root.findViewById(R.id.btn_prevous_arrow);
        btnRight = root.findViewById(R.id.btn_next_arrow);
        tvTitle = root.findViewById(R.id.title);

    }

    private void setupListenrs() {
        btnLeft.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (onClicksListener !=null)
                    onClicksListener.onLeftClick();
            }
        });

        btnRight.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (onClicksListener !=null)
                    onClicksListener.onRightClick();
            }
        });

        tvTitle.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (onClicksListener !=null)
                    onClicksListener.onTitleClick();
            }
        });
    }

    @Override
    public void setOnClickListeners(OnNavigateClickListener onClickListeners){
        this.onClicksListener = onClickListeners;
    }

    @Override
    public void setMiddleTitle(String title) {
        tvTitle.setText(title);
    }



}
