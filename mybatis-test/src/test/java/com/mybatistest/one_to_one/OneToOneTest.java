/**  
 * mybatis-test
 * com.mybatistest.one_to_one 
 */
package com.mybatistest.one_to_one;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mybatistest.domain.Department;
import com.mybatistest.domain.Employee;
import com.mybatistest.mapper.DepartmentMapper;
import com.mybatistest.mapper.EmployeeMapper;

/**
 * 描述：
 * @author wqk
 * @since 2019年10月28日 下午7:49:38
 * @version   
 * @see 
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OneToOneTest {

	@Autowired
	private EmployeeMapper mapper;
	@Autowired
	private DepartmentMapper departMapper;
	
//	@Test
//	public void employeeTest() {
//		
//		try {
//			Employee employee = mapper.getEmpAndDeptById(1);
//			Department department = employee.getDepartment();
//			System.out.println(employee.toString());
//			System.out.println(department.toString());
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		
//	}
	
	@Test
	public void departmentTest() {
		
		try {
			Department dept = departMapper.getdeptById(9);
			List<Employee> empolyees = dept.getEmployees();
			System.out.println(dept.toString());
			for(Employee e : empolyees) {
				System.out.println(e.toString());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
