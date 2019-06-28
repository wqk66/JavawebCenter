package com.javadaily.abstractfactorypattern.serviceImpl;

import com.javadaily.abstractfactorypattern.service.GameOperateController;

public class CsOperateController implements GameOperateController {


    @Override
    public void initOperateController() {
        System.out.println("win cs控制器初始化成功");
    }
}
