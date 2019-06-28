package com.javadaily.abstractfactorypattern.factory;

import com.javadaily.abstractfactorypattern.service.GameOperateController;
import com.javadaily.abstractfactorypattern.service.GuiControlller;
import com.javadaily.abstractfactorypattern.serviceImpl.CsGuiController;
import com.javadaily.abstractfactorypattern.serviceImpl.CsOperateController;

public class LinuxSystemFactory implements SystemFactory {
    @Override
    public GameOperateController createOperateController() {
        return new CsOperateController();
    }

    @Override
    public GuiControlller createGuiController() {
        return new CsGuiController();
    }
}
