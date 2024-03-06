package com.test;

public class A implements Inter1, Inter2{

	@Override
	public void m() {
		System.out.println("A-- m()");
		
	}
	
	@Override
	public void m1() {
		Inter2.super.m1();
	    Inter1.super.m1();
	}

	public static void main(String[] args) {
		Inter1 i1=new A();
		Inter2 i2=new A();
		i1.m();
		i2.m();
		/////////////
		i1.m1();
		
	}

}
