package com.uoowo.bean;

public class BbsKv {
    private String k;

    private Integer expiry;

    private String v;

    public String getK() {
        return k;
    }

    public void setK(String k) {
        this.k = k == null ? null : k.trim();
    }

    public Integer getExpiry() {
        return expiry;
    }

    public void setExpiry(Integer expiry) {
        this.expiry = expiry;
    }

    public String getV() {
        return v;
    }

    public void setV(String v) {
        this.v = v == null ? null : v.trim();
    }
}