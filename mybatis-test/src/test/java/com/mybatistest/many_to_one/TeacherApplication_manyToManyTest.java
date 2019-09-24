/**  
 * mybatis-test
 * com.mybatistest.many_to_one 
 */
package com.mybatistest.many_to_one;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mybatistest.domain.Position;
import com.mybatistest.domain.Student;
import com.mybatistest.domain.Teacher;
import com.mybatistest.mapper.TeacherMapper;

/**
 * 描述：
 * @author wqk
 * @since 2019年9月20日 上午11:33:33
 * @version   
 * @see 
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class TeacherApplication_manyToManyTest {
	
	@Autowired
	private TeacherMapper teacherMapper;
	@Test
	public void teacherApplicationTest() {
		//返回类型为Map时测试
//		List<Map<String, Object>> dataList = teacherMapper.queryStudentByTeacherID(1);
//		for(Map<String, Object> dataMap : dataList) {
//			for(Map.Entry<String, Object> entry : dataMap.entrySet()) {
//				System.out.println("key:"+entry.getKey());
//				System.out.println("value:"+entry.getValue());
//			}
//		}
		
		
		//返回类型为领域模型的数据测试
//		Teacher teacher = teacherMapper.queryStudentByTeacherID2(1);
//		List<Student> students = teacher.getStudentList();
//		System.out.print(teacher.getName()+"----"+teacher.getNo()+" ");
//		for(Student student : students) {
//			System.out.println(student.getName());
//		}
		
		//根据学生id查询教师信息
//		Student student = teacherMapper.queryteacherByStudentId(1);
//		List<Teacher> teachers = student.getTeacherlist();
//		System.out.println(student.getName()+"同学的老师：");
//		for(Teacher teacher : teachers) {
//			System.out.println(teacher.getName()+"---"+teacher.getNo());
//		}
		
		//插入教师信息
//		Teacher teacher = new Teacher();
//		Position p = new Position();
//		teacher.setName("wqk2");
//		teacher.setNo("2222");
//		p.setId(1);
//		teacher.setPosition(p);
//		teacherMapper.insertTeacher(teacher);
		
		//更新教师信息
//		Teacher teacher = new Teacher();
//		teacher.setName("wqk44");
//		teacher.setNo("332244");
//		teacher.setId(6);
//		teacherMapper.updateTeacher(teacher);
		
		//删除教师信息
		teacherMapper.deleteTeacher(6);
	
	}
}
