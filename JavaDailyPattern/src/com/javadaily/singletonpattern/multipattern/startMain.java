package com.javadaily.singletonpattern.multipattern;

public class startMain {

    public static void main(String[] args) {

        Multiton m1 = Multiton.getInstance();
        Multiton m2 = Multiton.getInstance2();
        System.out.println(m1.equals(m2));
    }
}
