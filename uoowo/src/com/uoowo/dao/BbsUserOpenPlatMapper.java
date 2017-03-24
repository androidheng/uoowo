package com.uoowo.dao;

import com.uoowo.bean.BbsUserOpenPlat;
import com.uoowo.bean.BbsUserOpenPlatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BbsUserOpenPlatMapper {
    int countByExample(BbsUserOpenPlatExample example);

    int deleteByExample(BbsUserOpenPlatExample example);

    int deleteByPrimaryKey(Integer uid);

    int insert(BbsUserOpenPlat record);

    int insertSelective(BbsUserOpenPlat record);

    List<BbsUserOpenPlat> selectByExample(BbsUserOpenPlatExample example);

    BbsUserOpenPlat selectByPrimaryKey(Integer uid);

    int updateByExampleSelective(@Param("record") BbsUserOpenPlat record, @Param("example") BbsUserOpenPlatExample example);

    int updateByExample(@Param("record") BbsUserOpenPlat record, @Param("example") BbsUserOpenPlatExample example);

    int updateByPrimaryKeySelective(BbsUserOpenPlat record);

    int updateByPrimaryKey(BbsUserOpenPlat record);
}