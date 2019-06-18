package com.javadaily.abstractfactorypattern;

import com.javadaily.abstractfactorypattern.factory.AbstractFactory;
import com.javadaily.abstractfactorypattern.factory.GreenShapeFactory;
import com.javadaily.abstractfactorypattern.factory.RedShapeFactory;
import com.javadaily.abstractfactorypattern.service.Color;
import com.javadaily.abstractfactorypattern.service.Shape;

public class startMain {

    public static void main(String[] args) {
        AbstractFactory factory = new GreenShapeFactory();
        Color color = factory.getColor();
        Shape shape = factory.getShape();
        shape.draw();
        color.fill();

    }
}
