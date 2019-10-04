/**  
 * hrm
 * com.hrm.domain 
 */
package com.hrm.domain;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

/**
 * 描述：
 * @author wqk
 * @since 2019年10月1日 上午12:58:58
 * @version   
 * @see 
 */
public class Document {

	private Integer id;//编号
	private String title;//标题
	private String fileName;//文件名
	private MultipartFile file;//文件
	private String remark;//描述
	private Date createDate;//上传时间
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
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}
	/**
	 * @描述：
	 * @param fileName the fileName to set
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	/**
	 * @描述：
	 * @return the file
	 */
	public MultipartFile getFile() {
		return file;
	}
	/**
	 * @描述：
	 * @param file the file to set
	 */
	public void setFile(MultipartFile file) {
		this.file = file;
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
	@Override
	public String toString() {
		return "Document [id=" + id + ", title=" + title + ", fileName=" + fileName + ", file=" + file + ", remark="
				+ remark + ", createDate=" + createDate + "]";
	}
}
