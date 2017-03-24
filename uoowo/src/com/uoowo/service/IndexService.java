package com.uoowo.service;

import java.util.List;

import com.uoowo.bean.BbsForum;
import com.uoowo.bean.BbsItem;
import com.uoowo.utils.ResultData;

public interface IndexService {
	public List<BbsForum> showIndexNav();
	
	public ResultData<BbsItem> showAllItems(Integer fid,Integer page);
}
