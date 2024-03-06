
public class OverLoadMethod {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("Today");

		StringBuffer sb2 = new StringBuffer("Today");

		System.out.println(sb1.equals(sb2));
		
		sum(3l,5);

	}

	static void sum(int a, long b) {
		System.out.println("sum() method of a is invoked");

	}

	static void sum(long b, int a) {
		System.out.println("sum() method of b is invoked");
	}

}
