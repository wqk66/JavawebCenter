package com.javadaily.abstractfactorypattern.factory;

import com.javadaily.abstractfactorypattern.service.Button;
import com.javadaily.abstractfactorypattern.service.TextField;
import com.javadaily.abstractfactorypattern.serviceImpl.SpringTextField;
import com.javadaily.abstractfactorypattern.serviceImpl.SummerButton;
import com.javadaily.abstractfactorypattern.serviceImpl.SummerTextField;

public class SummerSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SummerButton();
    }

    @Override
    public TextField createTextField() {
        return new SummerTextField();
    }
}
