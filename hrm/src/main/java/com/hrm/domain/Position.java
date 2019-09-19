/**  
 * hrm
 * com.hrm.domain 
 */
package com.hrm.domain;

import java.util.List;

/**
 * 描述：
 * @author wqk
 * @since 2019年9月16日 下午6:40:37
 * @version   
 * @see 
 */
public class Position {

	private int id;
	private String name;
	private List<Teacher> teachers;
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
	 * @return the teacher
	 */
	/**
	 * @描述：
	 * @return the teachers
	 */
	public List<Teacher> getTeachers() {
		return teachers;
	}
	/**
	 * @描述：
	 * @param teachers the teachers to set
	 */
	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}
	@Override
	public String toString() {
		return "Position [id=" + id + ", name=" + name + ", teachers=" + teachers + "]";
	}
}
