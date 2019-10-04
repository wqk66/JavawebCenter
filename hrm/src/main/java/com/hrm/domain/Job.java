/**  
 * hrm
 * com.hrm.domain 
 */
package com.hrm.domain;

/**
 * 描述：
 * @author wqk
 * @since 2019年10月1日 上午12:48:47
 * @version   
 * @see 
 */
public class Job {

	private Integer id;
	private String name;
	private String remark;
	
	public Job() {}

	/**
	 * @描述：
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @描述：
	 * @param id the id to set
	 */
	public void setId(Integer id) {
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
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * @描述：
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "Job [id=" + id + ", name=" + name + ", remark=" + remark + "]";
	};
	
}
