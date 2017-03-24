package com.uoowo.dao;

import com.uoowo.bean.BbsThreadDigest;
import com.uoowo.bean.BbsThreadDigestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BbsThreadDigestMapper {
    int countByExample(BbsThreadDigestExample example);

    int deleteByExample(BbsThreadDigestExample example);

    int deleteByPrimaryKey(Integer tid);

    int insert(BbsThreadDigest record);

    int insertSelective(BbsThreadDigest record);

    List<BbsThreadDigest> selectByExample(BbsThreadDigestExample example);

    BbsThreadDigest selectByPrimaryKey(Integer tid);

    int updateByExampleSelective(@Param("record") BbsThreadDigest record, @Param("example") BbsThreadDigestExample example);

    int updateByExample(@Param("record") BbsThreadDigest record, @Param("example") BbsThreadDigestExample example);

    int updateByPrimaryKeySelective(BbsThreadDigest record);

    int updateByPrimaryKey(BbsThreadDigest record);
}