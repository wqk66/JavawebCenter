package com.javadaily.builderpattern.serviceimpl;

import com.javadaily.builderpattern.service.ColdDrink;
import com.javadaily.builderpattern.service.Packing;

public class Pepsi extends ColdDrink{
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public Packing packging() {
        return null;
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
