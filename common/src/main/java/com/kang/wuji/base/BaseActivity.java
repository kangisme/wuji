package com.kang.wuji.base;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.kang.wuji.data.R;
import com.kang.wuji.util.Settings;

import butterknife.ButterKnife;

public abstract class BaseActivity extends AppCompatActivity implements IBaseView
{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        initTheme();
        setContentView(attachLayoutRes());
        ButterKnife.bind(this);
        initViews();
    }

    private void initTheme()
    {
        if (Settings.isLightTheme(this))
        {
            setTheme(R.style.AppTheme_Light);
        }
        else
        {
            setTheme(R.style.AppTheme_Night);
        }
    }

    @Override
    public void showLoading()
    {

    }

    @Override
    public void hideLoading()
    {

    }

    @Override
    public void showNetError()
    {

    }

    /**
     * 添加Fragment
     */
    protected void addFragment(int containerId, BaseFragment fragment)
    {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.add(containerId, fragment);
        transaction.commit();
    }

    protected void addFragment(int containerId, BaseFragment fragment, String tag)
    {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.add(containerId, fragment, tag);
        transaction.commit();
    }

    /**
     * 替换Fragment
     */
    protected void replaceFragment(int containerId, BaseFragment fragment)
    {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(containerId, fragment);
        transaction.commit();
    }

    protected void replaceFragment(int containerId, BaseFragment fragment, String tag)
    {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(containerId, fragment, tag);
        transaction.commit();
    }

    /**
     * 绑定布局文件
     */
    @LayoutRes
    protected abstract int attachLayoutRes();

    /**
     * 初始化视图控件
     */
    protected abstract void initViews();
}
