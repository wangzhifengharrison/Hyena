package com.test.hyena.base;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.knifestone.hyena.base.activity.AbnormalActivity;
import com.knifestone.hyena.view.viewgroup.ViewLoading;
import com.test.hyena.R;

/**
 * 简介:
 * GitHub https://github.com/KnifeStone
 * 邮箱 378741819@qq.com
 * Created by KnifeStone on 2017/5/8.
 */
public abstract class BaseActivity extends AbnormalActivity {

    @Override
    protected void initContentView() {
        super.initContentView();
        initToolbar();
    }

    @Override
    public int bindLayout() {
        return R.layout.activity_base_toolbar;
    }

    @Override
    protected View createLoadingView() {
        return new ViewLoading(mContext) {
            @Override
            public void bingLayout() {
                LayoutInflater.from(mContext).inflate(R.layout.layout_loading, this);
            }
        };
    }

    @Override
    protected View createEmptyView() {
        TextView textView = new TextView(this);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        textView.setText("没有内容");
        textView.setGravity(Gravity.CENTER);
        return textView;
    }

    @Override
    protected View createErrorView() {
        TextView textView = new TextView(this);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        textView.setText("错误页面");
        textView.setGravity(Gravity.CENTER);
        return textView;
    }

}
