package com.uoowo.dao;

import com.uoowo.bean.BbsThreadSummary;
import com.uoowo.bean.BbsThreadSummaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BbsThreadSummaryMapper {
    int countByExample(BbsThreadSummaryExample example);

    int deleteByExample(BbsThreadSummaryExample example);

    int deleteByPrimaryKey(Integer tid);

    int insert(BbsThreadSummary record);

    int insertSelective(BbsThreadSummary record);

    List<BbsThreadSummary> selectByExample(BbsThreadSummaryExample example);

    BbsThreadSummary selectByPrimaryKey(Integer tid);

    int updateByExampleSelective(@Param("record") BbsThreadSummary record, @Param("example") BbsThreadSummaryExample example);

    int updateByExample(@Param("record") BbsThreadSummary record, @Param("example") BbsThreadSummaryExample example);

    int updateByPrimaryKeySelective(BbsThreadSummary record);

    int updateByPrimaryKey(BbsThreadSummary record);
}