package com.javadaily.principle.child;

import com.javadaily.principle.parent.DBUtil;

public class OracleUtil extends DBUtil{
    public void getConnection() {
        System.out.println("连接oracle数据库");
    }
}
