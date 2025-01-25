package com.wipro.scanner;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for starting and ending points
        System.out.print("Enter the starting point: ");
        int start = scanner.nextInt();
        System.out.print("Enter the ending point: ");
        int end = scanner.nextInt();

        // Validate input
        if (start > end) {
            System.out.println("Starting point should be less than or equal to the ending point.");
        } else {
            // Generate the multiplication table
            for (int i = start; i <= end; i++) {
                System.out.println("\nMultiplication table for " + i + ":");
                for (int j = 1; j <= 10; j++) { // Multiplying numbers from 1 to 10
                    System.out.println(i + " x " + j + " = " + (i * j));
                }
            }
        }

        scanner.close();
    }
}
