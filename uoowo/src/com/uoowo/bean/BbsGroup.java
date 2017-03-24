package com.uoowo.bean;

public class BbsGroup {
    private Short gid;

    private String name;

    private Integer creditsfrom;

    private Integer creditsto;

    private Integer allowread;

    private Integer allowthread;

    private Integer allowpost;

    private Integer allowattach;

    private Integer allowdown;

    private Integer allowtop;

    private Integer allowupdate;

    private Integer allowdelete;

    private Integer allowmove;

    private Integer allowbanuser;

    private Integer allowdeleteuser;

    private Integer allowviewip;

    public Short getGid() {
        return gid;
    }

    public void setGid(Short gid) {
        this.gid = gid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getCreditsfrom() {
        return creditsfrom;
    }

    public void setCreditsfrom(Integer creditsfrom) {
        this.creditsfrom = creditsfrom;
    }

    public Integer getCreditsto() {
        return creditsto;
    }

    public void setCreditsto(Integer creditsto) {
        this.creditsto = creditsto;
    }

    public Integer getAllowread() {
        return allowread;
    }

    public void setAllowread(Integer allowread) {
        this.allowread = allowread;
    }

    public Integer getAllowthread() {
        return allowthread;
    }

    public void setAllowthread(Integer allowthread) {
        this.allowthread = allowthread;
    }

    public Integer getAllowpost() {
        return allowpost;
    }

    public void setAllowpost(Integer allowpost) {
        this.allowpost = allowpost;
    }

    public Integer getAllowattach() {
        return allowattach;
    }

    public void setAllowattach(Integer allowattach) {
        this.allowattach = allowattach;
    }

    public Integer getAllowdown() {
        return allowdown;
    }

    public void setAllowdown(Integer allowdown) {
        this.allowdown = allowdown;
    }

    public Integer getAllowtop() {
        return allowtop;
    }

    public void setAllowtop(Integer allowtop) {
        this.allowtop = allowtop;
    }

    public Integer getAllowupdate() {
        return allowupdate;
    }

    public void setAllowupdate(Integer allowupdate) {
        this.allowupdate = allowupdate;
    }

    public Integer getAllowdelete() {
        return allowdelete;
    }

    public void setAllowdelete(Integer allowdelete) {
        this.allowdelete = allowdelete;
    }

    public Integer getAllowmove() {
        return allowmove;
    }

    public void setAllowmove(Integer allowmove) {
        this.allowmove = allowmove;
    }

    public Integer getAllowbanuser() {
        return allowbanuser;
    }

    public void setAllowbanuser(Integer allowbanuser) {
        this.allowbanuser = allowbanuser;
    }

    public Integer getAllowdeleteuser() {
        return allowdeleteuser;
    }

    public void setAllowdeleteuser(Integer allowdeleteuser) {
        this.allowdeleteuser = allowdeleteuser;
    }

    public Integer getAllowviewip() {
        return allowviewip;
    }

    public void setAllowviewip(Integer allowviewip) {
        this.allowviewip = allowviewip;
    }
}