package org.loversAPP.dao;

import org.apache.ibatis.annotations.Param;
import org.loversAPP.model.User;
import org.loversAPP.model.UserExample;

import java.util.List;

public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    List<User> getAllUsers();
    User getUserByUserNameOrPass(@Param("username") String username,@Param("phoneNum")String phoneNum);
    Integer getMaxID();
    String getInviteCodeByID(@Param("id") Integer id);
}