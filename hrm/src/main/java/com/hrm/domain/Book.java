/**  
 * hrmsys
 * com.hrm.domain 
 */
package com.hrm.domain;

import java.util.Date;

/**
 * 描述：书籍的领域模型
 * 
 * @author tsingsoft
 * @since 2019年9月8日 上午1:19:12
 * @version
 * @see 1.0
 */
public class Book {
	private Integer id;
	private String name;
	private String author;
	private String publication;
	private Date publicationDate;
	private Double price;
	private String image;
	private String remark;

	/**
	 * @描述：
	 * 
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @描述：
	 * 
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @描述：
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @描述：
	 * 
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @描述：
	 * 
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @描述：
	 * 
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @描述：
	 * 
	 * @return the publication
	 */
	public String getPublication() {
		return publication;
	}

	/**
	 * @描述：
	 * 
	 * @param publication the publication to set
	 */
	public void setPublication(String publication) {
		this.publication = publication;
	}

	/**
	 * @描述：
	 * 
	 * @return the publicationDate
	 */
	public Date getPublicationDate() {
		return publicationDate;
	}

	/**
	 * @描述：
	 * 
	 * @param publicationDate the publicationDate to set
	 */
	public void setPublicationDate(Date publicationDate) {
		this.publicationDate = publicationDate;
	}

	/**
	 * @描述：
	 * 
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}

	/**
	 * @描述：
	 * 
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}

	/**
	 * @描述：
	 * 
	 * @return the image
	 */
	public String getImage() {
		return image;
	}

	/**
	 * @描述：
	 * 
	 * @param image the image to set
	 */
	public void setImage(String image) {
		this.image = image;
	}

	/**
	 * @描述：
	 * 
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * @描述：
	 * 
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

}
