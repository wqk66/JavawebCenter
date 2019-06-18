package com.javadaily.factorypattern.serviceimpl;

import com.javadaily.factorypattern.service.Shape;

/**
 * 实体类，代表具体的实现
 */
public class Square implements Shape {
    public void show() {
        System.out.println("这是一个正方形");
    }
}
