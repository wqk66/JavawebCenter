package com.javadaily.builderpattern.serviceimpl;

import com.javadaily.builderpattern.service.ColdDrink;
import com.javadaily.builderpattern.service.Packing;

public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public Packing packging() {
        return null;
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
