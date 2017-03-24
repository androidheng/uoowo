package com.uoowo.dao;

import com.uoowo.bean.BbsCache;
import com.uoowo.bean.BbsCacheExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BbsCacheMapper {
    int countByExample(BbsCacheExample example);

    int deleteByExample(BbsCacheExample example);

    int deleteByPrimaryKey(String k);

    int insert(BbsCache record);

    int insertSelective(BbsCache record);

    List<BbsCache> selectByExampleWithBLOBs(BbsCacheExample example);

    List<BbsCache> selectByExample(BbsCacheExample example);

    BbsCache selectByPrimaryKey(String k);

    int updateByExampleSelective(@Param("record") BbsCache record, @Param("example") BbsCacheExample example);

    int updateByExampleWithBLOBs(@Param("record") BbsCache record, @Param("example") BbsCacheExample example);

    int updateByExample(@Param("record") BbsCache record, @Param("example") BbsCacheExample example);

    int updateByPrimaryKeySelective(BbsCache record);

    int updateByPrimaryKeyWithBLOBs(BbsCache record);

    int updateByPrimaryKey(BbsCache record);
}