package com.javadaily.encrypt;

import com.javadaily.encrypt.md5.MD5utils;

public class Client {

    public static void main(String[] args) {

       String strMd5 =  MD5utils.strMd5("love_112358@");System.out.println(strMd5);
//        int str = 15;
//        String s = Integer.toHexString(str);
//        System.out.println(s);
    }

}
