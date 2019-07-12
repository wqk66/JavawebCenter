package com.javadaily.iteratorpattern;

import com.javadaily.iteratorpattern.factory.AbstractIterator;
import com.javadaily.iteratorpattern.factory.AbstractObjectList;
import com.javadaily.iteratorpattern.instanceimpl.CustomerList;

import java.util.ArrayList;
import java.util.List;

public class Client2 {
    public static void main(String[] args) {

        List products = new ArrayList();
        products.add("倚天剑");
        products.add("屠龙刀");
        products.add("断肠草");
        products.add("葵花宝典");
        products.add("四十二章经");
        AbstractObjectList customerList = new CustomerList(products);
        AbstractIterator customerIterator = customerList.createIterator();
        while (!customerIterator.isLast()) {
            System.out.println(customerIterator.getNextItem());
            customerIterator.next();
        }
        System.out.println("----------");
        while (!customerIterator.isFirst()) {
            System.out.println(customerIterator.getPreviousItem());
            customerIterator.previous();
        }
    }
}
