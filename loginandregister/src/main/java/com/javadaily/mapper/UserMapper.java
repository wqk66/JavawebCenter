package com.javadaily.mapper;

import com.javadaily.bean.User;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;


@Component
public interface UserMapper{

    @Select("select username,password from user where username = #{username}")
    //@Results({@Result(property="username",column = "username"),@Result(property = "password",column = "password")})
    User findUserByName(@Param("username") String username);

    @Insert("insert into user values(#{username},#{password})")
    //@Options(useGeneratedKeys = true,keyProperty = "id",keyColumn = "id")
    void register(User user);

    @Select("select id from user where username=#{username} and password=#{password}")
    Long login(User user);
}
