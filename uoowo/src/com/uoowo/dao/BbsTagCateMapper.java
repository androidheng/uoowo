package com.uoowo.dao;

import com.uoowo.bean.BbsTagCate;
import com.uoowo.bean.BbsTagCateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BbsTagCateMapper {
    int countByExample(BbsTagCateExample example);

    int deleteByExample(BbsTagCateExample example);

    int deleteByPrimaryKey(Integer cateid);

    int insert(BbsTagCate record);

    int insertSelective(BbsTagCate record);

    List<BbsTagCate> selectByExample(BbsTagCateExample example);

    BbsTagCate selectByPrimaryKey(Integer cateid);

    int updateByExampleSelective(@Param("record") BbsTagCate record, @Param("example") BbsTagCateExample example);

    int updateByExample(@Param("record") BbsTagCate record, @Param("example") BbsTagCateExample example);

    int updateByPrimaryKeySelective(BbsTagCate record);

    int updateByPrimaryKey(BbsTagCate record);
}