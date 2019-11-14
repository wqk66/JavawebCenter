/**  
 * mybatis-test
 * com.mybatistest.one_to_one 
 */
package com.mybatistest.one_to_one;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述：
 * @author wqk
 * @since 2019年11月7日 下午11:04:08
 * @version   
 * @see 
 */
public class Test {

	public static void main(String[] args) {
		
		
		List<Double> dataList = new ArrayList<Double>();
		dataList.add(89d);
		dataList.add(29d);
		dataList.add(49d);
		dataList.add(59d);
		dataList.add(69d);
		
		
		for(int i=0;i<dataList.size();i++) {
			for(int j=0;j<dataList.size()-i-1;j++) {
				if(dataList.get(j) > dataList.get(j+1)) {
					Double temp = dataList.get(j);
					dataList.set(j, dataList.get(j+1));
					dataList.set(j+1, temp);
				}
			}
		}
		
		for(Double d : dataList) {
			System.out.println(d);
		}
		 
	}
}
