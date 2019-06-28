package com.javadaily.factorypattern.serviceimpl;

import com.javadaily.factorypattern.service.Shape2;

public class Circle2 implements Shape2 {
    @Override
    public void draw() {
        System.out.println("画圆形");
    }

    @Override
    public void erase() {
        System.out.println("清除圆形");
    }
}
