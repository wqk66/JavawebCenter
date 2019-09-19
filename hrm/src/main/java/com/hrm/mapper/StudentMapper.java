/**  
 * hrm
 * com.hrm.mapper 
 */
package com.hrm.mapper;

import java.util.List;

import com.hrm.domain.Student;

/**
 * 描述：
 * @author wqk
 * @since 2019年9月16日 上午12:04:56
 * @version   
 * @see 
 */
public interface StudentMapper {

	
	public List<Student> selectStudent();
	
	public List<Student> selectStudent2();
}
