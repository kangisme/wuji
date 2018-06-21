package com.kang.wuji.base;

/**
 * @author created by kangren on 2018/5/17 11:44
 */
public interface IBaseView {

    /**
     * 显示加载动画
     */
    void showLoading();

    /**
     * 隐藏加载动画
     */
    void hideLoading();

    /**
     * 显示网络错误
     */
    void showNetError();
}
