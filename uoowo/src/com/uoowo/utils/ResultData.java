package com.uoowo.utils;

import java.util.List;

public class ResultData<T> {
	private List<T> data;
	private Integer totalPage;
	public List<T> getData() {
		return data;
	}
	public void setData(List<T> data) {
		this.data = data;
	}
	public Integer getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}
	
}
