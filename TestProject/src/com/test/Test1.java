package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {

	public static void main(String[] args) {
		//Swap two numbers without using the third variable
		int m=10;
		int n=15;
		System.out.println(m+"\t"+n);
		m=m+n;
		n=m-n;
		m=m-n;
		System.out.println(m+"\t"+n);
		
		//Find prime numbers between 1 - 100
		for(int i=1; i<=100; i++) {
			boolean flag=false;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					flag=true;
					break;
				}
			}
			if(!flag) {
				System.out.println("Given number is :"+i+ " Prime number");
			}
		}
		
		int a[]= {4,2,9,6,3,7,1};
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for(int b:a) {
			System.out.print(b +" ");
		} System.out.println();
		
		List<Integer> l=Arrays.asList(4,2,9,6,3,7,1);
		System.out.println(l.stream().sorted().collect(Collectors.toList()));

	}

}
