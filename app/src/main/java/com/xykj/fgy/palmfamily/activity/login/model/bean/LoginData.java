package com.xykj.fgy.palmfamily.activity.login.model.bean;

/**
 * Created by Administrator on 2017/8/16.
 */

public class LoginData {
    private String verificationCode;
    private String success;

    public String getSuccess() {
        return success;
    }

    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }

    public void setSuccess(String success) {
        this.success = success;
    }
}
