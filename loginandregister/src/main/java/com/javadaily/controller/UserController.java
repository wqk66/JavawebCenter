package com.javadaily.controller;

import com.javadaily.bean.Result;
import com.javadaily.bean.User;
import com.javadaily.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
@RestController
public class UserController {

    @Autowired
    public UserService userService;

    /**
     * 注册
     * @param user
     * @return
     */
    @RequestMapping(value = "/register",method = RequestMethod.GET)
    public Result register(User user) {
        return userService.register(user);

    }

    /**
     * 登陆
     * @param user
     * @return
     */
    @GetMapping(value = "/login")
    public Result login(User user) {
        return userService.login(user);
    }

}
