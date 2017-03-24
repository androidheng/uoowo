package com.uoowo.bean;

public class BbsTableDay extends BbsTableDayKey {
    private Integer createDate;

    private Integer maxid;

    private Integer count;

    public Integer getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Integer createDate) {
        this.createDate = createDate;
    }

    public Integer getMaxid() {
        return maxid;
    }

    public void setMaxid(Integer maxid) {
        this.maxid = maxid;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}