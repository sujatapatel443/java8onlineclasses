package com.java8.lambdaexpression;

public class SayableClient {

	public static void main(String[] args) {
		
		int i=25;
		Sayable Sayable=(a)->{
			System.out.println("I am say() method--->"+i);
			return "I said what I have to say";
		};
		Sayable.say(" ");

	}

}
