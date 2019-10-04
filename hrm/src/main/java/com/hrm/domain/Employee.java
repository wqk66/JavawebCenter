/**  
 * hrm
 * com.hrm.domain 
 */
package com.hrm.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * 描述：
 * @author wqk
 * @since 2019年10月1日 上午12:50:19
 * @version   
 * @see 
 */
public class Employee {

	private Integer id;
	//员工关联的部门
	private Dept dept;
	//员工关联的职位
	private Job job;
	private String name;
	private String cardId;//身份证
	private String address;//地址
	private String postCode;//邮政编码
	private String tel;
	private String phone;
	private String qqNum;
	private String email;
	private String gender;
	private String party;//政治面貌
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date birthday;
	private String race;
	private String education;
	private String speciality;//专业
	private String hobby;
	private String remark;
	private Date createDate;//建档日期
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
	 * @return the dept
	 */
	public Dept getDept() {
		return dept;
	}
	/**
	 * @描述：
	 * @param dept the dept to set
	 */
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	/**
	 * @描述：
	 * @return the job
	 */
	public Job getJob() {
		return job;
	}
	/**
	 * @描述：
	 * @param job the job to set
	 */
	public void setJob(Job job) {
		this.job = job;
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
	 * @return the cardId
	 */
	public String getCardId() {
		return cardId;
	}
	/**
	 * @描述：
	 * @param cardId the cardId to set
	 */
	public void setCardId(String cardId) {
		this.cardId = cardId;
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
	/**
	 * @描述：
	 * @return the postCode
	 */
	public String getPostCode() {
		return postCode;
	}
	/**
	 * @描述：
	 * @param postCode the postCode to set
	 */
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	/**
	 * @描述：
	 * @return the tel
	 */
	public String getTel() {
		return tel;
	}
	/**
	 * @描述：
	 * @param tel the tel to set
	 */
	public void setTel(String tel) {
		this.tel = tel;
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
	 * @return the qqNum
	 */
	public String getQqNum() {
		return qqNum;
	}
	/**
	 * @描述：
	 * @param qqNum the qqNum to set
	 */
	public void setQqNum(String qqNum) {
		this.qqNum = qqNum;
	}
	/**
	 * @描述：
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @描述：
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @描述：
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @描述：
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @描述：
	 * @return the party
	 */
	public String getParty() {
		return party;
	}
	/**
	 * @描述：
	 * @param party the party to set
	 */
	public void setParty(String party) {
		this.party = party;
	}
	/**
	 * @描述：
	 * @return the birthday
	 */
	public Date getBirthday() {
		return birthday;
	}
	/**
	 * @描述：
	 * @param birthday the birthday to set
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	/**
	 * @描述：
	 * @return the race
	 */
	public String getRace() {
		return race;
	}
	/**
	 * @描述：
	 * @param race the race to set
	 */
	public void setRace(String race) {
		this.race = race;
	}
	/**
	 * @描述：
	 * @return the education
	 */
	public String getEducation() {
		return education;
	}
	/**
	 * @描述：
	 * @param education the education to set
	 */
	public void setEducation(String education) {
		this.education = education;
	}
	/**
	 * @描述：
	 * @return the speciality
	 */
	public String getSpeciality() {
		return speciality;
	}
	/**
	 * @描述：
	 * @param speciality the speciality to set
	 */
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	/**
	 * @描述：
	 * @return the hobby
	 */
	public String getHobby() {
		return hobby;
	}
	/**
	 * @描述：
	 * @param hobby the hobby to set
	 */
	public void setHobby(String hobby) {
		this.hobby = hobby;
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
		return "Employee [id=" + id + ", dept=" + dept + ", job=" + job + ", name=" + name + ", cardId=" + cardId
				+ ", address=" + address + ", postCode=" + postCode + ", tel=" + tel + ", phone=" + phone + ", qqNum="
				+ qqNum + ", email=" + email + ", gender=" + gender + ", party=" + party + ", birthday=" + birthday
				+ ", race=" + race + ", education=" + education + ", speciality=" + speciality + ", hobby=" + hobby
				+ ", remark=" + remark + ", createDate=" + createDate + "]";
	}
}
