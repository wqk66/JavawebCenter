package com.javadaily.factorypattern.serviceimpl;

import com.javadaily.factorypattern.service.Shape;

/**
 * 具体的实体类
 */
public class Circle implements Shape {
    @Override
    public void show() {
        System.out.println("这是个圆形");
    }
}
