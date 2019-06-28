package com.javadaily.simplefactorypattern.instanceimpl;

import com.javadaily.simplefactorypattern.factory.ShapFactory;
import com.javadaily.simplefactorypattern.factory.Shape;

public class Circle extends ShapFactory {
    @Override
    public void draw() throws Exception {
        System.out.println("画圆形");
    }

    @Override
    public void erase() throws Exception {
        System.out.println("擦除圆形");
    }
}
