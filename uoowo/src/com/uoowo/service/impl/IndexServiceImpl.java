package com.uoowo.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.uoowo.bean.BbsForum;
import com.uoowo.bean.BbsForumExample;
import com.uoowo.bean.BbsItem;
import com.uoowo.bean.BbsThread;
import com.uoowo.bean.BbsThreadExample;
import com.uoowo.bean.BbsThreadExample.Criteria;
import com.uoowo.dao.BbsForumMapper;
import com.uoowo.dao.BbsPostMapper;
import com.uoowo.dao.BbsThreadMapper;
import com.uoowo.service.IndexService;
import com.uoowo.utils.HTMLTagUtils;
import com.uoowo.utils.ResultData;
@Service
public class IndexServiceImpl implements IndexService{
	@Autowired
	BbsForumMapper bbsForumMapper;
	
	@Autowired
	BbsPostMapper bbsPostMapper;
	
	@Autowired
	BbsThreadMapper bbsThreadMapper;
	@Override
	public List<BbsForum> showIndexNav() {
		BbsForumExample example=new BbsForumExample();
		example.setOrderByClause("rank desc");
		
		List<BbsForum> selectByExample = bbsForumMapper.selectByExample(example);
		return selectByExample;
	}
	@Override
	public ResultData<BbsItem> showAllItems(Integer fid,Integer page) {
		List<BbsItem> bbsItems=null; 
		BbsThreadExample  bbsThreadExample= new BbsThreadExample();
		//PageHelper.startPage(1, 10);
		
		if(fid.equals(0)){
			bbsItems= bbsThreadMapper.findAllBbsItems();
		}else{
			bbsItems = bbsThreadMapper.findAllBbsItem(fid);
			Criteria criteria = bbsThreadExample.createCriteria();
			criteria.andFidEqualTo(fid.shortValue());
		}
		List<BbsThread> bbsThreadList = bbsThreadMapper.selectByExample(bbsThreadExample);
		
		List<BbsItem> newBbsItems=new ArrayList<BbsItem>();
		//Set<BbsItem> bbSet=new HashSet<BbsItem>();
		boolean flag=true;
		BbsItem bbsItem=null;
		List<String> imageUrl=new ArrayList<String>();
		Set<String> set=new HashSet<String>();
		for (int i = 0; i < bbsThreadList.size(); i++) {
			flag=true;
			for (int j = 0; j < bbsItems.size(); j++) {
				Integer ss=bbsThreadList.get(i).getTid();
				Integer yy=bbsItems.get(j).getTid();
				System.out.println(ss.equals(yy));
				if(bbsThreadList.get(i).getTid().equals(bbsItems.get(j).getTid())){
					if(flag){
						bbsItem=new BbsItem();
						
						set=new HashSet<String>();
						bbsItem.setFid(bbsItems.get(j).getFid());
						bbsItem.setName(bbsItems.get(j).getName());
						bbsItem.setTid(bbsItems.get(j).getTid());
						bbsItem.setUid(bbsItems.get(j).getUid());
						bbsItem.setUsername(bbsItems.get(j).getUsername());
						bbsItem.setSubject(bbsItems.get(j).getSubject());
						bbsItem.setCreate_date(bbsItems.get(j).getCreate_date());
						bbsItem.setViews(bbsItems.get(j).getViews());
						bbsItem.setPosts(bbsItems.get(j).getPosts());
						bbsItem.setPid(bbsItems.get(j).getPid());
						bbsItem.setImages(bbsItems.get(j).getImages());
						String message=bbsItems.get(j).getMessage();
						bbsItem.setMessage(HTMLTagUtils.delHTMLTag(bbsItems.get(j).getMessage()));
						bbsItem.setMessage_fmt(bbsItems.get(j).getMessage_fmt());
					}
					flag=false;
					String url=bbsItems.get(j).getFilename();
					if(url!=null){
						if(url.startsWith("http://")){
							set.add(bbsItems.get(j).getFilename());
						}else{
							set.add("http://www.ofuns.cc/bbs/upload/attach/"+bbsItems.get(j).getFilename());
						}
					}
					
					
				}
			}
			imageUrl=new ArrayList<String>(set);
			if(bbsItem!=null){
				bbsItem.setImageUrls(imageUrl);
			}
			if(!flag){
				newBbsItems.add(bbsItem);
			}
			//bbSet.add(bbsItem);
		}
		List<BbsItem> showAllItems=page*10>newBbsItems.size()?newBbsItems.subList(0, newBbsItems.size()):newBbsItems.subList(0, page*10);
		ResultData<BbsItem> data=new ResultData<BbsItem>();
		data.setData(showAllItems);
		int pageSize=10;
		int totalPages=showAllItems.size()%pageSize==0?newBbsItems.size()/pageSize:newBbsItems.size()/pageSize+1;
		data.setTotalPage(totalPages);
		return data;
	}

}
