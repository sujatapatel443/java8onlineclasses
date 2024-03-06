package com.test;

class Solution {
    public int solution(int[] A, int L, int R) {
        int n = A.length;
        int[] counts = new int[R - L + 1];
        int uniqueCount = 0;
        int left = 0;
        int shortestLength = Integer.MAX_VALUE;

        for (int right = 0; right < n; right++) {
            if (A[right] >= L && A[right] <= R) {
                if (counts[A[right] - L] == 0) {
                    uniqueCount++;
                }
                counts[A[right] - L]++;
            }

            while (uniqueCount == R - L + 1) {
                shortestLength = Math.min(shortestLength, right - left + 1);
                if (A[left] >= L && A[left] <= R) {
                    counts[A[left] - L]--;
                    if (counts[A[left] - L] == 0) {
                        uniqueCount--;
                    }
                }
                left++;
            }
        }

        return shortestLength == Integer.MAX_VALUE ? -1 : shortestLength;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[]{2, 1, 4, 3, 2, 1, 1, 4}, 2, 4)); // Output: 3
        System.out.println(solution.solution(new int[]{1000000000, 1, 1, 1, 1, 1, 999999999}, 999999999, 1000000000)); // Output: 7
        System.out.println(solution.solution(new int[]{1, 3, 5, 7}, 3, 5)); // Output: -1
    }
}

