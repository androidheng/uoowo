package com.uoowo.dao;

import com.uoowo.bean.BbsUserLogs;
import com.uoowo.bean.BbsUserLogsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BbsUserLogsMapper {
    int countByExample(BbsUserLogsExample example);

    int deleteByExample(BbsUserLogsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BbsUserLogs record);

    int insertSelective(BbsUserLogs record);

    List<BbsUserLogs> selectByExample(BbsUserLogsExample example);

    BbsUserLogs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BbsUserLogs record, @Param("example") BbsUserLogsExample example);

    int updateByExample(@Param("record") BbsUserLogs record, @Param("example") BbsUserLogsExample example);

    int updateByPrimaryKeySelective(BbsUserLogs record);

    int updateByPrimaryKey(BbsUserLogs record);
}