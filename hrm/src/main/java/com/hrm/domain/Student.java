/**  
 * hrm
 * com.hrm.domain 
 */
package com.hrm.domain;

/**
 * 描述：
 * @author wqk
 * @since 2019年9月16日 上午12:00:36
 * @version   
 * @see 
 */
public class Student {

	private int id;
	private String name;
	private String sex;
	private int age;
	private Clazz clazz;
	/**
	 * @描述：
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @描述：
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @描述：
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @描述：
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @描述：
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * @描述：
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * @描述：
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @描述：
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @描述：
	 * @return the clazz
	 */
	public Clazz getClazz() {
		return clazz;
	}
	/**
	 * @描述：
	 * @param clazz the clazz to set
	 */
	public void setClazz(Clazz clazz) {
		this.clazz = clazz;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + ", clazz=" + clazz + "]";
	}
	
}
