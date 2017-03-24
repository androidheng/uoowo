package com.uoowo.dao;

import com.uoowo.bean.BbsKv;
import com.uoowo.bean.BbsKvExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BbsKvMapper {
    int countByExample(BbsKvExample example);

    int deleteByExample(BbsKvExample example);

    int deleteByPrimaryKey(String k);

    int insert(BbsKv record);

    int insertSelective(BbsKv record);

    List<BbsKv> selectByExampleWithBLOBs(BbsKvExample example);

    List<BbsKv> selectByExample(BbsKvExample example);

    BbsKv selectByPrimaryKey(String k);

    int updateByExampleSelective(@Param("record") BbsKv record, @Param("example") BbsKvExample example);

    int updateByExampleWithBLOBs(@Param("record") BbsKv record, @Param("example") BbsKvExample example);

    int updateByExample(@Param("record") BbsKv record, @Param("example") BbsKvExample example);

    int updateByPrimaryKeySelective(BbsKv record);

    int updateByPrimaryKeyWithBLOBs(BbsKv record);

    int updateByPrimaryKey(BbsKv record);
}