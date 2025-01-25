package com.wipro.arrays;

public class Task4_IsSorted {
    public static boolean isSortedAscending(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false; // Not sorted
            }
        }
        return true; // Sorted in ascending order
    }

    public static void main(String[] args) {
        int[] arr4 = {1, 2, 3, 4, 5};
        System.out.println("Array is sorted in ascending order: " + isSortedAscending(arr4));
    }
}
