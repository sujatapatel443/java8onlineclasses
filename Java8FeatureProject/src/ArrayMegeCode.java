import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class ArrayMegeCode {
	public static void main(String[] args) {
		int a1[]= {2,7,5,7,9};
		int a2[]= {1,0,6};
		
		int lengthFinal=a1.length+a2.length;
		int a3[]=new int[lengthFinal];
		for(int i=0;i<a1.length;i++) {
			a3[i]=a1[i];
		}
		int m=a1.length;
		
		for(int i=0;i<a2.length;i++) {
			a3[m]=a2[i];
			m++;
		}
		
		for(int i=0; i<a3.length;i++) {
			System.out.print(a3[i]+" ");
		}
		
		String s="epamexcellenceprogram";
		char ch[]=s.toCharArray();
		Map<Character, Integer> mm=new LinkedHashMap<Character, Integer>();
		for(char c : ch) {
			if(mm.containsKey(c)) {
				int value=mm.get(c);
				value++;
				mm.put(c, value);
			}else {
				mm.put(c, 1);
			}
		}
		System.out.println();
		System.out.println(mm);
		Set ss=mm.entrySet();
		Iterator i=ss.iterator();
		
		while(i.hasNext()) {
			Map.Entry e=(Map.Entry)i.next();
			if((int)e.getValue()==1) {
				System.out.println(e.getKey());
				break;
			}
		}
		
		
	}

}
