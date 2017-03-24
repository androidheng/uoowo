package com.uoowo.bean;

public class BbsUserOpenPlat {
    private Integer uid;

    private Boolean platid;

    private String openid;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Boolean getPlatid() {
        return platid;
    }

    public void setPlatid(Boolean platid) {
        this.platid = platid;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }
}