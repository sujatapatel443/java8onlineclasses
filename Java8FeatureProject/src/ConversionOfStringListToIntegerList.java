import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConversionOfStringListToIntegerList {

	public static void main(String[] args) {
		
		List<String> l=new ArrayList<String>();
		l.add("123");l.add("234");l.add("453");
		l.forEach(b->{
			System.out.println(b+10);
		});
		
		l.stream().forEach(a->{
			int i=Integer.parseInt(a);
			System.out.println(i);
		});
		List<Integer> ll=l.stream().map(a->Integer.parseInt(a)).collect(Collectors.toList());
		System.out.println(ll);
		
		ll.forEach(b->{
			System.out.println(b+10);
		});
		//
		List<String> sampleList=new ArrayList<>();
		sampleList.add("12");
		sampleList.add("2");
		sampleList.add("5");
		sampleList.add("8");
		List<Integer> integerList=sampleList.stream().map(a->Integer.parseInt(a)).collect(Collectors.toList());
		System.out.println(integerList);
		
		sampleList.forEach(a->{
			int i=Integer.parseInt(a);
			System.out.println(i+10);
		});
		
		String str="Hai i am good";
		char[] ch=str.toCharArray();
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for(char c:ch) {
			if(c!=32) {
				if(map.containsKey(c)) {
					Integer i=map.get(c);
					i++;
					map.put(c, i);
				}else {
					map.put(c, 1);
				}
			}
		}
		System.out.println(map);
		
		for(int i=1;i<=10;i++) {
			
		        if(i%2!=0)
				System.out.print(i+" ");
				
			}
			System.out.println();
		

	}

}
