package com.javadaily.singletonpattern.innerclasspattern;

/**
 * 内部类实现单例模式
 */
public class Singleton {
    private Singleton() {

    }
    private static class SingletonHolder{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
