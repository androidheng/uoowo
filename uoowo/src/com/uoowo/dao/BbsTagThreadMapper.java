package com.uoowo.dao;

import com.uoowo.bean.BbsTagThreadExample;
import com.uoowo.bean.BbsTagThreadKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BbsTagThreadMapper {
    int countByExample(BbsTagThreadExample example);

    int deleteByExample(BbsTagThreadExample example);

    int deleteByPrimaryKey(BbsTagThreadKey key);

    int insert(BbsTagThreadKey record);

    int insertSelective(BbsTagThreadKey record);

    List<BbsTagThreadKey> selectByExample(BbsTagThreadExample example);

    int updateByExampleSelective(@Param("record") BbsTagThreadKey record, @Param("example") BbsTagThreadExample example);

    int updateByExample(@Param("record") BbsTagThreadKey record, @Param("example") BbsTagThreadExample example);
}