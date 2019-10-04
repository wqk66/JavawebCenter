/**  
 * hrmsys
 * com.hrm.domain 
 */
package com.hrm.domain;

import java.util.Date;

/**
 * 描述：用户的领域模型
 * @author wqk
 * @since 2019年9月8日 上午1:17:44
 * @version   
 * @see 
 */
public class User {
	
	private Integer id;
	private String loginName;
	private String password;
	private String userName;
	private Integer status;
	private Date createDate;
	public User() {}
	
	public User(String loginName,String password,String userName) {
		this.loginName = loginName;
		this.password = password;
		this.userName = userName;
	}
	/**
	 * @描述：
	 * @return the loginName
	 */
	public String getLoginName() {
		return loginName;
	}
	/**
	 * @描述：
	 * @param loginName the loginName to set
	 */
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	/**
	 * @描述：
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @描述：
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @描述：
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @描述：
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @描述：
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * @描述：
	 * @param status the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * @描述：
	 * @return the createDate
	 */
	public Date getCreateDate() {
		return createDate;
	}

	/**
	 * @描述：
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

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

	@Override
	public String toString() {
		return "User [loginName=" + loginName + ", password=" + password + ", userName=" + userName + ", status="
				+ status + ", createDate=" + createDate + "]";
	}
	
}
