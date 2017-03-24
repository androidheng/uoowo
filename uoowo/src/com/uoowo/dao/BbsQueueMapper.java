package com.uoowo.dao;

import com.uoowo.bean.BbsQueue;
import com.uoowo.bean.BbsQueueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BbsQueueMapper {
    int countByExample(BbsQueueExample example);

    int deleteByExample(BbsQueueExample example);

    int insert(BbsQueue record);

    int insertSelective(BbsQueue record);

    List<BbsQueue> selectByExample(BbsQueueExample example);

    int updateByExampleSelective(@Param("record") BbsQueue record, @Param("example") BbsQueueExample example);

    int updateByExample(@Param("record") BbsQueue record, @Param("example") BbsQueueExample example);
}