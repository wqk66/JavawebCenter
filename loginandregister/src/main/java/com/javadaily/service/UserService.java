package com.javadaily.service;

import com.javadaily.bean.Result;
import com.javadaily.bean.User;
import com.javadaily.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired(required = false)
    public UserMapper userMapper;

    /**
     * 注册
     */
    public Result register(User user) {
        Result result = new Result();
        result.setSuccess(false);
        result.setDetail(null);
        try {
            User existUser = userMapper.findUserByName(user.getUserName());
            if (existUser != null) {
                result.setRetMsg("用户已经存在");

            } else {
                userMapper.register(user);
                result.setRetMsg("注册成功");
                result.setSuccess(true);
                result.setDetail(user);
            }

        } catch (Exception e) {
            result.setRetMsg(e.getMessage());
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 登陆
     */
    public Result login(User user) {
        Result result = new Result();
        result.setSuccess(false);
        result.setDetail(null);
        try {

            Long userId = userMapper.login(user);
            if (userId == null) {
                result.setRetMsg("用户名或者密码错误");
            }else{
                result.setRetMsg("登陆成功");
                result.setSuccess(true);
                user.setId(userId);
                result.setDetail(user);
            }

        } catch (Exception e) {
            result.setRetMsg(e.getMessage());
        }
        return result;
    }
}
