/**  
 * hrm
 * com.hrm.domain 
 */
package com.mybatistest.domain;

import java.util.List;

/**
 * 描述：
 * @author wqk
 * @since 2019年9月16日 下午6:42:04
 * @version   
 * @see 
 */
public class Student {

	private int id;
	private String name;
	private List<Teacher> teacherlist;
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
	 * @return the teacherlist
	 */
	public List<Teacher> getTeacherlist() {
		return teacherlist;
	}
	/**
	 * @描述：
	 * @param teacherlist the teacherlist to set
	 */
	public void setTeacherlist(List<Teacher> teacherlist) {
		this.teacherlist = teacherlist;
	}
	@Override
	public String toString() {
		return "Student2 [id=" + id + ", name=" + name + ", teacherlist=" + teacherlist + "]";
	}
	
	
}
