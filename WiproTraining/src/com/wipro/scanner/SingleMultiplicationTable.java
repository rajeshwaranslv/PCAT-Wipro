package com.wipro.scanner;

import java.util.Scanner;

public class SingleMultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for the number and range
        System.out.print("Enter the number for multiplication: ");
        int number = scanner.nextInt();
        System.out.print("Enter the range for multiplication: ");
        int range = scanner.nextInt();

        // Generate the multiplication table
        System.out.println("\nMultiplication table for " + number + ":");
        for (int i = 1; i <= range; i++) { // Looping from 1 to the specified range
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        scanner.close();
    }
}
