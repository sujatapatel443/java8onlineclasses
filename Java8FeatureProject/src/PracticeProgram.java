import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PracticeProgram {

	public static void main(String[] args) {

	
		/*Integer[] arr= {1,2,3,3,4,5,5,6,8};
		List<Integer> l=Arrays.asList(arr);*/
		
		List<String> l=new ArrayList<String>();
		l.add("a");
		l.add("Sujata");
		l.add("Raj");
		l.add("Sujata");
			
		
		List<String> duplicateElement=l.stream().filter(a->Collections.frequency(l, a)>1).collect(Collectors.toList());
		
		System.out.println(duplicateElement);

	}
}
