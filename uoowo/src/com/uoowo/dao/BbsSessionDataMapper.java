package com.uoowo.dao;

import com.uoowo.bean.BbsSessionData;
import com.uoowo.bean.BbsSessionDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BbsSessionDataMapper {
    int countByExample(BbsSessionDataExample example);

    int deleteByExample(BbsSessionDataExample example);

    int deleteByPrimaryKey(String sid);

    int insert(BbsSessionData record);

    int insertSelective(BbsSessionData record);

    List<BbsSessionData> selectByExampleWithBLOBs(BbsSessionDataExample example);

    List<BbsSessionData> selectByExample(BbsSessionDataExample example);

    BbsSessionData selectByPrimaryKey(String sid);

    int updateByExampleSelective(@Param("record") BbsSessionData record, @Param("example") BbsSessionDataExample example);

    int updateByExampleWithBLOBs(@Param("record") BbsSessionData record, @Param("example") BbsSessionDataExample example);

    int updateByExample(@Param("record") BbsSessionData record, @Param("example") BbsSessionDataExample example);

    int updateByPrimaryKeySelective(BbsSessionData record);

    int updateByPrimaryKeyWithBLOBs(BbsSessionData record);

    int updateByPrimaryKey(BbsSessionData record);
}