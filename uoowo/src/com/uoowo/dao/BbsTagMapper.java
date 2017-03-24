package com.uoowo.dao;

import com.uoowo.bean.BbsTag;
import com.uoowo.bean.BbsTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BbsTagMapper {
    int countByExample(BbsTagExample example);

    int deleteByExample(BbsTagExample example);

    int deleteByPrimaryKey(Integer tagid);

    int insert(BbsTag record);

    int insertSelective(BbsTag record);

    List<BbsTag> selectByExample(BbsTagExample example);

    BbsTag selectByPrimaryKey(Integer tagid);

    int updateByExampleSelective(@Param("record") BbsTag record, @Param("example") BbsTagExample example);

    int updateByExample(@Param("record") BbsTag record, @Param("example") BbsTagExample example);

    int updateByPrimaryKeySelective(BbsTag record);

    int updateByPrimaryKey(BbsTag record);
}