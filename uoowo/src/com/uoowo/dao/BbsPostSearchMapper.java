package com.uoowo.dao;

import com.uoowo.bean.BbsPostSearch;
import com.uoowo.bean.BbsPostSearchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BbsPostSearchMapper {
    int countByExample(BbsPostSearchExample example);

    int deleteByExample(BbsPostSearchExample example);

    int insert(BbsPostSearch record);

    int insertSelective(BbsPostSearch record);

    List<BbsPostSearch> selectByExampleWithBLOBs(BbsPostSearchExample example);

    List<BbsPostSearch> selectByExample(BbsPostSearchExample example);

    int updateByExampleSelective(@Param("record") BbsPostSearch record, @Param("example") BbsPostSearchExample example);

    int updateByExampleWithBLOBs(@Param("record") BbsPostSearch record, @Param("example") BbsPostSearchExample example);

    int updateByExample(@Param("record") BbsPostSearch record, @Param("example") BbsPostSearchExample example);
}