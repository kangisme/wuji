package com.kang.wuji.base;

/**
 * @author created by kangren on 2018/6/14 14:31
 */
public interface IBasePresenter {

    /**
     * 获取网络数据，更新界面
     * @param isRefresh 新增参数，用来判断是否为下拉刷新调用，下拉刷新的时候不应该再显示加载界面和异常界面
     */
    void getData(boolean isRefresh);

    /**
     * 加载更多数据
     */
    void getMoreData();
}
