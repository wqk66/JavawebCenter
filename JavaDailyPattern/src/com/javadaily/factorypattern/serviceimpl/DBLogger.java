package com.javadaily.factorypattern.serviceimpl;

import com.javadaily.factorypattern.service.Logger;

public class DBLogger implements Logger {
    @Override
    public void showLog() {
        System.out.println("打印数据库日志");
    }
}
