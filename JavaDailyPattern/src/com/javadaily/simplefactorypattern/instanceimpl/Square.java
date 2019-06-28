package com.javadaily.simplefactorypattern.instanceimpl;

import com.javadaily.simplefactorypattern.factory.ShapFactory;
import com.javadaily.simplefactorypattern.factory.Shape;

public class Square extends ShapFactory {
    @Override
    public void draw() throws Exception {
        System.out.println("画正方形");
    }

    @Override
    public void erase() throws Exception {
        System.out.println("擦除正方形");
    }
}
