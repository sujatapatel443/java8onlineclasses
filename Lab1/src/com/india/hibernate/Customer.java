package com.india.hibernate;

import javax.persistence.*;

@Entity
@Table(name = "mycustomers")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cid")
	private int cid;
	
	@Column(name = "cname")
	private String cname;
	
	@Column(name = "myemail")
	private String email;
	
	@Column(name = "myphone")
	private int phone;
	
	@Column(name = "mycity")
	private String city;

	public Customer() {
	}

	public Customer(String cname, String email, int phone, String city) {
		this.cname = cname;
		this.email = email;
		this.phone = phone;
		this.city = city;
	}

	public Customer(int cid, String cname, String email, int phone, String city) {
		this.cid = cid;
		this.cname = cname;
		this.email = email;
		this.phone = phone;
		this.city = city;
	}

	// Setters and Getters
	
	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return " [" + cid + ", " + cname + ", " + email + ", " + phone + ", " + city + "]";
	}

}