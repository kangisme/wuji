package com.kang.wuji.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.kang.wuji.R;
import com.kang.wuji.commom.BaseAcitivity;


public class FirstActivity extends BaseAcitivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
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
        }, 1000);
    }

    @Override
    public void onBackPressed()
    {
        // FirstActivity禁用Back回退键
    }
}
