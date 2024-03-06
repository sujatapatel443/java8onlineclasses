package com.sp.demo;

public class StudentNotFoundExceptionMain {

	public static void main(String[] args) {
		getStudent(15);

	}
	static	void getStudent(int sid) {
		
		if(sid!=11) {
		
		throw new StudentNotFoundException(sid);
		
		}else {
			System.out.println("Hello Student");
		}
	}

}
