package com.kang.wuji.view.activity;

import android.content.Intent;
import android.os.Handler;

import com.kang.wuji.R;
import com.kang.wuji.base.BaseActivity;


public class FirstActivity extends BaseActivity
{
    @Override
    protected int attachLayoutRes() {
        return R.layout.activity_first;
    }

    @Override
    protected void initViews() {
//        if (PreferencesUtil.isFirstEnter(this))
//        {
//            // 第一次进入配置
//            UtilMethod.resourceIdSaveFile(this, R.mipmap.bg_overcast);
//            PreferencesUtil.setFirstEnter(this);
//        }
        Handler handler = new Handler();
        handler.postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                startActivity(new Intent(FirstActivity.this, MainActivity.class));
                finish();
            }
        }, 100);
    }

    @Override
    public void onBackPressed()
    {
        // FirstActivity禁用Back回退键
    }
}
