package com.javadaily.iteratorpattern.instanceimpl;

import com.javadaily.iteratorpattern.factory.AbstractIterator;
import com.javadaily.iteratorpattern.factory.AbstractObjectList;

import java.util.List;

public class CustomerList extends AbstractObjectList {
    public CustomerList(List customers){
        super(customers);
    }

    @Override
    public AbstractIterator createIterator() {
        return new CustomerIterator(this);
    }

    /**
     * 具体的客户迭代器
     */
    class CustomerIterator implements AbstractIterator{

        private int cursorFront;//定义一个游标，用于正向遍历元素
        private int cursorBack;//定义一个游标，由于反向遍历元素
        List<Object> objects = null;


        public CustomerIterator(CustomerList customerList) {
            objects = customerList.getObjects();
            cursorFront = 0;
            cursorBack = objects.size() - 1;

        }
        @Override
        public void next() {
            if (cursorFront < objects.size()) {
                cursorFront++;
            }
        }

        @Override
        public boolean isLast() {
            return (cursorFront == objects.size());
        }

        @Override
        public void previous() {
            if (cursorBack > -1) {
                cursorBack--;
            }
        }

        @Override
        public boolean isFirst() {
            return (cursorBack == -1);
        }

        @Override
        public Object getNextItem() {
            return objects.get(cursorFront);
        }

        @Override
        public Object getPreviousItem() {
            return objects.get(cursorBack);
        }

    }
}
