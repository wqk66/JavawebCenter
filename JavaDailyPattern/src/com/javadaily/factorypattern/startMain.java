package com.javadaily.factorypattern;

import com.javadaily.factorypattern.factory.ShapeFactory;
import com.javadaily.factorypattern.service.Shape;
import com.javadaily.factorypattern.util.Dom4JUtil;

/**
 * 客户端
 */
public class startMain {
    public static void main(String[] args) {
        ShapeFactory factory = (ShapeFactory)Dom4JUtil.parseXMLForClass("src/config.xml");
        Shape shape = factory.createShape();
        shape.show();
    }
}
