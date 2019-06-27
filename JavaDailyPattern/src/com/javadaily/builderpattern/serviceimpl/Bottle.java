package com.javadaily.builderpattern.serviceimpl;

import com.javadaily.builderpattern.service.Packing;

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
