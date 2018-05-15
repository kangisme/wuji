package com.kang.wuji.commom;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.kang.wuji.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 标题栏
 *
 * @author created by kangren on 2018/5/15 16:01
 */
public class TitleBar extends RelativeLayout {

    @BindView(R.id.back_icon)
    ImageView backIcon;
    @BindView(R.id.title)
    TextView title;
    @BindView(R.id.commit_icon)
    ImageView commitIcon;

    private CommitClickListener commitClickListener;

    private int[] TEXT_ATTR = new int[]{android.R.attr.text};

    public TitleBar(Context context) {
        this(context, null);
    }

    public TitleBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        inflate(getContext(), R.layout.title_bar, this);
        ButterKnife.bind(this);
        TypedArray ta = context.obtainStyledAttributes(attrs, TEXT_ATTR);
        title.setText(ta.getText(0));
        ta.recycle();
    }

    @OnClick({R.id.back_icon, R.id.commit_icon})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.back_icon:
                ((Activity)getContext()).finish();
                break;
            case R.id.commit_icon:
                if (commitClickListener != null) {
                    commitClickListener.onClick(view);
                }
                break;
        }
    }

    /**
     * 设置commit按钮监听
     * @param listener l
     */
    public void setCommitClickListener(CommitClickListener listener) {
        this.commitClickListener = listener;
    }

    public interface CommitClickListener {
        void onClick(View view);
    }

}
