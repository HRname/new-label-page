package com.newslabelpage.mapper;

import com.newslabelpage.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface UserMapper {
    @Select("select * from user where username = #{username} and password = #{password}")
    User login(User user);
    @Update("update user set username=#{username}, password=#{password}, userHeaderImg=#{userHeaderImg}, sex=#{sex}, address=#{address}, signature=#{signature} where id=#{id}")
    void modifyUser(User user);
    @Delete("delete from user where id=#{id}")
    void deleteUser(User user);
}
