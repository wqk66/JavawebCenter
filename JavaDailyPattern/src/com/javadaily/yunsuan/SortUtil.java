package com.javadaily.yunsuan;

import java.util.ArrayList;
import java.util.List;

/**
 * 排序工具集
 */
public class SortUtil {


    /**
     * 冒泡排序
     *
     * @param list           数据集合
     * @param isPositiveSort 是否正向排序  true为正向 false为反向
     * @return
     */
    public static List<Integer> sort(List<Integer> list, boolean isPositiveSort) {

        if (list != null && list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                for (int j = 0; j < list.size() - i - 1; j++) {

                    if (isPositiveSort ? list.get(j).compareTo(list.get(j + 1)) > 0 :
                            list.get(j).compareTo(list.get(j + 1)) < 0) {
                        int temp = list.get(j);
                        list.set(j, list.get(j + 1));
                        list.set(j + 1, temp);
                    }
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(24);
        list.add(27);
        list.add(25);
        list.add(21);
        list.add(26);
        list.add(23);
        List<Integer> dataList = sort(list, false);

        for (Integer i : dataList) {
            System.out.println(i);
        }
    }
}
