package com.wipro.arrays;

public class ArrayOps {

    public static void main(String[] args) {
        // Initial array
        int[] array = {1, 3, 35, 32, 2, 4};

        System.out.println("Original Array:");
        printArray(array);

        // Sort the array
        array = sortArray(array);
        System.out.println("Sorted Array:");
        printArray(array);
        
        array = sortArray1(array);
        System.out.println("Sorted Array:");
        printArray(array);

        // Access an element
        int val = accessElement(array, 3);
        System.out.println("Accessed Element at index 3: " + val);

        // Insert an element
        array = insertElement(array, 99, 3);
        System.out.println("Array after insertion:");
        printArray(array);

        // Update an element at the start, end, and a specific position
        array = updateElement(array, 100, 0); // Update start
        array = updateElement(array, 200, array.length - 1); // Update end
        array = updateElement(array, 150, 3); // Update specific position
        System.out.println("Array after updates:");
        printArray(array);

        // Delete an element
        array = deleteElement(array, 3);
        System.out.println("Array after deletion:");
        printArray(array);

        // Reverse the array without swapping
        array = reverseArray(array);
        System.out.println("Reversed Array:");
        printArray(array);

        array = reverseArrayA(array);
        System.out.println("Reversed Array:A");
        printArray(array);
    }

    // Method to sort an array using Bubble Sort
    private static int[] sortArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
    
    private static int[] sortArray1(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if(array[i] > array[j])
				{
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}
    

    // Method to insert an element at a specific index
    private static int[] insertElement(int[] array, int element, int index) {
        if (index < 0 || index > array.length) { // Allow index == array.length for insertion at end
            System.out.println("Array Index Out of Bound");
            return array;
        }

        int[] newArr = new int[array.length + 1];
        for (int i = 0; i < index; i++) {
            newArr[i] = array[i];
        }
        newArr[index] = element;
        for (int i = index; i < array.length; i++) {
            newArr[i + 1] = array[i];
        }
        return newArr;
    }

    // Method to update an element at a specific index
    private static int[] updateElement(int[] array, int element, int index) {
        if (index < 0 || index >= array.length) {
            System.out.println("Array Index Out of Bound");
            return array;
        }
        array[index] = element;
        return array;
    }

    // Method to delete an element at a specific index
    private static int[] deleteElement(int[] array, int index) {
        if (index < 0 || index >= array.length) {
            System.out.println("Array Index Out of Bound");
            return array;
        }

        int[] newArr = new int[array.length - 1];
        for (int i = 0; i < index; i++) {
            newArr[i] = array[i];
        }
        for (int i = index; i < newArr.length; i++) {
            newArr[i] = array[i + 1];
        }
        return newArr;
    }

    // Method to access an element at a specific index
    public static int accessElement(int[] array, int index) {
        if (index < 0 || index >= array.length) {
            System.out.println("Array Index Out of Bound");
            return -1;
        }
        return array[index];
    }

    // Method to reverse an array without swapping
    private static int[] reverseArray(int[] array) {
        int[] reversedArray = new int[array.length];

        // Fill reversedArray with elements from array in reverse order
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }

        return reversedArray;
    }

    // Alternative to reverse an array
    private static int[] reverseArrayA(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            // Swap elements
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            // Move pointers
            start++;
            end--;
        }
        return array;
    }

    // Utility method to print the array
    private static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
