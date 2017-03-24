package com.uoowo.dao;

import com.uoowo.bean.BbsCxyGood;
import com.uoowo.bean.BbsCxyGoodExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BbsCxyGoodMapper {
    int countByExample(BbsCxyGoodExample example);

    int deleteByExample(BbsCxyGoodExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BbsCxyGood record);

    int insertSelective(BbsCxyGood record);

    List<BbsCxyGood> selectByExample(BbsCxyGoodExample example);

    BbsCxyGood selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BbsCxyGood record, @Param("example") BbsCxyGoodExample example);

    int updateByExample(@Param("record") BbsCxyGood record, @Param("example") BbsCxyGoodExample example);

    int updateByPrimaryKeySelective(BbsCxyGood record);

    int updateByPrimaryKey(BbsCxyGood record);
}