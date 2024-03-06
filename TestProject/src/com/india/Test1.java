package com.india;

public class Test1 {

	public static void main(String[] args) {
		//int arr[] = {1,-1,-2,2,-3,3,-4,-4,6}; //{1,1,-2,2,-3,3,-4,-4}// i=1, leastIndex=0, i+1=2 //-2,1,1//{1,-1,-2,2,-3,3,-4,-4,6}
		int arr[] = {3, -2, 5, -1, 0, 8, -4, 7};
		int leftIndex=0;
		int rightIndex=arr.length-1;
		while(leftIndex<rightIndex) {
		
			while(leftIndex <= rightIndex && arr[leftIndex]<0) {
				leftIndex++;
			}
			while(leftIndex <= rightIndex && arr[rightIndex]>=0) {
				rightIndex--;
			}
			
			if(leftIndex <= rightIndex) {
				int temp= arr[leftIndex];
				arr[leftIndex]=arr[rightIndex];
				arr[rightIndex]=temp;
				leftIndex++;
				rightIndex++;
			}
			
		}
		
		for(int a:arr) {
			System.out.print(a+" ,");
		}

	}

}
