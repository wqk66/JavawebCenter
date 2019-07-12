package com.javadaily.iteratorpattern.instanceimpl;

import com.javadaily.iteratorpattern.factory.AbstractIterator;
import com.javadaily.iteratorpattern.factory.AbstractObjectList;

import java.util.List;

/**
 * 具体聚合对象
 */
public class ProductList extends AbstractObjectList {

    public ProductList(List products) {
        super(products);
    }

    /**
     * 创建迭代器
     * @return
     */
    @Override
    public AbstractIterator createIterator() {
        return new ProductIterator(this);
    }


}
