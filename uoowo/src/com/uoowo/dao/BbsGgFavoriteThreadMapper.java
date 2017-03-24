package com.uoowo.dao;

import com.uoowo.bean.BbsGgFavoriteThread;
import com.uoowo.bean.BbsGgFavoriteThreadExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BbsGgFavoriteThreadMapper {
    int countByExample(BbsGgFavoriteThreadExample example);

    int deleteByExample(BbsGgFavoriteThreadExample example);

    int insert(BbsGgFavoriteThread record);

    int insertSelective(BbsGgFavoriteThread record);

    List<BbsGgFavoriteThread> selectByExample(BbsGgFavoriteThreadExample example);

    int updateByExampleSelective(@Param("record") BbsGgFavoriteThread record, @Param("example") BbsGgFavoriteThreadExample example);

    int updateByExample(@Param("record") BbsGgFavoriteThread record, @Param("example") BbsGgFavoriteThreadExample example);
}