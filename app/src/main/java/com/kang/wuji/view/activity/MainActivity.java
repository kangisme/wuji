package com.kang.wuji.view.activity;

import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.kang.wuji.R;
import com.kang.wuji.base.BaseActivity;
import com.kang.wuji.view.fragment.DiaryFragment;
import com.kang.wuji.view.fragment.NewsFragment;
import com.kang.wuji.view.fragment.UserFragment;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends BaseActivity
{
    /**
     * 日记tab
     */
    private static final String DIARY = "diary";
    /**
     * 新闻tab
     */
    private static final String NEWS = "news";
    /**
     * 我的tab
     */
    private static final String USER = "user";
    /**
     * 可选日历tab
     */
    private static final String CALENDAR = "calendar";

    /**
     * 记录当前tab的tag
     */
    private String currentTab;

    @BindView(R.id.fl_main)
    FrameLayout mFlMain;

    @BindView(R.id.iv_diary)
    ImageView mIvDiary;

    @BindView(R.id.tv_diary)
    TextView mTvDiary;

    @BindView(R.id.ll_diary)
    LinearLayout mLlDiary;

    @BindView(R.id.iv_news)
    ImageView mIvNews;

    @BindView(R.id.tv_news)
    TextView mTvNews;

    @BindView(R.id.ll_news)
    LinearLayout mLlNews;

    @BindView(R.id.iv_user)
    ImageView mIvUser;

    @BindView(R.id.tv_notify)
    TextView mTvNotify;

    @BindView(R.id.tv_user)
    TextView mTvUser;

    @BindView(R.id.rl_user)
    RelativeLayout mRlUser;

    @BindView(R.id.ll_tab)
    LinearLayout mLlTab;

    private DiaryFragment mDiaryFragment;

    private NewsFragment mNewsFragment;

    private UserFragment mUserFragment;

    private long lastBackPress;

    @Override
    protected int attachLayoutRes()
    {
        return R.layout.activity_main;
    }

    @Override
    protected void initViews()
    {
        mDiaryFragment = new DiaryFragment();
        mNewsFragment = new NewsFragment();
        mUserFragment = new UserFragment();
        addFragment(R.id.fl_main, mDiaryFragment, DIARY);
        currentTab = DIARY;
    }

    @Override
    public void onBackPressed()
    {
        long current = SystemClock.elapsedRealtime();
        if ((current - lastBackPress) < 2000)
        {
            super.onBackPressed();
        }
        else
        {
            lastBackPress = current;
            Toast.makeText(this, "再按一次退出应用", Toast.LENGTH_SHORT).show();
        }
    }

    @OnClick({R.id.ll_diary, R.id.ll_news, R.id.rl_user})
    public void onViewClicked(View view)
    {
        switch (view.getId())
        {
            case R.id.ll_diary:
                if (!DIARY.equals(currentTab)) {
                    replaceFragment(R.id.fl_main, mDiaryFragment, DIARY);
                    currentTab = DIARY;
                }
                break;
            case R.id.ll_news:
                if (!NEWS.equals(currentTab)) {
                    replaceFragment(R.id.fl_main, mNewsFragment, NEWS);
                    currentTab = NEWS;
                }
                break;
            case R.id.rl_user:
                if (!USER.equals(currentTab)) {
                    replaceFragment(R.id.fl_main, mUserFragment, USER);
                    currentTab = USER;
                }
                break;
        }
    }
}
