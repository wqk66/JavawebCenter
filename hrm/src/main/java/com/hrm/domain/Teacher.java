/**  
 * hrm
 * com.hrm.domain 
 */
package com.hrm.domain;

import java.util.List;

/**
 * 描述：
 * @author wqk
 * @since 2019年9月16日 下午6:41:23
 * @version   
 * @see 
 */
public class Teacher {

	private int id;
	private String name;
	private List<Student2> studentList;
	private String no;
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
	 * @return the studentList
	 */
	public List<Student2> getStudentList() {
		return studentList;
	}
	/**
	 * @描述：
	 * @param studentList the studentList to set
	 */
	public void setStudentList(List<Student2> studentList) {
		this.studentList = studentList;
	}
	/**
	 * @描述：
	 * @return the no
	 */
	public String getNo() {
		return no;
	}
	/**
	 * @描述：
	 * @param no the no to set
	 */
	public void setNo(String no) {
		this.no = no;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", studentList=" + studentList + ", no=" + no + "]";
	}
	
}
