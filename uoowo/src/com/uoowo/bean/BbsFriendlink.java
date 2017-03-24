package com.uoowo.bean;

public class BbsFriendlink {
    private Long linkid;

    private Short type;

    private Short rank;

    private Integer createDate;

    private String name;

    private String url;

    public Long getLinkid() {
        return linkid;
    }

    public void setLinkid(Long linkid) {
        this.linkid = linkid;
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public Short getRank() {
        return rank;
    }

    public void setRank(Short rank) {
        this.rank = rank;
    }

    public Integer getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Integer createDate) {
        this.createDate = createDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }
}