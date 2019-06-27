package com.javadaily.builderpattern.serviceimpl;

import com.javadaily.builderpattern.service.Burger;
import com.javadaily.builderpattern.service.Packing;

public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public Packing packging() {
        return null;
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
