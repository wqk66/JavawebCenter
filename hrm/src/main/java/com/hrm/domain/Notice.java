/**  
 * hrm
 * com.hrm.domain 
 */
package com.hrm.domain;

import java.util.Date;

/**
 * 描述：
 * @author wqk
 * @since 2019年10月1日 上午12:57:20
 * @version   
 * @see 
 */
public class Notice {

	private Integer id;
	private String title;//标题
	private String content;//内容
	private Date createDate;//发布日期
	private User user;//发布人
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
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @描述：
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @描述：
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @描述：
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
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
	 * @return the user
	 */
	public User getUser() {
		return user;
	}
	/**
	 * @描述：
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Notice [id=" + id + ", title=" + title + ", content=" + content + ", createDate=" + createDate
				+ ", user=" + user + "]";
	}
}
