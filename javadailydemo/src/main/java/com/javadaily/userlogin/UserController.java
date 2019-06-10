package com.javadaily.userlogin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 逻辑控制器类
 */
@RestController
@RequestMapping(value = "/api/account")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/login/{userName}/{password}",method = RequestMethod.GET)
    public Result<Long> login(@PathVariable("userName") String userName, @PathVariable("password")String password) {

        return userService.login(userName,password);
    }

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public void initData() {
        userService.initUserData();
    }

}
