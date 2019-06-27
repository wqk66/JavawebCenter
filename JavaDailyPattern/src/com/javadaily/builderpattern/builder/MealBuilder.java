package com.javadaily.builderpattern.builder;


import com.javadaily.builderpattern.serviceimpl.ChickenBurger;
import com.javadaily.builderpattern.serviceimpl.Coke;
import com.javadaily.builderpattern.serviceimpl.Pepsi;
import com.javadaily.builderpattern.serviceimpl.VegBurger;

public class MealBuilder {
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
