package com.india.hibernate.entity;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionOfElements;
import org.hibernate.annotations.IndexColumn;

@Entity
@Table(name = "Studentss")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sid;

	private String sname;
	private String dob;
	private String qualification;

	@CollectionOfElements
	@JoinTable(name = "courses", joinColumns = @JoinColumn(name = "sid"))
	@IndexColumn(name = "idx")
	private String[] couurses;

	@CollectionOfElements
	@JoinTable(name = "emails", joinColumns = @JoinColumn(name = "sid"))
	@IndexColumn(name = "idx")
	private List<String> emails;

	@CollectionOfElements
	@JoinTable(name = "phones", joinColumns = @JoinColumn(name = "sid"))
	@IndexColumn(name = "idx")
	private Set<Long> phones;

	@CollectionOfElements
	@JoinTable(name = "marks", joinColumns = @JoinColumn(name = "sid"))
	@IndexColumn(name = "idx")
	private List<Integer> marks;

	@CollectionOfElements
	@JoinTable(name = "refs", joinColumns = @JoinColumn(name = "sid"))
	@IndexColumn(name = "idx")
	private Map<String, Long> refs;

	public Student() {

	}

	public Student(String sname, String dob, String qualification) {

		this.sname = sname;
		this.dob = dob;
		this.qualification = qualification;
	}

	public Student(int sid, String sname, String dob, String qualification) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.dob = dob;
		this.qualification = qualification;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String[] getCouurses() {
		return couurses;
	}

	public void setCouurses(String[] couurses) {
		this.couurses = couurses;
	}

	public List<String> getEmails() {
		return emails;
	}

	public void setEmails(List<String> emails) {
		this.emails = emails;
	}

	public Set<Long> getPhones() {
		return phones;
	}

	public void setPhones(Set<Long> phones) {
		this.phones = phones;
	}

	public List<Integer> getMarks() {
		return marks;
	}

	public void setMarks(List<Integer> marks) {
		this.marks = marks;
	}

	public Map<String, Long> getRefs() {
		return refs;
	}

	public void setRefs(Map<String, Long> refs) {
		this.refs = refs;
	}

}
