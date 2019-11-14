/**  
 * mybatis-test
 * com.mybatistest.mapper 
 */
package com.mybatistest.mapper;

import com.mybatistest.domain.Department;

/**
 * 描述：
 * @author wqk
 * @since 2019年10月29日 下午7:34:33
 * @version   
 * @see 
 */
public interface DepartmentMapper {
	
	public Department getdeptById(Integer id);
}
