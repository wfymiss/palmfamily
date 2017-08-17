package com.xykj.fgy.palmfamily.activity.login.view;

import com.xykj.fgy.palmfamily.activity.login.model.bean.LoginData;
import com.xykj.fgy.palmfamily.activity.login.model.bean.LoginResult;

/**
 * Created by Administrator on 2017/8/16.
 */

public interface LoginView {
    void showTip(LoginResult loginData);

    void showCodeMsg(LoginData loginData);
}
