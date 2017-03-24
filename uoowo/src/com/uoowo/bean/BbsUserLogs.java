package com.uoowo.bean;

public class BbsUserLogs {
    private Integer id;

    private Integer uid;

    private Integer loginIp;

    private Integer loginDate;

    private String ua;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(Integer loginIp) {
        this.loginIp = loginIp;
    }

    public Integer getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Integer loginDate) {
        this.loginDate = loginDate;
    }

    public String getUa() {
        return ua;
    }

    public void setUa(String ua) {
        this.ua = ua == null ? null : ua.trim();
    }
}