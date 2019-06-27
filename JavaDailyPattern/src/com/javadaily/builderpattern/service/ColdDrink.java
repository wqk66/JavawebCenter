package com.javadaily.builderpattern.service;

import com.javadaily.builderpattern.serviceimpl.Bottle;

public abstract class ColdDrink implements Item {
    public Packing packing() {
        return new Bottle();
    }

    public abstract float price();
}
