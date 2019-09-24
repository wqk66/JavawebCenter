/**  
 * mybatis-test
 * com.mybatistest.domain 
 */
package com.mybatistest.domain;

/**
 * 描述：
 * @author wqk
 * @since 2019年9月19日 下午6:54:08
 * @version   
 * @see 
 */
public class User {

	private int id;
	private String loginName;
	private String password;
	private String userName;
	private String phone;
	private String address;
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
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @描述：
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @描述：
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @描述：
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", loginName=" + loginName + ", password=" + password + ", userName=" + userName
				+ ", phone=" + phone + ", address=" + address + "]";
	}
	
}
