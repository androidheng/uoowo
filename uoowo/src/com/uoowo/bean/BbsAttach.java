package com.uoowo.bean;

public class BbsAttach {
    private Integer aid;

    private Integer tid;

    private Integer pid;

    private Integer uid;

    private Integer filesize;

    private Integer width;

    private Integer height;

    private String filename;

    private String orgfilename;

    private String filetype;

    private Integer createDate;

    private String comment;

    private Integer downloads;

    private Integer credits;

    private Integer golds;

    private Integer rmbs;

    private Byte isimage;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getFilesize() {
        return filesize;
    }

    public void setFilesize(Integer filesize) {
        this.filesize = filesize;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    public String getOrgfilename() {
        return orgfilename;
    }

    public void setOrgfilename(String orgfilename) {
        this.orgfilename = orgfilename == null ? null : orgfilename.trim();
    }

    public String getFiletype() {
        return filetype;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype == null ? null : filetype.trim();
    }

    public Integer getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Integer createDate) {
        this.createDate = createDate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public Integer getDownloads() {
        return downloads;
    }

    public void setDownloads(Integer downloads) {
        this.downloads = downloads;
    }

    public Integer getCredits() {
        return credits;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }

    public Integer getGolds() {
        return golds;
    }

    public void setGolds(Integer golds) {
        this.golds = golds;
    }

    public Integer getRmbs() {
        return rmbs;
    }

    public void setRmbs(Integer rmbs) {
        this.rmbs = rmbs;
    }

    public Byte getIsimage() {
        return isimage;
    }

    public void setIsimage(Byte isimage) {
        this.isimage = isimage;
    }
}