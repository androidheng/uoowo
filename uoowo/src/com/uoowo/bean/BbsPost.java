package com.uoowo.bean;

public class BbsPost {
    private Integer pid;

    private Integer tid;

    private Integer uid;

    private Integer isfirst;

    private Integer createDate;

    private String userip;

    private Short images;

    private Short files;

    private Byte doctype;

    private Integer quotepid;

    private Integer ggReplyRead;

    private Integer ggReplyUser;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getIsfirst() {
        return isfirst;
    }

    public void setIsfirst(Integer isfirst) {
        this.isfirst = isfirst;
    }

    public Integer getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Integer createDate) {
        this.createDate = createDate;
    }

    public String getUserip() {
        return userip;
    }

    public void setUserip(String userip) {
        this.userip = userip;
    }

    public Short getImages() {
        return images;
    }

    public void setImages(Short images) {
        this.images = images;
    }

    public Short getFiles() {
        return files;
    }

    public void setFiles(Short files) {
        this.files = files;
    }

    public Byte getDoctype() {
        return doctype;
    }

    public void setDoctype(Byte doctype) {
        this.doctype = doctype;
    }

    public Integer getQuotepid() {
        return quotepid;
    }

    public void setQuotepid(Integer quotepid) {
        this.quotepid = quotepid;
    }

    public Integer getGgReplyRead() {
        return ggReplyRead;
    }

    public void setGgReplyRead(Integer ggReplyRead) {
        this.ggReplyRead = ggReplyRead;
    }

    public Integer getGgReplyUser() {
        return ggReplyUser;
    }

    public void setGgReplyUser(Integer ggReplyUser) {
        this.ggReplyUser = ggReplyUser;
    }
}