package com.uoowo.dao;

import com.uoowo.bean.BbsForum;
import com.uoowo.bean.BbsForumExample;
import com.uoowo.bean.BbsForumWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BbsForumMapper {
    int countByExample(BbsForumExample example);

    int deleteByExample(BbsForumExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(BbsForumWithBLOBs record);

    int insertSelective(BbsForumWithBLOBs record);

    List<BbsForumWithBLOBs> selectByExampleWithBLOBs(BbsForumExample example);

    List<BbsForum> selectByExample(BbsForumExample example);

    BbsForumWithBLOBs selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") BbsForumWithBLOBs record, @Param("example") BbsForumExample example);

    int updateByExampleWithBLOBs(@Param("record") BbsForumWithBLOBs record, @Param("example") BbsForumExample example);

    int updateByExample(@Param("record") BbsForum record, @Param("example") BbsForumExample example);

    int updateByPrimaryKeySelective(BbsForumWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(BbsForumWithBLOBs record);

    int updateByPrimaryKey(BbsForum record);
}