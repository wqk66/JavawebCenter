package com.javadaily.factorypattern.factory;

import com.javadaily.factorypattern.service.Shape;
import com.javadaily.factorypattern.serviceimpl.Rectgle;

public class RectgleFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        return new Rectgle();
    }
}
