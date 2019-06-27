package com.javadaily.builderpattern.serviceimpl;

import com.javadaily.builderpattern.service.Packing;

public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
