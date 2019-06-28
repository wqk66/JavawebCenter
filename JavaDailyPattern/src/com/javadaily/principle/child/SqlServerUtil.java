package com.javadaily.principle.child;

import com.javadaily.principle.parent.DBUtil;

public class SqlServerUtil extends DBUtil {
    public void getConnection(){
        System.out.println("连接sqlserver数据库");
    }
}
