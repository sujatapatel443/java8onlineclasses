import java.util.*;
import java.util.stream.Collectors;

public class Test4 {

	public static void main(String[] args) {
		//Integer a[]={2, 5, 2, 6, 8, 5, 8, 8}; //Output: {6, 2, 2, 5, 5, 8, 8, 8}
		List<Integer> l=new ArrayList<Integer>();
		l.add(2);l.add(5);l.add(2);l.add(6);
		l.add(8);l.add(5);l.add(8);l.add(8);l.add(0);l.add(0);l.add(0);l.add(2);
		
        System.out.println(l.stream().sorted(Comparator.comparing(Integer::valueOf)).
		sorted((a,b)->Collections.frequency(l, a)-Collections.frequency(l, b)).collect(Collectors.toList()));
       
   }
	

}
