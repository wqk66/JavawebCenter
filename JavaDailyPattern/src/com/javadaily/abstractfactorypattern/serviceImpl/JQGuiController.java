package com.javadaily.abstractfactorypattern.serviceImpl;

import com.javadaily.abstractfactorypattern.service.GuiControlller;

public class JQGuiController implements GuiControlller {
    @Override
    public void initGuiController() {
        System.out.println("军旗游戏界面初始化成功");
    }
}
