package com.javadaily.abstractfactorypattern.factory;

import com.javadaily.abstractfactorypattern.service.Button;
import com.javadaily.abstractfactorypattern.service.TextField;
import com.javadaily.abstractfactorypattern.serviceImpl.SpringButton;
import com.javadaily.abstractfactorypattern.serviceImpl.SpringTextField;
import com.javadaily.abstractfactorypattern.serviceImpl.SummerTextField;

public class SpringSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SpringButton();
    }

    @Override
    public TextField createTextField() {
        return new SpringTextField();
    }
}
