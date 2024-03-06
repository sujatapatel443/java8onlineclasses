package com.java8.lambdaexpression;

public class Employee1 implements Comparable{
	
	int id;
	String name;
	long phone;
	double salary;
	public Employee1() {
		
	}
	public Employee1(int id, String name, long phone, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		
		return id+" "+name+" "+phone+" "+salary;
	}
	@Override
	public int hashCode() {
		
		return id;
	}
	@Override
	public int compareTo(Object o) {
		if(o instanceof Employee1) {
			Employee1 e=(Employee1)o;
			return this.id-e.id;
		}
		return 0;
	}
}
