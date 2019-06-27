package com.javadaily.builderpattern.serviceimpl;

import com.javadaily.builderpattern.service.ActorBuilder;

/**
 * 英雄建造器：具体建造着
 */
public class HeroBuilder extends ActorBuilder{

    @Override
    public void buildType() {
        actor.setType("he");
    }

    @Override
    public void buildSex() {
        actor.setSex("man");
    }

    @Override
    public void buildFace() {
        actor.setFace("handsome");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("盔甲");
    }

    @Override
    public void buildHairStyle() {
        actor.setHairstyle("飘逸");
    }
}
