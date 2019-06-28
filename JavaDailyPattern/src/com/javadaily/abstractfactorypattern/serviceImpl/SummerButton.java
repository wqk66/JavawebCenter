package com.javadaily.abstractfactorypattern.serviceImpl;

import com.javadaily.abstractfactorypattern.service.Button;

public class SummerButton implements Button {
    @Override
    public void display() {
        System.out.println("显示浅蓝色按钮");
    }
}
