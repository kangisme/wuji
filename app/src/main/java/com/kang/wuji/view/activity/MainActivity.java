package com.kang.wuji.view.activity;

import android.os.Bundle;
import android.os.SystemClock;
import android.widget.Toast;

import com.kang.wuji.R;
import com.kang.wuji.commom.BaseAcitivity;

public class MainActivity extends BaseAcitivity {

//    /**
//     * 日记tab
//     */
//    private static final String DIARY = "diary";
//
//    /**
//     * 日历tab
//     */
//    private static final String CALENDAR = "calendar";
//
//    /**
//     * 我的tab
//     */
//    private static final String USER = "user";
//
//    /**
//     * 可选新闻tab
//     */
//    private static final String NEWS = "news";

    private long lastBackPress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onBackPressed() {
        long current = SystemClock.elapsedRealtime();
        if ((current - lastBackPress) < 2000) {
            super.onBackPressed();
        } else {
            lastBackPress = current;
            Toast.makeText(this, "再按一次退出应用", Toast.LENGTH_SHORT).show();
        }
    }
}
