/**  
 * mybatis-test
 * com.mybatistest.domain 
 */
package com.mybatistest.domain;

/**
 * 描述：
 * 
 * @author wqk
 * @since 2019年10月28日 下午7:28:25
 * @version
 * @see
 */
public class Employee {

	private Integer id;
	private String lastName;
	private String email;
	private String gender;
	private Department department;

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
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @描述：
	 * 
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @描述：
	 * 
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @描述：
	 * 
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @描述：
	 * 
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @描述：
	 * 
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @描述：
	 * 
	 * @return the department
	 */
	public Department getDepartment() {
		return department;
	}

	/**
	 * @描述：
	 * 
	 * @param department the department to set
	 */
	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", lastName=" + lastName + ", email=" + email + ", gender=" + gender
				+ ", department=" + department + "]";
	}

}
