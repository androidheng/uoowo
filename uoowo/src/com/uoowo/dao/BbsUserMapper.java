package com.uoowo.dao;

import com.uoowo.bean.BbsUser;
import com.uoowo.bean.BbsUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BbsUserMapper {
    int countByExample(BbsUserExample example);

    int deleteByExample(BbsUserExample example);

    int deleteByPrimaryKey(Integer uid);

    int insert(BbsUser record);

    int insertSelective(BbsUser record);

    List<BbsUser> selectByExample(BbsUserExample example);

    BbsUser selectByPrimaryKey(Integer uid);

    int updateByExampleSelective(@Param("record") BbsUser record, @Param("example") BbsUserExample example);

    int updateByExample(@Param("record") BbsUser record, @Param("example") BbsUserExample example);

    int updateByPrimaryKeySelective(BbsUser record);

    int updateByPrimaryKey(BbsUser record);
}