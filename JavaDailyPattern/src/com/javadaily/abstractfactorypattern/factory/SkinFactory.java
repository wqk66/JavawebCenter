package com.javadaily.abstractfactorypattern.factory;

import com.javadaily.abstractfactorypattern.service.Button;
import com.javadaily.abstractfactorypattern.service.TextField;

public interface SkinFactory {
    public Button createButton();

    public TextField createTextField();
}
