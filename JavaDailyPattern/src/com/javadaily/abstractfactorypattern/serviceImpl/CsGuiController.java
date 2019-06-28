package com.javadaily.abstractfactorypattern.serviceImpl;

import com.javadaily.abstractfactorypattern.service.GuiControlller;

public class CsGuiController implements GuiControlller {


    @Override
    public void initGuiController() {
        System.out.println("win cs界面控制器初始化成功");
    }
}
