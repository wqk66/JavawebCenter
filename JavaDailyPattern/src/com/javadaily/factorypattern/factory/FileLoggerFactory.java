package com.javadaily.factorypattern.factory;

import com.javadaily.factorypattern.service.Logger;
import com.javadaily.factorypattern.serviceimpl.FileLogger;

public class FileLoggerFactory implements LoggerFactroy {

    @Override
    public Logger createLogger() {
        System.out.println("初始化文件日志");
        return new FileLogger();
    }
}
