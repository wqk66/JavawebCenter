package com.javadaily.abstractfactorypattern.serviceImpl;

import com.javadaily.abstractfactorypattern.service.Button;

public class SpringButton implements Button {
    @Override
    public void display() {
        System.out.println("显示绿色按钮");
    }
}
