import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Occurence_Of_String_From_List {

	public static void main(String[] args) {
		List<String> l1=new ArrayList<String>();
		l1.add("Sujata");
		l1.add("Raj");
		l1.add("AnushaPatel");
		l1.add("Seema");
		
		Map<String,Integer> m=new LinkedHashMap<String,Integer>();
		
		for(String s:l1) {
			if(m.containsKey(s)) {
				int i=m.get(s);
				i++;
				m.put(s,i);
			}else {
				m.put(s, 1);
			}
		}
		
		System.out.println(m);
		
		String str="SujataPatelaraee";
		char[] ch=str.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			int count=0;
			for(int j=0;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count++;
				}
			}
			System.out.println("Occurence of "+ch[i]+" is ->"+count);
		}
	}

}
