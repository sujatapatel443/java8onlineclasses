package com.java8.lambdaexpression;

public class EvenPairInArray {

	public static void main(String[] args) {
		int a[]= {1,2,7,4,12,8,9};
		
		for(int j=0;j<a.length;j++) {
			for(int i=0;i<a.length;i++) {
				if(i<j && ((a[j]+a[i])%2==0)) {
					System.out.println(a[j]+" and "+a[i]+ " is even pair");
				}
			}
		}
	}
}
