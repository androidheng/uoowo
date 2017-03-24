package com.uoowo.dao;

import com.uoowo.bean.BbsForumAccess;
import com.uoowo.bean.BbsForumAccessExample;
import com.uoowo.bean.BbsForumAccessKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BbsForumAccessMapper {
    int countByExample(BbsForumAccessExample example);

    int deleteByExample(BbsForumAccessExample example);

    int deleteByPrimaryKey(BbsForumAccessKey key);

    int insert(BbsForumAccess record);

    int insertSelective(BbsForumAccess record);

    List<BbsForumAccess> selectByExample(BbsForumAccessExample example);

    BbsForumAccess selectByPrimaryKey(BbsForumAccessKey key);

    int updateByExampleSelective(@Param("record") BbsForumAccess record, @Param("example") BbsForumAccessExample example);

    int updateByExample(@Param("record") BbsForumAccess record, @Param("example") BbsForumAccessExample example);

    int updateByPrimaryKeySelective(BbsForumAccess record);

    int updateByPrimaryKey(BbsForumAccess record);
}