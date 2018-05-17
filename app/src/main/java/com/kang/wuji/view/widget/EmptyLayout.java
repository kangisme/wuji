package com.kang.wuji.view.widget;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import android.content.Context;
import android.support.annotation.IntDef;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.github.ybq.android.spinkit.SpinKitView;
import com.kang.wuji.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 加载、空、错误等视图
 *
 * @author created by kangren on 2018/5/17 13:55
 */
public class EmptyLayout extends FrameLayout {

    public static final int STATUS_HIDE = 1001;
    public static final int STATUS_LOADING = 1;
    public static final int STATUS_NO_NET = 2;
    public static final int STATUS_NO_DATA = 3;

    @BindView(R.id.empty_no_net)
    TextView mEmptyNoNet;
    @BindView(R.id.empty_loading)
    SpinKitView mEmptyLoading;

    private OnRetryListener mOnRetryListener;

    private int mEmptyStatus = STATUS_LOADING;

    private Context mContext;

    public EmptyLayout(@NonNull Context context) {
        this(context, null);
    }

    public EmptyLayout(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.mContext = context;
        View.inflate(context, R.layout.empty_layout, this);
        ButterKnife.bind(this);
        switchEmptyView();
    }

    private void switchEmptyView() {
        switch (mEmptyStatus) {
            case STATUS_LOADING:
                setVisibility(VISIBLE);
                mEmptyLoading.setVisibility(VISIBLE);
                mEmptyNoNet.setVisibility(GONE);
                break;
            case STATUS_NO_DATA:
            case STATUS_NO_NET:
                setVisibility(VISIBLE);
                mEmptyNoNet.setVisibility(VISIBLE);
                mEmptyLoading.setVisibility(GONE);
                break;
            case STATUS_HIDE:
                setVisibility(GONE);
                break;
        }
    }

    public void setEmptyStatus(@EmptyStatus int status) {
        this.mEmptyStatus = status;
        switchEmptyView();
    }

    /**
     * 设置重试监听器
     * @param onRetryListener 监听器
     */
    public void setOnRetryListener(OnRetryListener onRetryListener) {
        this.mOnRetryListener = onRetryListener;
    }

    @OnClick(R.id.empty_no_net)
    public void onViewClicked() {
        if (mOnRetryListener != null) {
            mOnRetryListener.onRetry();
        }
    }

    /**
     * 点击重试监听器
     */
    public interface OnRetryListener {
        void onRetry();
    }

    @Retention(RetentionPolicy.SOURCE)
    @IntDef({STATUS_LOADING, STATUS_NO_NET, STATUS_NO_DATA})
    public @interface EmptyStatus {
    }
}
