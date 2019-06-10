package com.javadaily.mapper;

import com.javadaily.bean.User;
import org.apache.ibatis.annotations.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

@Mapper
@Repository
public interface UserMapper{

    @Select("select username,password from user where username = #{userName}")
    @Results({@Result(property="username",column = "username"),@Result(property = "password",column = "password")})
    User findUserByName(@Param("username") String username);

    @Insert("insert into user values(#{id},#{username},#{password})")
    @Options(useGeneratedKeys = true,keyProperty = "id",keyColumn = "id")
    void register(User user);

    @Select("select id from user where username=#{username} and password=#{password}")
    Long login(User user);
}
