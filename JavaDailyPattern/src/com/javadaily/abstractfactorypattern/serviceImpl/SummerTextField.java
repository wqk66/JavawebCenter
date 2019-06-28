package com.javadaily.abstractfactorypattern.serviceImpl;

import com.javadaily.abstractfactorypattern.service.TextField;

public class SummerTextField implements TextField {
    @Override
    public void display() {
        System.out.println("显示浅蓝色文本框");
    }
}
