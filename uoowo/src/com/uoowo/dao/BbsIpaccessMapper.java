package com.uoowo.dao;

import com.uoowo.bean.BbsIpaccess;
import com.uoowo.bean.BbsIpaccessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BbsIpaccessMapper {
    int countByExample(BbsIpaccessExample example);

    int deleteByExample(BbsIpaccessExample example);

    int deleteByPrimaryKey(Integer ip);

    int insert(BbsIpaccess record);

    int insertSelective(BbsIpaccess record);

    List<BbsIpaccess> selectByExample(BbsIpaccessExample example);

    BbsIpaccess selectByPrimaryKey(Integer ip);

    int updateByExampleSelective(@Param("record") BbsIpaccess record, @Param("example") BbsIpaccessExample example);

    int updateByExample(@Param("record") BbsIpaccess record, @Param("example") BbsIpaccessExample example);

    int updateByPrimaryKeySelective(BbsIpaccess record);

    int updateByPrimaryKey(BbsIpaccess record);
}