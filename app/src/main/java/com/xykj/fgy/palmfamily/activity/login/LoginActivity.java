package com.xykj.fgy.palmfamily.activity.login;

import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.xykj.fgy.palmfamily.R;
import com.xykj.fgy.palmfamily.activity.MainActivity;
import com.xykj.fgy.palmfamily.activity.login.model.bean.LoginData;
import com.xykj.fgy.palmfamily.activity.login.model.bean.LoginResult;
import com.xykj.fgy.palmfamily.activity.login.presenter.impl.LoginPresenterImpl;
import com.xykj.fgy.palmfamily.activity.login.view.LoginView;
import com.xykj.fgy.palmfamily.activity.register.RegisterActivity;
import com.xykj.fgy.palmfamily.base.BaseActivity;
import com.xykj.fgy.palmfamily.utils.ToastUitl;

import butterknife.BindView;
import butterknife.OnClick;

public class LoginActivity extends BaseActivity implements LoginView {


    @BindView(R.id.et_username)
    EditText mEtUsername;
    @BindView(R.id.et_password)
    EditText mEtPassword;
    @BindView(R.id.iv_login)
    ImageView mIvLogin;
    @BindView(R.id.tv_register)
    TextView mTvRegister;
    private String mUserName;
    private String mPassWord;
    private LoginPresenterImpl mPresenter;

    @Override
    public int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        mPresenter = new LoginPresenterImpl(this);
        mEtUsername.addTextChangedListener(watcher);
        mEtPassword.addTextChangedListener(watcher);
    }

    private TextWatcher watcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
            mPassWord = mEtPassword.getText().toString();
            mUserName = mEtUsername.getText().toString();
        }
    };

    @OnClick({R.id.tv_register, R.id.ib_code, R.id.iv_login})
    public void OnClick(View view) {
        switch (view.getId()) {

            case R.id.tv_register:
                startActivity(RegisterActivity.class);
                break;

            case R.id.ib_code:
                if (mUserName != null) {
                    mPresenter.LoginResult(mUserName);
                } else {
                    ToastUitl.showShort(R.string.info);
                }
                break;
            case R.id.iv_login:
                if (!mUserName.isEmpty() && !mPassWord.isEmpty()) {
                    startActivity(MainActivity.class);
                    finish();
                } else {
                    ToastUitl.showShort("账号或者验证码不能为空");
                    return;
                }

                break;


        }

    }

    //  -----------------------------------ui----------------------------------
    @Override
    public void showTip(LoginResult loginData) {
        ToastUitl.showShort(loginData.getSuccess());
    }

    @Override
    public void showCodeMsg(LoginData loginData) {
        ToastUitl.showShort(loginData.getSuccess());
    }
}
