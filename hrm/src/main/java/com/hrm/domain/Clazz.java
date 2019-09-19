/**  
 * hrm
 * com.hrm.domain 
 */
package com.hrm.domain;

/**
 * 描述：
 * @author wqk
 * @since 2019年9月16日 上午12:00:00
 * @version   
 * @see 
 */
public class Clazz {

	private int id;
	private String code;
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
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @描述：
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "Clazz [id=" + id + ", code=" + code + "]";
	}
}
