import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumUsuingStream_Reduce {

	public static void main(String[] args) {
Integer[] A= {1,2,3,4,6,7,2,4,5};
		
		List<Integer> list=Arrays.asList(A);
		
		Integer res=list.stream().reduce(0,(l1,l2)->l1+l2);
		
		System.out.println(res);
		System.out.println("**************");
		
	 System.out.println(list.stream().collect(Collectors.toSet()));
	 
	 System.out.println(list.stream().count());
	 

	}

}
