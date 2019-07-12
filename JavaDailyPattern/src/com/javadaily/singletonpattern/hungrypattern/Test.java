package com.javadaily.singletonpattern.hungrypattern;

public class Test {
    public  int count = 0;

    public Test() {

    }

    public void addCount() {
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {

        Test t1 = new Test();
        Test t2 = new Test();
        t1.addCount();
        t2.addCount();
    }
}
