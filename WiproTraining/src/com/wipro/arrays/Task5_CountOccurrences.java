package com.wipro.arrays;

public class Task5_CountOccurrences {
    public static int countOccurrences(int[] array, int target) {
        int count = 0;
        for (int num : array) {
            if (num == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr5 = {1, 2, 3, 2, 5, 2, 4};
        int target = 2;
        int count = countOccurrences(arr5, target);
        System.out.println("Occurrences of 2: " + count);
    }
}
