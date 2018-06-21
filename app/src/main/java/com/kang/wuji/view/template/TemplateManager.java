package com.kang.wuji.view.template;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

/**
 * @author created by kangren on 2018/6/13 20:04
 */
public class TemplateManager {

    public static View getView(Context context, int templateId) {
        switch (templateId) {
            case TemplateId.USER_AVATAR:
                return new UserAvatarTemplate(context, templateId);
            default:
                return new LinearLayout(context);
        }
    }
}
