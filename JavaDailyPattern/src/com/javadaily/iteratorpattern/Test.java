package com.javadaily.iteratorpattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {

    public static void main(String[] args) {


        List<String> dataList = new ArrayList<>();
        Iterator<String> it = dataList.listIterator();
        while (it.hasNext()) {
            String data = it.next();

        }
    }
}
