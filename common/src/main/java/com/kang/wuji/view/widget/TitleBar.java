package com.kang.wuji.view.widget;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.kang.wuji.data.R;

/**
 * 标题栏
 *
 * @author created by kangren on 2018/5/15 16:01
 */
public class TitleBar extends RelativeLayout {

    ImageView backIcon;

    TextView title;

    ImageView commitIcon;

    private CommitClickListener commitClickListener;

    private int[] TEXT_ATTR = new int[]{android.R.attr.text};

    public TitleBar(Context context) {
        this(context, null);
    }

    public TitleBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        inflate(getContext(), R.layout.title_bar, this);
        backIcon = findViewById(R.id.back_icon);
        title = findViewById(R.id.title);
        commitIcon = findViewById(R.id.commit_icon);
        TypedArray ta = context.obtainStyledAttributes(attrs, TEXT_ATTR);
        title.setText(ta.getText(0));
        ta.recycle();
        backIcon.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Activity)getContext()).finish();
            }
        });
        commitIcon.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (commitClickListener != null) {
                    commitClickListener.onClick(v);
                }
            }
        });
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
