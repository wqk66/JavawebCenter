/**  
 * hrm
 * com.hrm.user 
 */
package com.hrm.user;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hrm.domain.Clazz;
import com.hrm.domain.Student;
import com.hrm.mapper.StudentMapper;

/**
 * 描述：
 * @author wqk
 * @since 2019年9月16日 上午12:17:03
 * @version   
 * @see 
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentApplicationTest {

	@Autowired
	private StudentMapper studentMapper;
	
//	@Test
//	public void selectStudent() {
//		List<Student> list = studentMapper.selectStudent();
//		for(Student student : list) {
//			Clazz clazz = student.getClazz();
//			System.out.println(clazz.toString());
//			System.out.println(student.toString());
//		}
//	}
	
	@Test
	public void selectStudent2() {
		List<Student> list = studentMapper.selectStudent2();
		for(Student student : list) {
			System.out.println(student.toString());
		}
			
		
	}
}
