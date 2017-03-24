package com.uoowo.dao;

import com.uoowo.bean.BbsFriendlink;
import com.uoowo.bean.BbsFriendlinkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BbsFriendlinkMapper {
    int countByExample(BbsFriendlinkExample example);

    int deleteByExample(BbsFriendlinkExample example);

    int deleteByPrimaryKey(Long linkid);

    int insert(BbsFriendlink record);

    int insertSelective(BbsFriendlink record);

    List<BbsFriendlink> selectByExample(BbsFriendlinkExample example);

    BbsFriendlink selectByPrimaryKey(Long linkid);

    int updateByExampleSelective(@Param("record") BbsFriendlink record, @Param("example") BbsFriendlinkExample example);

    int updateByExample(@Param("record") BbsFriendlink record, @Param("example") BbsFriendlinkExample example);

    int updateByPrimaryKeySelective(BbsFriendlink record);

    int updateByPrimaryKey(BbsFriendlink record);
}