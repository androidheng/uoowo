package com.uoowo.bean;

import java.util.List;

public class BbsItem {
	private Integer fid;
	private String name;
	private Integer tid;
	private Integer uid;
	private String username;
	private String subject;
	private String create_date;
	private Integer views; //浏览次数
	private Integer posts; //评论次数
	private Integer pid;
	private Integer images;
	private String message;
	private String message_fmt;
	private String filename;
	List<String> imageUrls;
	public Integer getFid() {
		return fid;
	}
	public void setFid(Integer fid) {
		this.fid = fid;
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
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getCreate_date() {
		return create_date;
	}
	public void setCreate_date(String create_date) {
		this.create_date = create_date;
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
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public Integer getImages() {
		return images;
	}
	public void setImages(Integer images) {
		this.images = images;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage_fmt() {
		return message_fmt;
	}
	public void setMessage_fmt(String message_fmt) {
		this.message_fmt = message_fmt;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public List<String> getImageUrls() {
		return imageUrls;
	}
	public void setImageUrls(List<String> imageUrls) {
		this.imageUrls = imageUrls;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
}
