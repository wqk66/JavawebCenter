package com.javadaily.abstractfactorypattern.serviceImpl;

import com.javadaily.abstractfactorypattern.service.GameOperateController;

public class LinuxCsOperateController implements GameOperateController {
    @Override
    public void initOperateController() {
        System.out.println("Linux Cs operateController");
    }
}
