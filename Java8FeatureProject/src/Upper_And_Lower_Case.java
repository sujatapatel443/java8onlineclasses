
public class Upper_And_Lower_Case {

	public static void main(String[] args) {

		String str = "AndfRaj";
		char ch[] = str.toCharArray();
		for (char c : ch) {
			if (Character.isUpperCase(c)) {
				System.out.println("Converting as a Lower case :" + Character.toLowerCase(c));
			} else {
				System.out.println("Converting as a Uper case :" + Character.toUpperCase(c));
			}
		}
		
		String st="Hi I am doing my work";
		char[] c=st.toCharArray();
		
		for(char cha:c) {
			if(Character.isUpperCase(cha)) {
				System.out.print(Character.toLowerCase(cha)+" ");
			}else {
				System.out.print(Character.toUpperCase(cha)+" ");
			}
		}
	
	}
}
