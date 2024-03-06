import java.util.Arrays;

public class Missing_Number_Program {

	public static void main(String[] args) {
		int a[] = { 1, 2, 4, 6, 3, 5, 8 }; // 1 2 3 4 5 6 , 8
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			if (a[i] != i + 1) {
				System.out.println("This number is missed :" + (a[i] - 1));
				break;
			}

		}

	}

}
