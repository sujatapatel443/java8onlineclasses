package com.india;

public class SeparateNumbers {
    public static void main(String[] args) {
        int[] numbers = {-5, 10, -3, 8, 0, -2, 7, 1, -9};
        //int numbers[]= {1,0,0,1,0,0,1,3,5,0,0,1};

        // Separate negative and non-negative numbers
        int leftIndex = 0;
        int rightIndex = numbers.length - 1;

        while (leftIndex < rightIndex) {
            // Find the first non-negative number from the left
            while (numbers[leftIndex] < 0) {
                leftIndex++;
            }

            // Find the first negative number from the right
            while (numbers[rightIndex] >= 0) {
                rightIndex--;
            }

            // Swap the found numbers
            if (leftIndex < rightIndex) {
                int temp = numbers[leftIndex];
                numbers[leftIndex] = numbers[rightIndex];
                numbers[rightIndex] = temp;
            }
        }

        // Print the arranged array
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}

