package com.javadaily.simplefactorypattern;


import com.javadaily.simplefactorypattern.factory.ShapFactory;
import com.javadaily.simplefactorypattern.factory.Shape;
import com.javadaily.utils.Dom4JUtil;

public class Client {

    public static void main(String[] args) {

        try {
            String type = Dom4JUtil.parseXMLForType("src/config.xml");
            ShapFactory shape = ShapFactory.createShape(type.trim());
            shape.draw();
            shape.erase();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
