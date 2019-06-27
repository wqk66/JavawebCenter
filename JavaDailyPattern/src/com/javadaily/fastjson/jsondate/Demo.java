package com.javadaily.fastjson.jsondate;

import com.alibaba.fastjson.JSON;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {

        Date date = new Date();
        String strDate = JSON.toJSONStringWithDateFormat(date, "yyyy-MM-dd HH:mm:ss");
        System.out.println(strDate);
    }
}
