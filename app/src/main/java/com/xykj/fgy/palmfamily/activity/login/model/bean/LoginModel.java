package com.xykj.fgy.palmfamily.activity.login.model.bean;

import io.reactivex.Observable;

/**
 * Created by Administrator on 2017/8/16.
 */

public interface LoginModel {
    Observable<LoginData> getLogin(String mobilePhone);
    Observable<LoginResult> getLogin1(String mobilePhone,String deviceld);

}
