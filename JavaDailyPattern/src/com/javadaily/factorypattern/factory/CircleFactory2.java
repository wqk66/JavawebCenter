package com.javadaily.factorypattern.factory;

import com.javadaily.factorypattern.service.Shape2;
import com.javadaily.factorypattern.serviceimpl.Circle2;

public class CircleFactory2 implements ShapeFactory2 {
    @Override
    public Shape2 createShape() {
        return new Circle2();
    }
}
