package com.javadaily.singletonpattern.hungrypattern;

/**
 * 饿汉式单利模式
 */
public class Singleton {

    public int count = 0;
    private  Singleton() {
        System.out.println(111111);
    }

    private final static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }

    public void addCount() {
        count++;
        System.out.println(count);
    }
}
