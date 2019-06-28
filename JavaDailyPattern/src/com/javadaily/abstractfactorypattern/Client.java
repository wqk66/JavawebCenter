package com.javadaily.abstractfactorypattern;

import com.javadaily.abstractfactorypattern.factory.*;
import com.javadaily.abstractfactorypattern.service.Button;
import com.javadaily.abstractfactorypattern.service.GameOperateController;
import com.javadaily.abstractfactorypattern.service.GuiControlller;
import com.javadaily.abstractfactorypattern.service.TextField;
import com.javadaily.abstractfactorypattern.serviceImpl.LinuxCsOperateController;

public class Client {

    public static void main(String[] args) {

//        SkinFactory factory = new SummerSkinFactory();
//        Button button = factory.createButton();
//        TextField textField = factory.createTextField();
//        button.display();
//        textField.display();

//        SystemFactory factory = new WinSystemFactory();
//        GuiControlller guiControlller = factory.createGuiController();
//        GameOperateController gameOperateController = factory.createOperateController();
//        guiControlller.initGuiController();
//        gameOperateController.initOperateController();
        SystemFactory factory = new LinuxSystemFactory();
        GameOperateController operateController =  factory.createOperateController();
        GuiControlller guiControlller = factory.createGuiController();
        operateController.initOperateController();
        guiControlller.initGuiController();
    }
}
