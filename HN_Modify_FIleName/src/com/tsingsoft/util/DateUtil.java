package com.tsingsoft.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期工具类
 */
public class DateUtil {

    /**
     * 获取当天日期
     *
     * @param pattern 日期格式
     * @return
     */
    public static String getCurrDate(String pattern) {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        String strCurrDate = sdf.format(new Date());
        return strCurrDate;
    }

    public static void main(String[] args) {
        System.out.println(getCurrDate("yyyyMMdd"));
    }
}
