package com.javadaily.factorypattern;

import com.javadaily.factorypattern.factory.*;
import com.javadaily.factorypattern.service.Logger;
import com.javadaily.factorypattern.service.Shape2;
import com.javadaily.factorypattern.serviceimpl.FileLogger;

public class Client {
    public static void main(String[] args) {

//        LoggerFactroy factroy = new FileLoggerFactory();
//        Logger logger = factroy.createLogger();
//        logger.showLog();
//        Logger logger = new FileLogger();
//        logger.showLog();
        ShapeFactory2 factory2 = new CircleFactory2();
        Shape2 shape2 = factory2.createShape();
        shape2.draw();
        shape2.erase();
    }
}
