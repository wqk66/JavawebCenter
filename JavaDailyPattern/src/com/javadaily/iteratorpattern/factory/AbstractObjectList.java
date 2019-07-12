package com.javadaily.iteratorpattern.factory;

import java.util.List;

/**
 * 抽象聚合类，
 */
public abstract class AbstractObjectList {
    //数据仓库，用于存储需要遍历的数据
    protected List<Object> objects = null;

    /**
     * 第一
     * @param objects
     */
    public AbstractObjectList(List objects) {
        this.objects = objects;
    }

    public void addObject(Object obj) {
        this.objects.add(obj);
    }

    public void removeObject(Object object) {
        this.objects.remove(object);
    }

    public List getObjects() {
        return this.objects;
    }

    /**
     * 生成迭代器
     * @return
     */
    public abstract AbstractIterator createIterator();
}
