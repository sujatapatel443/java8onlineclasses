package com.java8.lambdaexpression;

public class BubbleSorting {

	public static void main(String[] args) {
		
		int[] arr= {13,2,7,3,5,4,21,8,2,9,10,15,10};// {32,34,10,12,20,25};
		
		for(int i=0;i<arr.length-1;i++) {
			
			for(int j=0;j<arr.length-1;j++) {
				
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
				
			}
		}
		for(int a:arr) {
		System.out.print(a+" ");
		}
		System.out.println();
		System.out.println(arr[arr.length-2]);
		
		System.out.println("*************************");
		
		int newSize=removeduplicates(arr,arr.length);
		
		for(int l=0; l<newSize;l++) {
			System.out.print(arr[l]+" ");
		}

	}
	
	public static int removeduplicates(int a[], int n)
    {
        if (n == 0 || n == 1) {
            return n;
        }
 
        // creating another array for only storing
        // the unique elements
        int[] temp = new int[n];
        int j = 0;
 
        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                temp[j++] = a[i];
            }
        }
 
        temp[j++] = a[n - 1];
 
        // Changing the original array
        for (int i = 0; i < j; i++) {
            a[i] = temp[i];
        }
 
        return j;
    }

}
