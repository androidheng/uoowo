package com.uoowo.bean;

public class BbsThreadDigest {
    private Integer tid;

    private Short fid;

    private Integer uid;

    private Byte digest;

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

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Byte getDigest() {
        return digest;
    }

    public void setDigest(Byte digest) {
        this.digest = digest;
    }
}