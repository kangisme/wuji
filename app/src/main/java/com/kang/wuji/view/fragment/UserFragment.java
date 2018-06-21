package com.kang.wuji.view.fragment;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.kang.wuji.R;
import com.kang.wuji.base.BaseFragment;
import com.kang.wuji.presenter.UserPresenter;

import butterknife.BindView;


/**
 * @author created by kangren on 2018/5/17 14:48
 */
public class UserFragment extends BaseFragment<UserPresenter> {

    @BindView(R.id.recycler)
    RecyclerView mRecyclerView;


    @Override
    protected int attachLayoutRes() {
        return R.layout.fragment_user;
    }

    @Override
    protected void initInjector() {

    }

    @Override
    protected void initViews() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(layoutManager);

    }
}
