package com.uoowo.dao;

import com.uoowo.bean.BbsPost;
import com.uoowo.bean.BbsPostExample;
import com.uoowo.bean.BbsPostWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BbsPostMapper {
    int countByExample(BbsPostExample example);

    int deleteByExample(BbsPostExample example);

    int deleteByPrimaryKey(Integer pid);

    int insert(BbsPostWithBLOBs record);

    int insertSelective(BbsPostWithBLOBs record);

    List<BbsPostWithBLOBs> selectByExampleWithBLOBs(BbsPostExample example);

    List<BbsPost> selectByExample(BbsPostExample example);

    BbsPostWithBLOBs selectByPrimaryKey(Integer pid);

    int updateByExampleSelective(@Param("record") BbsPostWithBLOBs record, @Param("example") BbsPostExample example);

    int updateByExampleWithBLOBs(@Param("record") BbsPostWithBLOBs record, @Param("example") BbsPostExample example);

    int updateByExample(@Param("record") BbsPost record, @Param("example") BbsPostExample example);

    int updateByPrimaryKeySelective(BbsPostWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(BbsPostWithBLOBs record);

    int updateByPrimaryKey(BbsPost record);
}