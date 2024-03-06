import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class SHIfAry {

	public static void main(String[] args) {
		//[-1,2,5,7,-3,4]
		
		int ar[]= {-1,2,5,7,-3,4};
		
		int maxIndex=0;
		int secmaxIndex=-1;
		
		for(int i=1;i<ar.length;i++) {
			if(ar[i]>ar[maxIndex]) {
				secmaxIndex=maxIndex;
				maxIndex=i;
			}else if(ar[i]<ar[maxIndex]) {
				
				if(secmaxIndex==-1 || ar[i]>ar[secmaxIndex]) {
					secmaxIndex=i;
				}
				
			}
		}
		System.out.println("Second higest index :"+secmaxIndex);
		
		
		int secNum=Arrays.stream(ar).boxed().sorted((c,d)->d-c).distinct().skip(1).findFirst().get();
		int index=Arrays.binarySearch(ar, secNum);
		System.out.println(index);
		
	}

}
