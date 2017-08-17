package com.xykj.fgy.palmfamily.activity.register;

import android.support.v7.widget.Toolbar;

import com.xykj.fgy.palmfamily.R;
import com.xykj.fgy.palmfamily.base.BaseActivity;

import butterknife.BindView;

public class RegisterActivity extends BaseActivity {


    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @Override
    public int getLayoutId() {
        return R.layout.activity_register;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
    }

}
