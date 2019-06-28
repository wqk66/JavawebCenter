package com.javadaily.abstractfactorypattern.serviceImpl;

import com.javadaily.abstractfactorypattern.service.TextField;

public class SpringTextField implements TextField {
    @Override
    public void display() {
        System.out.println("显示绿色文本框");
    }
}
