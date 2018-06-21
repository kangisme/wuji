package com.kang.wuji.view.template;

import android.content.Context;

import com.kang.wuji.R;

/**
 * @author created by kangren on 2018/5/15 17:25
 */
public class UserAvatarTemplate extends BaseView {

    public UserAvatarTemplate(Context context, int templateId) {
        super(context, templateId);
    }

    @Override
    protected void addView() {
        inflate(mContext, R.layout.template_user_avatar, this);
    }

    @Override
    protected void setData() {

    }

}
