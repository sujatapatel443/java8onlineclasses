package com.alljava8features;

public class TestSum {
	
	public static void main(String[] args) {
		int arr[] = {1, 2,3,4,6,7,8,9,10};
		int total=10*(10+1)/2;
		System.out.println(total);
		
		
		int finalTotal=0;
		for(int i=0; i<arr.length; i++) {
			finalTotal=finalTotal+arr[i];
		}
		System.out.println(total-finalTotal);
		
		
	}
	

}
