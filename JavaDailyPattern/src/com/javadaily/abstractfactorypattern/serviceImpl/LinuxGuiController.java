package com.javadaily.abstractfactorypattern.serviceImpl;

import com.javadaily.abstractfactorypattern.service.GuiControlller;

public class LinuxGuiController implements GuiControlller {
    @Override
    public void initGuiController() {
        System.out.println("Linux cs GuiController");
    }
}
