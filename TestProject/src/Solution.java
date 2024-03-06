
public class Solution {
	public  int solution(String S) {
		int count = 0;
        char firstChar = S.charAt(0);
        int consecutiveCount = 1;

        // Count consecutive occurrences of the first character
        for (int i = 1; i < S.length(); i++) {
            if (S.charAt(i) == firstChar) {
                consecutiveCount++;
            } else {
                count += consecutiveCount;
                consecutiveCount = 1;
            }
        }

        // If the last character is the same as the first one
        count += consecutiveCount;

        return count;
    }
    public static void main(String[] args) {
    	Solution solution = new Solution();
    	System.out.println(solution.solution("aaaa"));  // Output: 4
        System.out.println(solution.solution("abab")); // Output: 3
        System.out.println(solution.solution("abbaa"));  // Output: 4
        System.out.println(solution.solution("abab"));  // Output: 0
	}
}