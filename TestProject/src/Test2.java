import java.util.*;
import java.util.stream.Collectors;

public class Test2 {

	public static void main(String[] args) {
		
		List<Integer> ll=new ArrayList<Integer>();
		ll.add(10);ll.add(5);ll.add(4);ll.add(12);
		ll.add(3);ll.add(19);ll.add(32);ll.add(27);
		
		System.out.println(ll.stream().sorted().collect(Collectors.toList()));

	}

}
