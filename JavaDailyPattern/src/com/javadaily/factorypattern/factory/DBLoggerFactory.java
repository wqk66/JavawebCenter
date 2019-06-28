package com.javadaily.factorypattern.factory;

import com.javadaily.factorypattern.service.Logger;
import com.javadaily.factorypattern.serviceimpl.DBLogger;

public class DBLoggerFactory implements LoggerFactroy{

    @Override
    public Logger createLogger() {
        System.out.println("初始化数据库日志");
        return new DBLogger();
    }
}
