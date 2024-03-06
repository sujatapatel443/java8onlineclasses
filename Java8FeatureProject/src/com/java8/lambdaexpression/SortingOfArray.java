package com.java8.lambdaexpression;
public class SortingOfArray {

	public static void main(String[] args) {

		int[] arr = { 13, 2, 7, 3, 5, 4, 21, 8, 9, 10, 15 };

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1; j++) {

				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		for (int c : arr) {
			System.out.print(c + " ");

		}
		System.out.println();
		for(int j=0;j<arr.length; j++) {
			if(arr[j]==15) {
				System.out.println("index of "+arr[j]+ " is :"+j);
			}
		}

		
		
	}
}
