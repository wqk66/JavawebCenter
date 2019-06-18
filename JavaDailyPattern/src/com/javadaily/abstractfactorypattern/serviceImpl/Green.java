package com.javadaily.abstractfactorypattern.serviceImpl;

import com.javadaily.abstractfactorypattern.service.Color;

public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("填充绿色");
    }
}
