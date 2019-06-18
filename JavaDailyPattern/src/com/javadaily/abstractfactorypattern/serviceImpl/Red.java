package com.javadaily.abstractfactorypattern.serviceImpl;

import com.javadaily.abstractfactorypattern.service.Color;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("填充红色");
    }
}
