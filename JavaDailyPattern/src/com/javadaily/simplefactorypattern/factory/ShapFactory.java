package com.javadaily.simplefactorypattern.factory;

import com.javadaily.simplefactorypattern.instanceimpl.Circle;
import com.javadaily.simplefactorypattern.instanceimpl.Square;

public abstract class ShapFactory {

    private String type;

    public static ShapFactory createShape(String type) throws  Exception {
        ShapFactory shape = null;
        if(type.equalsIgnoreCase("circle")){
            shape = new Circle();
        } else if (type.equalsIgnoreCase("square")) {
            shape = new Square();
        }else{
            shape = null;
        }
        return shape;
    }

    public abstract void draw() throws Exception;

    public abstract void erase() throws Exception;
}
