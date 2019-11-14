/**  
 * hrm
 * com.hrm.user 
 */
package com.mybatistest.many_to_one;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import com.mybatistest.domain.Position;
import com.mybatistest.domain.Teacher;
import com.mybatistest.mapper.PositionMapper;


/**
 * 描述�?
 * @author wqk
 * @since 2019�?9�?16�? 下午7:02:48
 * @version   
 * @see 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class PostionApplicationTest {

	@Autowired
	PositionMapper positionMapper;
	
	@Test
	public void postionTest() {
		
		//查询职位
//		Position p = positionMapper.queryPositionById(1);
//		System.out.println(p.toString());
		
		//查询职位
//		Position p = positionMapper.queryPositionTeacherResultMapById(1);
//		List<Teacher> teachers = p.getTeachers();
//		System.out.println(p.toString());
//		for(Teacher t : teachers) {
//			System.out.println(t.toString());
//		}
		
		//查询职位以及职位对应的老师
		Position position = positionMapper.queryPositionTeacherResultMap(1);
		System.out.println(position.getName());
		List<Teacher> teachers = position.getTeachers();
		for(Teacher t : teachers) {
			System.out.println(t.getName()+"--"+t.getNo());
		}
		
		Teacher teacher = positionMapper.queryPositionByTeacherID(1);
		System.out.println(teacher.toString());
		
//		List<Map<String, Object>> dataList = positionMapper.queryPotionByTeacherid("1");
//		
//		System.out.println(dataList.toString());
		
	}
}
