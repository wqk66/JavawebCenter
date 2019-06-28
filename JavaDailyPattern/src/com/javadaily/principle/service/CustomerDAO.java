package com.javadaily.principle.service;

import com.javadaily.principle.parent.DBUtil;

/**
 * 复合复用原则练习
 */
public class CustomerDAO{

    //根据父类编程，通过构造函数注入
    public CustomerDAO(DBUtil dbUtil) {
        dbUtil.getConnection();
    }

    public void addCustomer() {
        System.out.println("添加客户关系");
    }
}
