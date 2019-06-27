package com.javadaily.fastjson.jsoniexample;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

public class Demo2 {

    private static int aa;

    static{
        System.out.println("static 1111111");
    }
    static{
        System.out.println("bbbbbb");
    }
    public Demo2() {
        System.out.println("33333333");
    }
    {
        aa = 3;
        System.out.println("222222222");
    }

    public static void test(){
        System.out.println("ccccccc");
    }
    public static void main(String[] args) {
        Demo2 demo = new Demo2();
        demo.test();

        Demo2 demo2 = new Demo2();
    }
}
