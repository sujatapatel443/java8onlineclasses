
public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Take the first string as a reference
        String prefix = strs[0];

        // Iterate through the rest of the strings
        for (int i = 1; i < strs.length; i++) { // raj rmj
            int j = 0;
            while (j < prefix.length() && j < strs[i].length() && prefix.charAt(j) == strs[i].charAt(j)) {
                j++;
            }

            // Update the prefix to the common substring
            prefix = prefix.substring(0, j);

            // If the prefix becomes empty, no common prefix exists
            if (prefix.isEmpty()) {
                break;
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        String[] example1 = {"flower", "flow", "flight"};
        String result1 = longestCommonPrefix(example1);
        System.out.println("Example 1: " + result1); // Output: "fl"

        String[] example2 = {"dog", "racecar", "car"};
        String result2 = longestCommonPrefix(example2);
        System.out.println("Example 2: " + result2); // Output: ""
    }
}

