package org.loversAPP.dao;

import org.apache.ibatis.annotations.Param;
import org.loversAPP.DTO.GoDieFeeBack;
import org.loversAPP.DTO.TempGoDie;
import org.loversAPP.model.GoDie;
import org.loversAPP.model.GoDieExample;

import java.util.List;

public interface GoDieMapper {
    long countByExample(GoDieExample example);

    int deleteByExample(GoDieExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoDie record);

    int insertSelective(GoDie record);

    List<GoDie> selectByExample(GoDieExample example);

    GoDie selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoDie record, @Param("example") GoDieExample example);

    int updateByExample(@Param("record") GoDie record, @Param("example") GoDieExample example);

    int updateByPrimaryKeySelective(GoDie record);

    int updateByPrimaryKey(GoDie record);

    int getDogActByID(@Param("userID") int userID);

    GoDieFeeBack getGoDieFeedBackByID(@Param("userID") int userID);

    int deleteGoDieByID(@Param("userID") int userID);

    List<TempGoDie> getTempGoDie();

    int deleteGoDieByPrimairyKey(@Param("id") int id);
}