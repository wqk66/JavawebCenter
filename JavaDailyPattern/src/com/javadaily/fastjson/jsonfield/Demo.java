package com.javadaily.fastjson.jsonfield;

import com.alibaba.fastjson.JSON;
import org.junit.Assert;

public class Demo {
    public static void main(String[] args) {

        Model model = new Model();
        model.value = 100;
        String json = JSON.toJSONString(model);
        Assert.assertEquals("{\"value\":\"100元\"}",json);
    }
}
