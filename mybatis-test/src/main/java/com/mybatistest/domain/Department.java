/**  
 * mybatis-test
 * com.mybatistest.domain 
 */
package com.mybatistest.domain;

import java.util.List;

/**
 * 描述：
 * 
 * @author wqk
 * @since 2019年10月28日 下午7:33:20
 * @version
 * @see
 */
public class Department {

	private Integer id;
	private String departmentName;
	private List<Employee> employees;
	
	/**
	 * @描述：
	 * 
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @描述：
	 * 
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @描述：
	 * 
	 * @return the departmentName
	 */
	public String getDepartmentName() {
		return departmentName;
	}

	/**
	 * @描述：
	 * 
	 * @param departmentName the departmentName to set
	 */
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	/**
	 * @描述：
	 * @return the employees
	 */
	public List<Employee> getEmployees() {
		return employees;
	}

	/**
	 * @描述：
	 * @param employees the employees to set
	 */
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", departmentName=" + departmentName + "]";
	}

}
