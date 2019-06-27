package com.javadaily.iteratorpattern.instanceimpl;

import com.javadaily.iteratorpattern.factory.AbstractIterator;
import com.javadaily.iteratorpattern.factory.AbstractObjectList;

import java.util.List;

public class ProductList extends AbstractObjectList {

    public ProductList(List products) {
        super(products);
    }
    @Override
    public AbstractIterator createIterator() {
        return new ProductIterator(this);
    }
}
