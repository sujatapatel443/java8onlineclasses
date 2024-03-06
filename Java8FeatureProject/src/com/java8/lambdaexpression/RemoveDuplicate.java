package com.java8.lambdaexpression;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		int[] arr= {2,4,5,4,2,3,7,8,10,15,16,20};
		
		int n=arr.length;
		
		for(int i=0;i<arr.length-1;i++) {
			
			for(int j=0;j<arr.length-1;j++) {
				
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
			}
		}
		
		n=removeDuplicate(arr,n);
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}

	}
	
	static int removeDuplicate(int[] arr ,int n) {
		
		if(n==0 || n==1) {
			return n;
		}
		
		int[] temp= new int[n];
		
		int j=0;
		
		for(int i=0;i<arr.length-1;i++) {
			
			if(arr[i]!=arr[i+1]) {
				temp[j++]=arr[i];
				
			}
		}
		
		 temp[j++]=arr[n-1];
		
		for(int k=0;k<j;k++) {
			
			arr[k]=temp[k];
		}
		return j;
		
		
	}

}
