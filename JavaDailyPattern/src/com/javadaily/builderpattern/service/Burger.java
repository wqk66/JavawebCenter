package com.javadaily.builderpattern.service;

import com.javadaily.builderpattern.serviceimpl.Wrapper;

public abstract class Burger  implements Item {
    public Packing packing() {
        return new Wrapper();
    }

    public abstract float price();
}
