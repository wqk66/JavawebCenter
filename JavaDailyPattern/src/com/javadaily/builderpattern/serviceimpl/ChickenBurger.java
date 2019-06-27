package com.javadaily.builderpattern.serviceimpl;

import com.javadaily.builderpattern.service.Burger;
import com.javadaily.builderpattern.service.Packing;

public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public Packing packging() {
        return null;
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
