package com.uoowo.dao;

import com.uoowo.bean.BbsThreadTop;
import com.uoowo.bean.BbsThreadTopExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BbsThreadTopMapper {
    int countByExample(BbsThreadTopExample example);

    int deleteByExample(BbsThreadTopExample example);

    int deleteByPrimaryKey(Integer tid);

    int insert(BbsThreadTop record);

    int insertSelective(BbsThreadTop record);

    List<BbsThreadTop> selectByExample(BbsThreadTopExample example);

    BbsThreadTop selectByPrimaryKey(Integer tid);

    int updateByExampleSelective(@Param("record") BbsThreadTop record, @Param("example") BbsThreadTopExample example);

    int updateByExample(@Param("record") BbsThreadTop record, @Param("example") BbsThreadTopExample example);

    int updateByPrimaryKeySelective(BbsThreadTop record);

    int updateByPrimaryKey(BbsThreadTop record);
}