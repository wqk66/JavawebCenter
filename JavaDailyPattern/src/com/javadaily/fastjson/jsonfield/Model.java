package com.javadaily.fastjson.jsonfield;

import com.alibaba.fastjson.annotation.JSONField;

public  class Model {
    @JSONField(serializeUsing = ModelValueSerializer.class)
    public int value;
}
