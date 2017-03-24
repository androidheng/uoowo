package com.uoowo.bean;

public class BbsPostWithBLOBs extends BbsPost {
    private String message;

    private String messageFmt;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public String getMessageFmt() {
        return messageFmt;
    }

    public void setMessageFmt(String messageFmt) {
        this.messageFmt = messageFmt == null ? null : messageFmt.trim();
    }
}