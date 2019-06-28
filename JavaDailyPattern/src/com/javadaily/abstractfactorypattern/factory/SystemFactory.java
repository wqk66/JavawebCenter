package com.javadaily.abstractfactorypattern.factory;

import com.javadaily.abstractfactorypattern.service.GameOperateController;
import com.javadaily.abstractfactorypattern.service.GuiControlller;

public interface SystemFactory  {
    public GameOperateController createOperateController();

    public GuiControlller createGuiController();
}
