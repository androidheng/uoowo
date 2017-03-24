package com.uoowo.dao;

import com.uoowo.bean.BbsTableDay;
import com.uoowo.bean.BbsTableDayExample;
import com.uoowo.bean.BbsTableDayKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BbsTableDayMapper {
    int countByExample(BbsTableDayExample example);

    int deleteByExample(BbsTableDayExample example);

    int deleteByPrimaryKey(BbsTableDayKey key);

    int insert(BbsTableDay record);

    int insertSelective(BbsTableDay record);

    List<BbsTableDay> selectByExample(BbsTableDayExample example);

    BbsTableDay selectByPrimaryKey(BbsTableDayKey key);

    int updateByExampleSelective(@Param("record") BbsTableDay record, @Param("example") BbsTableDayExample example);

    int updateByExample(@Param("record") BbsTableDay record, @Param("example") BbsTableDayExample example);

    int updateByPrimaryKeySelective(BbsTableDay record);

    int updateByPrimaryKey(BbsTableDay record);
}