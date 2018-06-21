package com.kang.wuji.view.adapter;

import java.util.List;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.kang.wuji.model.TemplateModel;

/**
 * @author created by kangren on 2018/6/14 09:50
 */
public class UserAdapter extends BaseQuickAdapter<TemplateModel.TemplateBean, BaseViewHolder> {

    public UserAdapter(int layoutResId, @Nullable List<TemplateModel.TemplateBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, TemplateModel.TemplateBean item) {

    }
}
