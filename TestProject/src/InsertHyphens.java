import java.util.*;

public class InsertHyphens {

	public static void main(String[] args) {
		String str = "rajpatelvaranasiindia"; //ra-jpa-telv-arana-siindi-a
		System.out.println(str.length());
		List<Integer> l=new ArrayList<Integer>();
		if(str.length()>2) {
			l.add(2);
		}
		
		int count=l.get(0);
		int index=0;
		while(count + l.get(index) < str.length()) {
			count =count +1;
			int val =count + l.get(index);
			l.add(val);
			index++;
		}
		
		System.out.println(l);
		
		
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<str.length();i++) {
			
			if(l.contains(i)) {
				sb.append("-");
				sb.append(str.charAt(i));
			}else {
				sb.append(str.charAt(i));
			}
			
		}
		System.out.println(sb.toString());

	}

}
