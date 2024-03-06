package com.java8.lambdaexpression;

public class ExcutionFlow {
	
	int a=10;
	static int b=20;
	{
		System.out.println("I am instance block--");
	}
	static {
		System.out.println("I am static block---");
	}
	
	String m1(String str) {
		System.out.println("I am instance method---");
		return str;
	}
	
	static int mul(int a,int c) {
		return a*c;
		
	}
	static int m2(int d) {
		System.out.println(" I am m2()---");
		return d;
	}
	

	public static void main(String[] args) {
		 
		ExcutionFlow f=new ExcutionFlow();
		System.out.println(f.a);
		System.out.println(b);
		System.out.println(ExcutionFlow.mul(25,4));
		System.out.println(ExcutionFlow.m2(30));
		System.err.println(f.m1("I am String type m1()----"));
		

	}

}
