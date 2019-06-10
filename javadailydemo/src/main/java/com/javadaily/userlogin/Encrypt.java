package com.javadaily.userlogin;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Encrypt {

    /**
     * Md5加密
     * @param input
     * @return
     */
    public static String stringMd5(String input) {
        try {

            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] inputByteArr = input.getBytes();
            messageDigest.update(inputByteArr);
            byte[] resultByteArr = messageDigest.digest();
            return byteArrayToHex(resultByteArr);
        } catch (NoSuchAlgorithmException e) {
            return  null;
        }

    }

    /**
     * 字节数组转换成十六进制的字符串
     * @param byteArray
     * @return
     */
    public static String byteArrayToHex(byte[] byteArray) {
        char[] hexDigits = {'0','1','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        char[] resultCharArray = new char[byteArray.length * 2];
        int index = 0;
        for (byte b : byteArray) {
            resultCharArray[index++] = hexDigits[b >> 4 & 0xf];
            resultCharArray[index++] = hexDigits[b & 0xf];
        }
        return new String(resultCharArray);
    }

    public static void main(String[] args) {
        System.out.println(stringMd5("111111"));
    }
    //
}
