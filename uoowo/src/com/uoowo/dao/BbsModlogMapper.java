package com.uoowo.dao;

import com.uoowo.bean.BbsModlog;
import com.uoowo.bean.BbsModlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BbsModlogMapper {
    int countByExample(BbsModlogExample example);

    int deleteByExample(BbsModlogExample example);

    int deleteByPrimaryKey(Integer logid);

    int insert(BbsModlog record);

    int insertSelective(BbsModlog record);

    List<BbsModlog> selectByExample(BbsModlogExample example);

    BbsModlog selectByPrimaryKey(Integer logid);

    int updateByExampleSelective(@Param("record") BbsModlog record, @Param("example") BbsModlogExample example);

    int updateByExample(@Param("record") BbsModlog record, @Param("example") BbsModlogExample example);

    int updateByPrimaryKeySelective(BbsModlog record);

    int updateByPrimaryKey(BbsModlog record);
}