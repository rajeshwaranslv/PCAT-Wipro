package com.wipro.arrays;

public class Task6_MergeArrays {
    public static int[] mergeArrays(int[] array1, int[] array2) {
//    	Join the two lengths
        int[] mergedArray = new int[array1.length + array2.length];
        int i = 0;
        for (int num : array1) {
            mergedArray[i++] = num;
        }
        for (int num : array2) {
            mergedArray[i++] = num;
        }
        return mergedArray;
    }

    public static void main(String[] args) {
        int[] arr6 = {1, 3, 5};
        int[] arr7 = {2, 4, 6};
        int[] merged = mergeArrays(arr6, arr7);
        System.out.print("Merged Array: ");
        for (int num : merged) {
            System.out.print(num + " ");
        }
    }
}
