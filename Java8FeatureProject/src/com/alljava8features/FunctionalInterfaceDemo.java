package com.alljava8features;

import java.util.function.Function;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		Function<String, Integer> function=new FunctionalImpl();
		Integer res=function.apply("SujataPatel");
		System.out.println(res);
		
		Function<String, Integer> functionRef=(String str)->{
			
			return str.length();
			
		};
		
		System.out.println(functionRef.apply("Anusha"));
	}

}

class FunctionalImpl implements Function<String, Integer>{

	@Override
	public Integer apply(String str) {
		
		return str.length();
	}
	
}
