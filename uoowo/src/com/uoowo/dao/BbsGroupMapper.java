package com.uoowo.dao;

import com.uoowo.bean.BbsGroup;
import com.uoowo.bean.BbsGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BbsGroupMapper {
    int countByExample(BbsGroupExample example);

    int deleteByExample(BbsGroupExample example);

    int deleteByPrimaryKey(Short gid);

    int insert(BbsGroup record);

    int insertSelective(BbsGroup record);

    List<BbsGroup> selectByExample(BbsGroupExample example);

    BbsGroup selectByPrimaryKey(Short gid);

    int updateByExampleSelective(@Param("record") BbsGroup record, @Param("example") BbsGroupExample example);

    int updateByExample(@Param("record") BbsGroup record, @Param("example") BbsGroupExample example);

    int updateByPrimaryKeySelective(BbsGroup record);

    int updateByPrimaryKey(BbsGroup record);
}