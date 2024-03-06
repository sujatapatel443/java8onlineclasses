import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class ConversionOfArrayToList_ListToSet {
	public static void main(String[] args) {
	
		Integer[] arr= {1,2,1,4,4,6,4,3,3,7,8,10};
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		Set set=new LinkedHashSet();
		for(int a:arr) {
			System.out.print(a+" ");
			set.add(a);
		}
		
		List<Integer> col=Arrays.asList(arr);
		System.out.println("&&&&&&&&&&&&");
		System.out.println(col);
		System.out.println("***************");
		Optional<Integer> optional=col.stream().sorted((a,b)->b-a).distinct().skip(1).findFirst();
		System.out.println("Second higest in Array using collection java 8:"+optional.get());
		
		List l=new ArrayList();
		l.addAll(set);
		System.out.println();
		System.out.println(set);
		System.out.println(l);
		System.out.println(l.get(l.size()-1-1));
		System.out.println();
		
		
	}
}

	
	
	
	


