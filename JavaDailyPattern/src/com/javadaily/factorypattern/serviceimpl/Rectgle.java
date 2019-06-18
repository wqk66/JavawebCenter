package com.javadaily.factorypattern.serviceimpl;

import com.javadaily.factorypattern.service.Shape;

public class Rectgle implements Shape {
    @Override
    public void show() {
        System.out.println("这是一个三角形");
    }
}
