package com.javadaily.abstractfactorypattern.factory;

import com.javadaily.abstractfactorypattern.service.Color;
import com.javadaily.abstractfactorypattern.service.Shape;

public abstract class AbstractFactory {
    public abstract Color getColor();

    public abstract Shape getShape();

}
