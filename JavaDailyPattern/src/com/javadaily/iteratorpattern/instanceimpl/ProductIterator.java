package com.javadaily.iteratorpattern.instanceimpl;

import com.javadaily.iteratorpattern.factory.AbstractIterator;

import java.util.List;

/**
 * 具体迭代器
 */
public class ProductIterator implements AbstractIterator {

    private ProductList productList;
    private List products;
    private int cursor1;
    private int cursor2;

    /**
     * 构造函数，用于初始化数据，并为具体聚合对象赋值
     * @param productList
     */
    public ProductIterator(ProductList productList) {
        this.productList = productList;
        this.products = productList.getObjects();//获取聚合对象
        cursor1 = 0;//设置正向遍历游标的初始值
        cursor2 = products.size() - 1;//设置逆向遍历游标的初始值
    }
    @Override
    public void next() {

        if (cursor1 < products.size()) {
            cursor1++;
        }
    }

    @Override
    public boolean isLast() {
        return (cursor1 == products.size());
    }

    @Override
    public void previous() {
        if (cursor2 > -1) {
            cursor2--;
        }
    }

    @Override
    public boolean isFirst() {
        return cursor2 == -1;
    }

    @Override
    public Object getNextItem() {
        return products.get(cursor1);
    }

    @Override
    public Object getPreviousItem() {
        return products.get(cursor2);
    }
}
