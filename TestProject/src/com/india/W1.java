package com.india;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class W1 {
	
	public static void main(String[] args) {
		
		Map<String,Integer> m=new HashMap<String,Integer>();
		m.put("RAJ", 101);
		m.put("SRINI", 102);
		m.put("TAJ", 103);
		
		/*m.entrySet().stream().forEach(e->{
			Map.Entry map=(Map.Entry)e;
			System.out.println(map.getKey()+"\t"+map.getValue());
		});
*/	
			Iterator it=m.entrySet().iterator();
			while(it.hasNext()) {
				Map.Entry map=(Map.Entry)it.next();
				if(map.getKey().equals("RAJ")) {
					it.remove();
				}
			}
			System.out.println(m);
			
	}

}

