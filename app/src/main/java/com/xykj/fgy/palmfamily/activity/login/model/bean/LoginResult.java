package com.xykj.fgy.palmfamily.activity.login.model.bean;

/**
 * Created by Administrator on 2017/8/16.
 */

public class LoginResult {
    //    {
//        "stageId": "15481501659279102",
//            "classsName": "一班",
//            "schoolName": "太原市八一小学",
//            "mobilePhone": "13623621445",
//            "stageName": "初一",
//            "classId": "07481501753461748",
//            "userInfoId": "80491501719598047",
//            "padTonken": "1",
//            "schoolId": "83221501632050171",
//            "success": true,
//            "teacherName": "丁飞",
//            "message": "登陆成功"
//    }
    private String stageId;
    private String classsName;
    private String schoolName;
    private String mobilePhone;
    private String stageName;
    private String classId;
    private String userInfoId;
    private String padTonken;
    private String schoolId;
    private String success;
    private String teacherName;

    public void setStageId(String stageId) {
        this.stageId = stageId;
    }

    public void setClasssName(String classsName) {
        this.classsName = classsName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public void setUserInfoId(String userInfoId) {
        this.userInfoId = userInfoId;
    }

    public void setPadTonken(String padTonken) {
        this.padTonken = padTonken;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStageId() {

        return stageId;
    }

    public String getClasssName() {
        return classsName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public String getStageName() {
        return stageName;
    }

    public String getClassId() {
        return classId;
    }

    public String getUserInfoId() {
        return userInfoId;
    }

    public String getPadTonken() {
        return padTonken;
    }

    public String getSchoolId() {
        return schoolId;
    }

    public String getSuccess() {
        return success;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public String getMessage() {
        return message;
    }

    private String message;


}
