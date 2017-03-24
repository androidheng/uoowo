package com.uoowo.dao;

import com.uoowo.bean.BbsMythreadExample;
import com.uoowo.bean.BbsMythreadKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BbsMythreadMapper {
    int countByExample(BbsMythreadExample example);

    int deleteByExample(BbsMythreadExample example);

    int deleteByPrimaryKey(BbsMythreadKey key);

    int insert(BbsMythreadKey record);

    int insertSelective(BbsMythreadKey record);

    List<BbsMythreadKey> selectByExample(BbsMythreadExample example);

    int updateByExampleSelective(@Param("record") BbsMythreadKey record, @Param("example") BbsMythreadExample example);

    int updateByExample(@Param("record") BbsMythreadKey record, @Param("example") BbsMythreadExample example);
}