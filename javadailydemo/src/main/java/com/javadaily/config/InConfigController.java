package com.javadaily.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InConfigController {
    @Autowired
    private Environment env;

    //另一种方式取数
    @Value("${db.username}")
    private String username;

    @RequestMapping(value = "/info")
    public String getValue() {
        //一种方式取数
        String username = env.getProperty("db.username");
        String password = env.getProperty("db.password");
        return username;
    }

    @RequestMapping(value = "/info2")
    public void getValue1() {
        System.out.println(username);
    }
}
