package com.uoowo.dao;

import com.uoowo.bean.BbsItem;
import com.uoowo.bean.BbsThread;
import com.uoowo.bean.BbsThreadExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface BbsThreadMapper {
    int countByExample(BbsThreadExample example);

    int deleteByExample(BbsThreadExample example);

    int deleteByPrimaryKey(Integer tid);

    int insert(BbsThread record);

    int insertSelective(BbsThread record);

    List<BbsThread> selectByExample(BbsThreadExample example);

    BbsThread selectByPrimaryKey(Integer tid);

    int updateByExampleSelective(@Param("record") BbsThread record, @Param("example") BbsThreadExample example);

    int updateByExample(@Param("record") BbsThread record, @Param("example") BbsThreadExample example);

    int updateByPrimaryKeySelective(BbsThread record);

    int updateByPrimaryKey(BbsThread record);
    
    List<BbsItem> findAllBbsItem(Integer fid);
    List<BbsItem> findAllBbsItems();
}