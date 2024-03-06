package com.test;

public interface Inter1 {
	
	void m();
	
	default void m1() {
		System.out.println("m1--Inter1");
	}

}
