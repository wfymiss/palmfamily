package com.xykj.fgy.palmfamily.activity.login.presenter;

import com.xykj.fgy.palmfamily.activity.login.model.bean.LoginData;

import io.reactivex.Observable;
import okhttp3.RequestBody;

/**
 * Created by Administrator on 2017/8/15.
 */

public interface LoginPresenter {
    void LoginResult(String mobilePhone);

    void Login(String username,String Password);

}
