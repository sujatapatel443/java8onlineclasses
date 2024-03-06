import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Distinct_Element_Form_List {

	public static void main(String[] args) {
String str1 = "this this is is done by Altimetrik Altimetrik";
		
		String[] st=str1.split(" ");
		Set<String> ss=Arrays.asList(st).stream().distinct().collect(Collectors.toSet());
		System.out.println(ss);
		
		Set<String> s1=Arrays.asList(st).stream().collect(Collectors.toSet());
		System.out.println(s1);
		System.out.println("%%%%%%%%%%%%%%");
		Map<String,Integer> map=new HashMap<String,Integer>();
		
		for(String s:st) {
			
			if(map.containsKey(s)) {
				int i=map.get(s);
				i++;
				map.put(s, i);
				
			}else {
				map.put(s, 1);
			}
			
		}
		
		System.out.println(map);

	}

}
