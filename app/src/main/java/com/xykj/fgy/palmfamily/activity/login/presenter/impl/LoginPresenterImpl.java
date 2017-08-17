package com.xykj.fgy.palmfamily.activity.login.presenter.impl;

import com.xykj.fgy.palmfamily.activity.login.LoginActivity;
import com.xykj.fgy.palmfamily.activity.login.model.bean.LoginData;
import com.xykj.fgy.palmfamily.activity.login.model.bean.LoginResult;
import com.xykj.fgy.palmfamily.activity.login.model.bean.impl.LoginModelImpl;
import com.xykj.fgy.palmfamily.activity.login.presenter.LoginPresenter;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * Created by Administrator on 2017/8/15.
 */

public class LoginPresenterImpl implements LoginPresenter {
    private LoginModelImpl mModel;
    private LoginActivity mView;

    public LoginPresenterImpl(LoginActivity mView) {
        this.mView = mView;
        this.mModel = new LoginModelImpl();
    }

    // 获取验证码
    @Override
    public void LoginResult(String mobilePhone) {
        mModel.getLogin(mobilePhone).subscribe(new Observer<LoginData>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(LoginData loginData) {
                mView.showCodeMsg(loginData);
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        });
    }

    /**
     * 登录业务
     * @param username
     * @param password
     */
    @Override
    public void Login(String username, String password) {
        mModel.getLogin1(username,password).subscribe(new Observer<LoginResult>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(LoginResult loginResult) {
                mView.showTip(loginResult);
            }

            @Override
            public void onError(Throwable e) {
            }

            @Override
            public void onComplete() {

            }
        });
    }
}
