package com.india;

import java.util.Arrays;
import java.util.stream.Collectors;

public class C1 {

	public static void main(String[] args) {
		
		Integer a[]= {-5,3,5,-6,4,0,3,-2,1,0,-5};
		int leftIndex=0;
		int rightIndex=a.length-1;
		
		while(leftIndex<rightIndex) {
			
			while(a[leftIndex]<0) {
				leftIndex++;
			}
			while(a[rightIndex]>=0) {
				rightIndex--;
			}
			
			if(leftIndex<rightIndex) {
				int temp=a[leftIndex];
				a[leftIndex]=a[rightIndex];
				a[rightIndex]=temp;
				leftIndex++;
				rightIndex--;
			}
		}
		
		for(Integer b:a) {
			System.out.print(b+" ");
		}
		System.out.println();
		for(int j=0;j<a.length;j++) {
			for(int k=0;k<a.length;k++) {
				if(a[j]<a[k]) {
					int temp=a[j];
					a[j]=a[k];
					a[k]=temp;
				}
			}
			
		}
		for(Integer b:a) {
			System.out.print(b+" ");
		}

	}

}
