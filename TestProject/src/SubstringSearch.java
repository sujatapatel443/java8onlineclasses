public class SubstringSearch {
    public static void main(String[] args) {
        String st1 = "abcdefgh";
        String st2 = "cdef";

        boolean isSubstring = isSubstring(st1, st2);
        
        if (isSubstring) {
            System.out.println(st2 + " is a substring of " + st1);
        } else {
            System.out.println(st2 + " is not a substring of " + st1);
        }
    }

    public static boolean isSubstring(String st1, String st2) {
        int n = st1.length();
        int m = st2.length();

        // Iterate through st1
        for (int i = 0; i <= n - m; i++) {
            int j;

            // Check if st2 matches with a substring of st1 starting at index i
            for (j = 0; j < m; j++) {
                if (st1.charAt(i + j) != st2.charAt(j)) {
                    break;
                }
            }

            // If st2 is present at current index of st1
            if (j == m) {
                return true;
            }
        }
        // If st2 is not present in st1
        return false;
    }
}
