package com.javadaily.builderpattern;

import com.javadaily.builderpattern.builder.Meal;
import com.javadaily.builderpattern.builder.MealBuilder;

public class startMain {
    public static void main(String[] args) {

        MealBuilder builder = new MealBuilder();
        Meal vegMeal = builder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost:" + vegMeal.getCost());
        Meal nonVegMeal = builder.prepareNonVegMeal();
        nonVegMeal.showItems();
        System.out.println("Total Cost:"+nonVegMeal.getCost());
    }
}
