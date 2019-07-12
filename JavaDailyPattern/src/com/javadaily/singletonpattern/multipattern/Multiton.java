package com.javadaily.singletonpattern.multipattern;

public class Multiton {

    private final static Multiton multiton = new Multiton();
    private final static Multiton multiton2 = new Multiton();
    public Multiton() {

    }
    public static Multiton getInstance() {
        return multiton;
    }
    public static Multiton getInstance2() {
        return multiton2;
    }
}
