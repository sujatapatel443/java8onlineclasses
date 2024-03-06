
public class InsertHyphens {
	public static void main(String[] args) {
        String input = "rajpatelvaranasiindia"; //ra-jpa-telv-arana-siindi-a
        String output = hyphenateString(input);
        System.out.println(output);
    }

    private static String hyphenateString(String input) {
        return input.replaceAll("(.{2})", "$1-");
    }
}
