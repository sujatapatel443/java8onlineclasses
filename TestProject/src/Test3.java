import java.util.*;

public class Test3 {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		
		l.add(10);l.add(7);l.add(12);
		l.add(5);l.add(3);l.add(14);
		
		System.out.println(l.stream().sorted((a,b)->b-a).skip(2).findFirst().get());
		
		int arr[]= {-10,-7,-12,-1,-5,-3,-14,-4};
		int maxIndex=0;
		int secMax=-1;
		
		for(int i=1;i<arr.length;i++) {
			
			if(arr[i]>arr[maxIndex]) {
				secMax=maxIndex;
				maxIndex=i;
			}else if(arr[i]<arr[maxIndex]) {
				
				if(secMax==-1 || arr[i]>arr[secMax]) {
					secMax=i;
				}
			}
			
		}
		
		System.out.println(arr[secMax]);
	}

}
