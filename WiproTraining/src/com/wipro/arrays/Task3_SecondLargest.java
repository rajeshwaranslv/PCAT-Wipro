package com.wipro.arrays;

public class Task3_SecondLargest {
    public static int secondLargest(int[] array) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } 
            
            else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr3 = {1, 3, 5, 7, 4};
        System.out.println("Second largest element: " + secondLargest(arr3));
    }
}
