package com.javadaily.factorypattern.factory;

import com.javadaily.factorypattern.service.Shape;
import com.javadaily.factorypattern.serviceimpl.Circle;

public class CircleFactory implements ShapeFactory {

    @Override
    public Shape createShape() {
        return new Circle();
    }
}
