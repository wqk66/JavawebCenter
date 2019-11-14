/**  
 * mybatis-test
 * com.mybatistest.mapper 
 */
package com.mybatistest.mapper;

import com.mybatistest.domain.Employee;

/**
 * 描述：
 * @author wqk
 * @since 2019年10月28日 下午7:36:23
 * @version   
 * @see 
 */
public interface EmployeeMapper {
	
	public Employee getEmpAndDeptById(Integer id);
}
