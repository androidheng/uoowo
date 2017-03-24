package com.uoowo.dao;

import com.uoowo.bean.BbsThreadSearch;
import com.uoowo.bean.BbsThreadSearchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BbsThreadSearchMapper {
    int countByExample(BbsThreadSearchExample example);

    int deleteByExample(BbsThreadSearchExample example);

    int insert(BbsThreadSearch record);

    int insertSelective(BbsThreadSearch record);

    List<BbsThreadSearch> selectByExampleWithBLOBs(BbsThreadSearchExample example);

    List<BbsThreadSearch> selectByExample(BbsThreadSearchExample example);

    int updateByExampleSelective(@Param("record") BbsThreadSearch record, @Param("example") BbsThreadSearchExample example);

    int updateByExampleWithBLOBs(@Param("record") BbsThreadSearch record, @Param("example") BbsThreadSearchExample example);

    int updateByExample(@Param("record") BbsThreadSearch record, @Param("example") BbsThreadSearchExample example);
}