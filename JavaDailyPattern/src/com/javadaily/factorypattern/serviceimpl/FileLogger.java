package com.javadaily.factorypattern.serviceimpl;

import com.javadaily.factorypattern.service.Logger;

public class FileLogger implements Logger {
    @Override
    public void showLog() {
        System.out.println("打印文件日志");
    }
}
