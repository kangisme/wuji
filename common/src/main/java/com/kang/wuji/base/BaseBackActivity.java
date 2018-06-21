package com.kang.wuji.base;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.kang.wuji.view.widget.SwipeBackLayout;

/**
 * @author created by kangren on 2018/5/16 18:09
 */
public abstract class BaseBackActivity extends BaseActivity {

    private SwipeBackLayout swipeBackLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        swipeBackLayout = new SwipeBackLayout(this);
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        //设置左滑退出activity
        swipeBackLayout.attachToActivity(this, SwipeBackLayout.EDGE_LEFT);
        //设置手势有效区域为屏幕宽的三分之一
        swipeBackLayout.setEdgeSize(getResources().getDisplayMetrics().widthPixels / 3);
    }
}
