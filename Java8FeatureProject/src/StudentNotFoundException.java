package com.sp.demo;

public class StudentNotFoundException extends RuntimeException{
	
	int sid=11;
	StudentNotFoundException(int sid){
		super(String.valueOf(sid));
	}

}
