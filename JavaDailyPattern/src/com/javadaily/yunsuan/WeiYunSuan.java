package com.javadaily.yunsuan;

public class WeiYunSuan {

    public static void main(String[] args) {

        System.out.println(Integer.valueOf("11111111111111111111111111111111",2));
        //swap(3,5);
    }

    @Deprecated
    public static int abs(int x) {
        int y;
        y = x >> 32;
        return (x ^ y) - y;
    }

    public static void  swap(int x, int y) {
        x ^= y;
        y^=x;
        x ^= y;
        System.out.println(x);
        System.out.println(y);
    }
}
