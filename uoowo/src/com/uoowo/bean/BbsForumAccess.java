package com.uoowo.bean;

public class BbsForumAccess extends BbsForumAccessKey {
    private Boolean allowread;

    private Boolean allowthread;

    private Boolean allowpost;

    private Boolean allowattach;

    private Boolean allowdown;

    public Boolean getAllowread() {
        return allowread;
    }

    public void setAllowread(Boolean allowread) {
        this.allowread = allowread;
    }

    public Boolean getAllowthread() {
        return allowthread;
    }

    public void setAllowthread(Boolean allowthread) {
        this.allowthread = allowthread;
    }

    public Boolean getAllowpost() {
        return allowpost;
    }

    public void setAllowpost(Boolean allowpost) {
        this.allowpost = allowpost;
    }

    public Boolean getAllowattach() {
        return allowattach;
    }

    public void setAllowattach(Boolean allowattach) {
        this.allowattach = allowattach;
    }

    public Boolean getAllowdown() {
        return allowdown;
    }

    public void setAllowdown(Boolean allowdown) {
        this.allowdown = allowdown;
    }
}