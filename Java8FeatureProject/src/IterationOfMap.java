import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class IterationOfMap {

	public static void main(String[] args) {
		
		Map map=new HashMap();
		map.put("Id", "101");
		map.put("Name", "Sujata");
		
		Set set=map.entrySet();
		Iterator it=set.iterator();
		while(it.hasNext()) {
			Map.Entry entry=(Map.Entry)it.next();
			
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		for(Object o:set) {
			Map.Entry m1=(Map.Entry)o;
			System.out.println(m1.getKey()+"\t"+m1.getValue());
		}
		
		Set s=new LinkedHashSet();
			s.add("RAJ");
			s.add("SUJATA");
			s.add("ANUSHA");
			
			Iterator it1=s.iterator();
			while(it1.hasNext()) {
				
				System.out.println(it1.next());
			}
			
	}

}
