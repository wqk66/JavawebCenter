package com.javadaily.abstractfactorypattern.factory;

import com.javadaily.abstractfactorypattern.service.Color;
import com.javadaily.abstractfactorypattern.service.Shape;
import com.javadaily.abstractfactorypattern.serviceImpl.Circle;
import com.javadaily.abstractfactorypattern.serviceImpl.Red;

public class RedShapeFactory extends AbstractFactory {
    @Override
    public Color getColor() {

        return new Red();
    }

    @Override
    public Shape getShape() {
        return new Circle();
    }
}
