import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int a[]= {5,9,7,13,3,6,12};
		
		Integer arr[]= {5,9,7,13,3,6,12};
		
		
		checkNumber(a);
		System.out.println();
		for (int i = 2; i < 100; i++) {
			int chk = 0;
			for (int j = 2; j < i; j++) {
				if ((i % j) == 0) {
					chk++;
					break;
				}
			}

			if (chk == 0) {
				System.out.print(i + " ");
			}
		}
	}
	
static void checkNumber(int n[]) {
		
		for (int i = 0; i < n.length; i++) {
			int chk = 0;
			for (int j = 2; j < n[i]; j++) {        // 5,7,9,12,3
				if ((n[i] % j) == 0) {
					chk++;
					break;
				}
			}

			if (chk == 0) {
				System.out.print(n[i] + " ");
			}
		}
	}
}
