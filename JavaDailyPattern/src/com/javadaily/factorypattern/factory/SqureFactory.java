package com.javadaily.factorypattern.factory;

import com.javadaily.factorypattern.service.Shape;
import com.javadaily.factorypattern.serviceimpl.Square;

public class SqureFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        return new Square();
    }
}
