package com.javadaily.singletonpattern.hungrypattern;

public class Test {
    public  int count = 0;

    public Test() {

    }

    public void addCount() {
        count++;
        System.out.println(count);
    }
}
