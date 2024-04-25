package com.newslabelpage.mapper;

import com.newslabelpage.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from user")
    List<User> getAllUser();

    @Select("select * from user where username = #{username} and password = #{password}")
    User login(User user);
}
