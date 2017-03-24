package com.uoowo.bean;

public class BbsSession {
    private String sid;

    private Integer uid;

    private Byte fid;

    private String url;

    private Integer ip;

    private String useragent;

    private String data;

    private Boolean bigdata;

    private Integer lastDate;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Byte getFid() {
        return fid;
    }

    public void setFid(Byte fid) {
        this.fid = fid;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getIp() {
        return ip;
    }

    public void setIp(Integer ip) {
        this.ip = ip;
    }

    public String getUseragent() {
        return useragent;
    }

    public void setUseragent(String useragent) {
        this.useragent = useragent == null ? null : useragent.trim();
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data == null ? null : data.trim();
    }

    public Boolean getBigdata() {
        return bigdata;
    }

    public void setBigdata(Boolean bigdata) {
        this.bigdata = bigdata;
    }

    public Integer getLastDate() {
        return lastDate;
    }

    public void setLastDate(Integer lastDate) {
        this.lastDate = lastDate;
    }
}