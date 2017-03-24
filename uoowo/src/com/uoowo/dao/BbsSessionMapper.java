package com.uoowo.dao;

import com.uoowo.bean.BbsSession;
import com.uoowo.bean.BbsSessionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BbsSessionMapper {
    int countByExample(BbsSessionExample example);

    int deleteByExample(BbsSessionExample example);

    int deleteByPrimaryKey(String sid);

    int insert(BbsSession record);

    int insertSelective(BbsSession record);

    List<BbsSession> selectByExample(BbsSessionExample example);

    BbsSession selectByPrimaryKey(String sid);

    int updateByExampleSelective(@Param("record") BbsSession record, @Param("example") BbsSessionExample example);

    int updateByExample(@Param("record") BbsSession record, @Param("example") BbsSessionExample example);

    int updateByPrimaryKeySelective(BbsSession record);

    int updateByPrimaryKey(BbsSession record);
}