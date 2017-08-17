package com.xykj.fgy.palmfamily.activity.login.model.bean.impl;

import com.xykj.fgy.palmfamily.activity.login.model.bean.LoginData;
import com.xykj.fgy.palmfamily.activity.login.model.bean.LoginModel;
import com.xykj.fgy.palmfamily.activity.login.model.bean.LoginResult;
import com.xykj.fgy.palmfamily.api.ApiService;
import com.xykj.fgy.palmfamily.app.AppApplication;
import com.xykj.fgy.palmfamily.client.RetrofitClient;

import io.reactivex.Observable;
import io.reactivex.functions.Function;

/**
 * Created by Administrator on 2017/8/16.
 */

public class LoginModelImpl implements LoginModel {

    @Override
    public Observable<LoginData> getLogin(String mobilePhone) {
        RetrofitClient client = RetrofitClient.getInstance(AppApplication.getAppContext(), RetrofitClient.Base_URL);
        ApiService apiService = client.create(ApiService.class);
        return apiService.getLogin(mobilePhone).map(new Function<LoginData, LoginData>() {
            @Override
            public LoginData apply(LoginData loginData) throws Exception {
                return loginData;
            }
        }).compose(RetrofitClient.schedulersTransformer);
    }

    @Override
    public Observable<LoginResult> getLogin1(String mobilePhone, String deviceld) {
        RetrofitClient client = RetrofitClient.getInstance(AppApplication.getAppContext(), RetrofitClient.Base_URL);
        ApiService apiService = client.create(ApiService.class);

        return apiService.getLogin(mobilePhone, deviceld).map(new Function<LoginResult, LoginResult>() {
            @Override
            public LoginResult apply(LoginResult LoginResult) throws Exception {
                return LoginResult;
            }
        }).compose(RetrofitClient.schedulersTransformer);

    }
}
