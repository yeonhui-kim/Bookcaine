package com.bookcaine.web.entity;

public class Member {
	private String id;
	private String pwd;
	private String name;
	private String gender;
	private String birthday;
	private String phone;
	private String email;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
//		return "Member [id=" + id + ", pwd=" + pwd + ", name=" + name + ", gender=" + gender + ", birthday=" + birthday
//				+ ", phone=" + phone + ", email=" + email + "]";
		return "{\"id\":" + id + ", \"pwd\":\"" + pwd + "\", \"name\":\"" + name + "\", \"gender\":\"" + gender
	            + "\", \"birthday\":\"" + birthday + "\", \"phone\":" + phone + ", \"email\":\"" + email + "\"}";
	}
	
	
	
	
}
