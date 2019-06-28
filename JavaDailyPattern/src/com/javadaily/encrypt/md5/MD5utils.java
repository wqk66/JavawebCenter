package com.javadaily.encrypt.md5;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * md5加密工具类
 * <p>将输入的字符串数据转换成字节数组，对数组的每个元素通过按位与加密，将
 * 加密后的元素转换成十六进制数据，并拼接字符串，该字符串就是加密后的数据
 *
 * @author wqk
 * @see java.security.MessageDigest
 * @see java.lang.StringBuffer
 */
public class MD5utils {
    /**
     * @param strs
     * @return
     */
    public static String strMd5(String strs) {
        StringBuffer sb = new StringBuffer();
        try {
            MessageDigest digest = MessageDigest.getInstance("MD5");
            byte[] bs = digest.digest(strs.getBytes());
            for (byte b : bs) {

                //与255按位与计算可以保证加密后密码的位数一定
                int x = b & 255;

                //将按位与后的整数转换成十六进制
                String s = Integer.toHexString(x);

                //小于16的时候，整数转换成十六进制的位数为1位，所以用0补位
                if (x < 16) {
                    sb.append("0");
                }
                sb.append(s);
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
