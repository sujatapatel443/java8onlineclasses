package com.mvc.dto;

public class RegisterDTO {
	
	private String fullName;
	private String userName;
	private String password;
	private String cPassword;
	private String email;
	private String phone;
	private String gender;
	private String courses;
	private String timing;
	private String remarks;
	
	public RegisterDTO() {
		
	}

	public RegisterDTO(String fullName, String userName, String password, String cPassword, String email, String phone,
			String gender, String courses, String timing, String remarks) {
		super();
		this.fullName = fullName;
		this.userName = userName;
		this.password = password;
		this.cPassword = cPassword;
		this.email = email;
		this.phone = phone;
		this.gender = gender;
		this.courses = courses;
		this.timing = timing;
		this.remarks = remarks;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getcPassword() {
		return cPassword;
	}

	public void setcPassword(String cPassword) {
		this.cPassword = cPassword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCourses() {
		return courses;
	}

	public void setCourses(String courses) {
		this.courses = courses;
	}

	public String getTiming() {
		return timing;
	}

	public void setTiming(String timing) {
		this.timing = timing;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	
	

}
