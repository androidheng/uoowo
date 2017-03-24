package com.uoowo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.uoowo.bean.BbsForum;
import com.uoowo.bean.BbsItem;
import com.uoowo.service.IndexService;
import com.uoowo.utils.ResultData;

@Controller
public class IndexController {
	@Autowired
	IndexService indexService;
	@RequestMapping(value="/navList",method=RequestMethod.POST,produces="application/json;charset=utf-8")
	@ResponseBody
	public String showNav(){
		Map<String, Object> map=new HashMap<String, Object>();
		List<BbsForum> showIndexNav = indexService.showIndexNav();
		map.put("code", "1");
		map.put("content", showIndexNav);
		map.put("msg", "数据请求成功");
		return JSON.toJSONString(map);
	}
	@RequestMapping(value="/index",method=RequestMethod.POST,produces="application/json;charset=utf-8")
	@ResponseBody
	public String index(HttpServletRequest request,String page,String fid){
		Integer pages=Integer.parseInt(page);
		Integer fids=Integer.parseInt(fid);
		int pageSize=10;
		Map<String, Object> map=new HashMap<String, Object>();
		ResultData<BbsItem> data = indexService.showAllItems(fids,pages);
		//System.out.println(showAllItems.size());
		map.put("code", "1");
		map.put("content", data);
		map.put("msg", "数据请求成功");
		return JSON.toJSONString(map);
	}
}
