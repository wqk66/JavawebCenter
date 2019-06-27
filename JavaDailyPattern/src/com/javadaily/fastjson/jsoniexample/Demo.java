package com.javadaily.fastjson.jsoniexample;

import com.alibaba.fastjson.JSON;

import java.util.List;

public class Demo {
    public static void main(String[] args) {

        //构建guest用户
        User guestUser = new User();
        guestUser.setAge(28);
        guestUser.setName("guest");
        //构建root用户
        User rootUser = new User();
        rootUser.setName("root");
        rootUser.setAge(35);
        //构建用户组
        UserGroup group = new UserGroup();
        group.setName("adminA");
        group.getUsers().add(guestUser);
        group.getUsers().add(rootUser);
        //用户组对象转换成json串
        String jsonString = JSON.toJSONString(group);
        System.out.println("jsonstring1："+jsonString);
        //JSON串转换用户组对象
        UserGroup userGroup2 = JSON.parseObject(jsonString, UserGroup.class);
        System.out.println("group2:" + userGroup2);

        //构建用户对象数组
        User[] users = new User[2];
        users[0] = guestUser;
        users[1] = rootUser;
        //用户对象数组转换成json
        String jsonString2 = JSON.toJSONString(users);
        System.out.println("jsonString2:" + jsonString2);

        //json串转用户对象列表
        List<User> users2 = JSON.parseArray(jsonString2, User.class);
        System.out.println("user2:"+users2);

    }
}
