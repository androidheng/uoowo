package com.uoowo.bean;

public class BbsThread {
    private Integer tid;

    private Short fid;

    private Boolean top;

    private Integer uid;

    private Integer userip;

    private String subject;

    private Integer createDate;

    private Integer lastDate;

    private Integer views;

    private Integer posts;

    private Byte images;

    private Byte files;

    private Byte mods;

    private Boolean closed;

    private Integer firstpid;

    private Integer lastuid;

    private Integer lastpid;

    private Byte digest;

    private String tagids;

    private Integer tagidsTime;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Short getFid() {
        return fid;
    }

    public void setFid(Short fid) {
        this.fid = fid;
    }

    public Boolean getTop() {
        return top;
    }

    public void setTop(Boolean top) {
        this.top = top;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getUserip() {
        return userip;
    }

    public void setUserip(Integer userip) {
        this.userip = userip;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public Integer getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Integer createDate) {
        this.createDate = createDate;
    }

    public Integer getLastDate() {
        return lastDate;
    }

    public void setLastDate(Integer lastDate) {
        this.lastDate = lastDate;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public Integer getPosts() {
        return posts;
    }

    public void setPosts(Integer posts) {
        this.posts = posts;
    }

    public Byte getImages() {
        return images;
    }

    public void setImages(Byte images) {
        this.images = images;
    }

    public Byte getFiles() {
        return files;
    }

    public void setFiles(Byte files) {
        this.files = files;
    }

    public Byte getMods() {
        return mods;
    }

    public void setMods(Byte mods) {
        this.mods = mods;
    }

    public Boolean getClosed() {
        return closed;
    }

    public void setClosed(Boolean closed) {
        this.closed = closed;
    }

    public Integer getFirstpid() {
        return firstpid;
    }

    public void setFirstpid(Integer firstpid) {
        this.firstpid = firstpid;
    }

    public Integer getLastuid() {
        return lastuid;
    }

    public void setLastuid(Integer lastuid) {
        this.lastuid = lastuid;
    }

    public Integer getLastpid() {
        return lastpid;
    }

    public void setLastpid(Integer lastpid) {
        this.lastpid = lastpid;
    }

    public Byte getDigest() {
        return digest;
    }

    public void setDigest(Byte digest) {
        this.digest = digest;
    }

    public String getTagids() {
        return tagids;
    }

    public void setTagids(String tagids) {
        this.tagids = tagids == null ? null : tagids.trim();
    }

    public Integer getTagidsTime() {
        return tagidsTime;
    }

    public void setTagidsTime(Integer tagidsTime) {
        this.tagidsTime = tagidsTime;
    }
}