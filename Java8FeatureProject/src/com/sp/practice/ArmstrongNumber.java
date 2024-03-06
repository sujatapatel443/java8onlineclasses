package com.sp.practice;

import java.util.HashMap;
import java.util.Map;

public class ArmstrongNumber {

	public static void main(String[] args) {

		/*int num=5;
		int fact=1;
		for(int i=5;i>=1;i--) {
			fact=fact*i;
		}
		System.out.println(fact);
		*/
		int[] arr= {1,3,5,7,8,12,14,15,26};
		
		for(int i=0;i<arr.length;i++) {
			
			if((arr[i])%2!=0) {
				System.out.print(arr[i]+" ");
				
				System.out.println();
			}
		}
}
} 