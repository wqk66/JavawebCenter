package com.javadaily.abstractfactorypattern.serviceImpl;

import com.javadaily.abstractfactorypattern.service.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("这是一个正方形");
    }
}
