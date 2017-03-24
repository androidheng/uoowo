package com.uoowo.bean;

public class BbsUser {
    private Integer uid;

    private Short gid;

    private String email;

    private String username;

    private String realname;

    private String idnumber;

    private String password;

    private String passwordSms;

    private String salt;

    private String mobile;

    private String qq;

    private Integer threads;

    private Integer posts;

    private Integer credits;

    private Integer golds;

    private Integer rmbs;

    private Integer createIp;

    private Integer createDate;

    private Integer loginIp;

    private Integer loginDate;

    private Integer logins;

    private Integer avatar;

    private Byte digests;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Short getGid() {
        return gid;
    }

    public void setGid(Short gid) {
        this.gid = gid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber == null ? null : idnumber.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPasswordSms() {
        return passwordSms;
    }

    public void setPasswordSms(String passwordSms) {
        this.passwordSms = passwordSms == null ? null : passwordSms.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public Integer getThreads() {
        return threads;
    }

    public void setThreads(Integer threads) {
        this.threads = threads;
    }

    public Integer getPosts() {
        return posts;
    }

    public void setPosts(Integer posts) {
        this.posts = posts;
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

    public Integer getCreateIp() {
        return createIp;
    }

    public void setCreateIp(Integer createIp) {
        this.createIp = createIp;
    }

    public Integer getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Integer createDate) {
        this.createDate = createDate;
    }

    public Integer getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(Integer loginIp) {
        this.loginIp = loginIp;
    }

    public Integer getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Integer loginDate) {
        this.loginDate = loginDate;
    }

    public Integer getLogins() {
        return logins;
    }

    public void setLogins(Integer logins) {
        this.logins = logins;
    }

    public Integer getAvatar() {
        return avatar;
    }

    public void setAvatar(Integer avatar) {
        this.avatar = avatar;
    }

    public Byte getDigests() {
        return digests;
    }

    public void setDigests(Byte digests) {
        this.digests = digests;
    }
}