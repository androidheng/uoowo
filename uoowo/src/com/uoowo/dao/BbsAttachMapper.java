package com.uoowo.dao;

import com.uoowo.bean.BbsAttach;
import com.uoowo.bean.BbsAttachExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BbsAttachMapper {
    int countByExample(BbsAttachExample example);

    int deleteByExample(BbsAttachExample example);

    int deleteByPrimaryKey(Integer aid);

    int insert(BbsAttach record);

    int insertSelective(BbsAttach record);

    List<BbsAttach> selectByExample(BbsAttachExample example);

    BbsAttach selectByPrimaryKey(Integer aid);

    int updateByExampleSelective(@Param("record") BbsAttach record, @Param("example") BbsAttachExample example);

    int updateByExample(@Param("record") BbsAttach record, @Param("example") BbsAttachExample example);

    int updateByPrimaryKeySelective(BbsAttach record);

    int updateByPrimaryKey(BbsAttach record);
}