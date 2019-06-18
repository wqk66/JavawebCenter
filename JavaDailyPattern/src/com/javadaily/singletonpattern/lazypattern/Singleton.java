package com.javadaily.singletonpattern.lazypattern;

/**
 * 懒汉式单例模式
 */
public class Singleton {
    private Singleton() {

    }

    private static Singleton instance;
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
