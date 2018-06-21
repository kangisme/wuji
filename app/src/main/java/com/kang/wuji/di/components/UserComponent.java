package com.kang.wuji.di.components;

import com.kang.wuji.di.PreFragment;
import com.kang.wuji.di.modules.UserModule;
import com.kang.wuji.view.fragment.UserFragment;

import dagger.Component;

/**
 * @author created by kangren on 2018/6/14 16:59
 */
@PreFragment
@Component(modules = UserModule.class)
public interface UserComponent {
    /**
     * 必须让Component知道需要往哪个类中注入
     * 这个方法名可以是其它的，但是推荐用inject
     * 目标类必须精确，不能用它的父类
     */
    void inject(UserFragment userFragment);
}
