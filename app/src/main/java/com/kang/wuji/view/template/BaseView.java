package com.kang.wuji.view.template;

import android.content.Context;
import android.widget.LinearLayout;

/**
 * @author created by kangren on 2018/5/15 17:27
 */
public abstract class BaseView extends LinearLayout {

    protected int id;

    protected Context mContext;

    public BaseView(Context context, int templateId) {
        super(context);
        this.id = templateId;
        this.mContext = context;
    }

    protected abstract void addView();

    protected abstract void setData();
}
