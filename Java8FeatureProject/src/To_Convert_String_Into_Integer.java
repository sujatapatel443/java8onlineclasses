import java.util.List;
import java.util.ArrayList;

public class To_Convert_String_Into_Integer {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("10");
		list.add("5");
		list.forEach(a -> {
			System.out.print(a + 10 + " ");
		});
		System.out.println();

		// to convert String into Integer

		list.forEach(a -> {
			int i = Integer.parseInt(a);
			System.out.print(i + 10 + " ");

		});
		System.out.println();

		// to convert into String Integer

		list.forEach(b -> {
			String s = String.valueOf(b);
			System.out.print(s + 10 + " ");
		});

	}
}
