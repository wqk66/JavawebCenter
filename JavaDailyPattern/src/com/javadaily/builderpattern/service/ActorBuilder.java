package com.javadaily.builderpattern.service;

import com.javadaily.builderpattern.serviceimpl.Actor;

public abstract class ActorBuilder {
    protected Actor actor = new Actor();

    public abstract void buildType();

    public abstract void buildSex();

    public abstract void buildFace();

    public abstract void buildCostume();

    public abstract void buildHairStyle();

    public Actor createActor() {
        return actor;
    }
}
