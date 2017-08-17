package com.xykj.fgy.palmfamily.api;


import com.xykj.fgy.palmfamily.activity.login.model.bean.LoginData;
import com.xykj.fgy.palmfamily.activity.login.model.bean.LoginResult;

import io.reactivex.Observable;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by lvr on 2017/2/8.
 */

public interface ApiService {
    //  public static final String sendVerificationCode = "http://8090.imwork.net:3000/palmFamily/client/sendVerificationCode/";

    @POST("mobilePhone")
    Observable<LoginData> getLogin(@Query("mobilePhone") String mobilePhone);

    @POST("loginClass")
    Observable<LoginResult> getLogin(@Query("mobilePhone") String mobilePhone,
                                     @Query("deviceld") String deviceld);

}
