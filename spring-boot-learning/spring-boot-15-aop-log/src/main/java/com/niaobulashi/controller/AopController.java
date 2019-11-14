package com.niaobulashi.controller;

import com.niaobulashi.anno.SysLog;
import org.springframework.web.bind.annotation.*;

/**
 * @program: spring-boot-learning
 * @description: aopController层
 * @author: https://niaobulashi.com
 * @create: 2019-07-03 23:27
 */
@RestController
@RequestMapping("/aop")
public class AopController {

    @SysLog("测试")
    @GetMapping("/test")
    public String test(@RequestParam("name") String name, @RequestParam("age") int age){
        return name + ", " + age;
    }
}
