package com.javadaily.iteratorpattern;

import com.javadaily.iteratorpattern.factory.AbstractIterator;
import com.javadaily.iteratorpattern.factory.AbstractObjectList;
import com.javadaily.iteratorpattern.instanceimpl.ProductList;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        List products = new ArrayList();
        products.add("倚天剑");
        products.add("屠龙刀");
        products.add("断肠草");
        products.add("葵花宝典");
        products.add("四十二章经");

        AbstractObjectList list;
        AbstractIterator iterator;
        list = new ProductList(products);
        iterator = list.createIterator();
        list.removeObject("倚天剑");
        System.out.println("正向遍历：");
        while (!iterator.isLast()) {
            System.out.println(iterator.getNextItem()+",");
            iterator.next();
        }
        System.out.println();
        System.out.println("--------------------");
        System.out.println("逆向遍历：");
        while (!iterator.isFirst()) {
            System.out.println(iterator.getPreviousItem()+",");
            iterator.previous();

        }


    }
}
