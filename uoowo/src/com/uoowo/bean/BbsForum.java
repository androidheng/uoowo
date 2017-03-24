package com.uoowo.bean;

public class BbsForum {
    private Integer fid;

    private String name;

    private Byte rank;

    private Integer threads;

    private Integer todayposts;

    private Integer todaythreads;

    private Integer accesson;

    private Byte orderby;

    private Integer createDate;

    private Integer icon;

    private String moduids;

    private String seoTitle;

    private String seoKeywords;

    private Byte digests;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Byte getRank() {
        return rank;
    }

    public void setRank(Byte rank) {
        this.rank = rank;
    }

    public Integer getThreads() {
        return threads;
    }

    public void setThreads(Integer threads) {
        this.threads = threads;
    }

    public Integer getTodayposts() {
        return todayposts;
    }

    public void setTodayposts(Integer todayposts) {
        this.todayposts = todayposts;
    }

    public Integer getTodaythreads() {
        return todaythreads;
    }

    public void setTodaythreads(Integer todaythreads) {
        this.todaythreads = todaythreads;
    }

    public Integer getAccesson() {
        return accesson;
    }

    public void setAccesson(Integer accesson) {
        this.accesson = accesson;
    }

    public Byte getOrderby() {
        return orderby;
    }

    public void setOrderby(Byte orderby) {
        this.orderby = orderby;
    }

    public Integer getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Integer createDate) {
        this.createDate = createDate;
    }

    public Integer getIcon() {
        return icon;
    }

    public void setIcon(Integer icon) {
        this.icon = icon;
    }

    public String getModuids() {
        return moduids;
    }

    public void setModuids(String moduids) {
        this.moduids = moduids == null ? null : moduids.trim();
    }

    public String getSeoTitle() {
        return seoTitle;
    }

    public void setSeoTitle(String seoTitle) {
        this.seoTitle = seoTitle == null ? null : seoTitle.trim();
    }

    public String getSeoKeywords() {
        return seoKeywords;
    }

    public void setSeoKeywords(String seoKeywords) {
        this.seoKeywords = seoKeywords == null ? null : seoKeywords.trim();
    }

    public Byte getDigests() {
        return digests;
    }

    public void setDigests(Byte digests) {
        this.digests = digests;
    }
}