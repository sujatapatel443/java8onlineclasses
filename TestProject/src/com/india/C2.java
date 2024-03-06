package com.india;

public class C2 {

	public static void main(String[] args) {
		String str[]= {"amazon","amazed","amaze","amazing", "amazes"};
		
		/*
		 mazon”, “amazed”, “amaze”, “amazing”, “amazes”]
		 */
		
		String prefix=str[0];
		
		for(int i=1;i<str.length;i++) {
			int j=0;
			while((j<prefix.length()&& j<str[i].length()) && prefix.charAt(j)==str[i].charAt(j)) {
				j++;
			}
			
			prefix=prefix.substring(0,j);
		}
		System.out.println(prefix);

	}

}
