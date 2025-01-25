package com.wipro.arrays;

public class Task2_LinearSearch {
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Found at index
            }
        }
        return -1; // Not found
    }

    public static void main(String[] args) {
        int[] arr2 = {1, 2, 3, 4, 5};
        int target = 3;
        int index = linearSearch(arr2, target);
        System.out.println("Linear Search result for " + target + ": " + (index != -1 ? "Found at index " + index : "Not Found"));
    }
}
