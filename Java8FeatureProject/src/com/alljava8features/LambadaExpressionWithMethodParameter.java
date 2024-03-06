package com.alljava8features;

public class LambadaExpressionWithMethodParameter {

	public static void main(String[] args) {
		
	
		Addable addition=( a, b)-> (a+b);
	int res=addition.addition(5, 23);
	System.out.println(res);
		
	Addable addition1=(a,b)->{
		int c=a+b;
		return c;
	};
	
	int result =addition1.addition(20, 52);
	System.out.println(result);

	}

}

interface Addable{
	int addition(int a,int b);
}

class Addition implements Addable{

	@Override
	public int addition(int a, int b) {
		
		return (a+b);
	}
	
}

