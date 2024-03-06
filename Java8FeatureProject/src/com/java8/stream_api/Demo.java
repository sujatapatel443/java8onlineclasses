package com.java8.stream_api;

public class Demo {

	public static void main(String[] args) {
		
		int n=6;
		fact fac=new fact();
		fac.fatorial(6);
		System.out.println(fac);
		

	}

}
class fact{
	long fatorial(int n) {
		if(n == 0|| n == 1) {
			return 1;
		}else {
			return fatorial(n-1);
		}
		
	}
	
	
}