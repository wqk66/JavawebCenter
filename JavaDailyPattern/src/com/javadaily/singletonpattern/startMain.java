package com.javadaily.singletonpattern;


import com.javadaily.singletonpattern.hungrypattern.Singleton;
import com.javadaily.singletonpattern.hungrypattern.Test;

public class startMain {
    public static void main(String[] args) {

//        Singleton s = Singleton.getInstance();
//        Singleton s2 = Singleton.getInstance();
//        System.out.println(s.equals(s2));
//        Singleton s1 = Singleton.getInstance();
//        Singleton s2 = Singleton.getInstance();
//        s1.addCount();
//        s2.addCount();
        Test test = new Test();
        Test test2 = new Test();
        test.addCount();
        test2.addCount();

    }
}
