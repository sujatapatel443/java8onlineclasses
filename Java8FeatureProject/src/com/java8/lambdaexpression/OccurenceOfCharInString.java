package com.java8.lambdaexpression;
import java.util.HashMap;
import java.util.Map;

public class OccurenceOfCharInString {

	public static void main(String[] args) {
		
		String str="Sujata Patel is writing";
		
		char ch[]=str.toCharArray();
		
		Map<Character, Integer> m=new HashMap<>();
		for(char c :ch) {
			
			if(c!= 32) {
				
				if(m.containsKey(c)){
					Integer count=m.get(c);
					count++;
					m.put(c, count);
				}else {
					m.put(c, 1);
				}
			}
			
		}
		System.out.println(m);
		
		String s[]=str.split(" ");
		
		Map<String, Integer> m1=new HashMap<>();
		for(String s1 : s) {
			if(m1.containsKey(s1)){
				Integer count=m1.get(s1);
				count++;
				m1.put(s1, count);
			}else {
				m1.put(s1, 1);
			}
		} 
		System.out.println(m1);
		
		
		
		
	}

}
