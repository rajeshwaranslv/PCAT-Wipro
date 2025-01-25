package com.wipro.arrays;

public class Task1_DeleteElement {
    public static int[] deleteElement(int[] array, int index) {
        if (index < 0 || index >= array.length) {
            System.out.println("Index out of bounds.");
            return array;
        }
        int[] newArray = new int[array.length - 1];
        
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != index) {
                newArray[j++] = array[i];
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        arr1 = deleteElement(arr1, 3);
        System.out.print("Array after deletion: ");
        for (int num : arr1) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
