package com.wipro.arrays;

import java.util.Arrays;

public class ArrayUtilsExample {
    public static void main(String[] args) {
        int[] numbers = {5, 1, 3, 4, 2};

        // Sort the array
        Arrays.sort(numbers);
        System.out.println("Sorted: " + Arrays.toString(numbers));

        // Search for an element
        int index = Arrays.binarySearch(numbers, 3);
        System.out.println("Index of 3: " + index);

        // Copy a range
        int[] subArray = Arrays.copyOfRange(numbers, 1, 4);
        System.out.println("Subarray: " + Arrays.toString(subArray));

        // Check equality
        int[] anotherArray = {1, 2, 3, 4, 5};
        System.out.println("Arrays equal: " + Arrays.equals(numbers, anotherArray));
    }
}
