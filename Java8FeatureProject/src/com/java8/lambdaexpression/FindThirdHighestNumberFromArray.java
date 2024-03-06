package com.java8.lambdaexpression;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindThirdHighestNumberFromArray {

	public static void main(String[] args) {
		
		Integer[] arr={2,3,5,7,11,13};

		List<Integer> list =Arrays.asList(arr);

		Optional<Integer> newList=list.stream().sorted((a,b)->b-a).distinct().skip(2).findFirst();
		System.out.println(newList.get());
		
		Optional<Integer> nData=list.stream().filter(a->a<11).findFirst();
		System.out.println("&&&&&&&&&");
		System.out.println(nData.get());

		System.out.println("*****"+newList.get());
		
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==7) {
				System.out.println(arr[i]);
				
				
			}
		}
		
		//2, 3, 5, 11, 13
		
		
			
			for(int j=0;j<arr.length-1;j++) {
				
				if(arr[j]>5) {
					System.out.println(arr[j]);
					break;
				}
			}
		
		for(int a:arr) {
			System.out.print(a+" ");}
		
		System.out.println("**************");
		
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i] > 5 && arr[i] < 9) {
				
				System.out.print(arr[i]+" ");
			}
		}
		
		System.out.println();
		
		
		list.stream().filter(a->a>5).forEach(System.out::println);
		
		System.out.println();
		
		Optional<Integer> sortedlist=list.stream().filter(a->a<9).distinct().skip(3).findFirst();
		
		System.out.println(sortedlist.get());

	}

}

class MyCustomException extends RuntimeException{
	
	MyCustomException(){
		
	}
	
}
