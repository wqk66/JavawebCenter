package com.javadaily.fastjson.jsonfield;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.ObjectSerializer;

import java.io.IOException;
import java.lang.reflect.Type;

public  class ModelValueSerializer implements ObjectSerializer {
    @Override
    public void write(JSONSerializer jsonSerializer, Object o, Object o1, Type type, int i) throws IOException {
        Integer value = (Integer) o;
        String text = value + "元";
        jsonSerializer.write(text);

    }
}
