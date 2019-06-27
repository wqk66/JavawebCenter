package com.javadaily.builderpattern;

import com.javadaily.builderpattern.builder.ActorController;
import com.javadaily.builderpattern.service.ActorBuilder;
import com.javadaily.builderpattern.serviceimpl.Actor;
import com.javadaily.builderpattern.serviceimpl.AngleBuilder;
import com.javadaily.builderpattern.serviceimpl.HeroBuilder;

public class ActorBuilderMain {
    public static void main(String[] args) {
        ActorBuilder builder = new HeroBuilder();

        ActorController ac = new ActorController();
        Actor actor = ac.construct(builder);
        String type = actor.getType();
        System.out.println(type+"的外观");
        System.out.println("性别："+actor.getSex());
        System.out.println("面容："+actor.getFace());
        System.out.println("服装："+actor.getCostume());
        System.out.println("发型："+actor.getHairstyle());
    }
}
