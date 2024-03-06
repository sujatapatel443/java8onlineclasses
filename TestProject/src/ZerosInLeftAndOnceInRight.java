
public class ZerosInLeftAndOnceInRight {

	public static void main(String[] args) {
		int leastIndex=0;
		//int arr[]= {10,5,0,1,0,0,15};
		int arr[]= {1,0,0,1,0,0,1,3,5,0,0,1};
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=0 && arr[i+1]!=0) {
				if(leastIndex==0) {
					leastIndex=i;
					
				}
				leastIndex=leastIndex;
				
			}else if(arr[i]!=0 && arr[i+1]==0) {
				int temp=arr[leastIndex];
				
				arr[leastIndex]=arr[i+1];
				int temp1=arr[i];
				arr[i]=temp;
				arr[i+1]=temp1;
				
				if(arr[leastIndex+1]!=0 && leastIndex<i) {
					leastIndex=leastIndex+1;
				}else {
					leastIndex=i;
				}
				
			}
		}
		
		for(int k:arr) {
			System.out.print(k+" ,");
		}

	}

}
