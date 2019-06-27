package com.javadaily.builderpattern.builder;

import com.javadaily.builderpattern.service.ActorBuilder;
import com.javadaily.builderpattern.serviceimpl.Actor;

/**
 * 游戏角色控制器：指挥者
 */
public class ActorController {

    public Actor construct(ActorBuilder builder) {
        Actor actor;
        builder.buildType();
        builder.buildCostume();
        builder.buildFace();
        builder.buildHairStyle();
        builder.buildSex();
        actor = builder.createActor();
        return actor;
    }
}
