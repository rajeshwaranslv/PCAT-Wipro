package com.wipro.datatype;

import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        // Average as integer
        int intAverage = (num1 + num2 + num3) / 3;
        System.out.println("Average as int: " + intAverage);

        // Average as double
        double doubleAverage = (num1 + num2 + num3) / 3.0;
        System.out.printf("Average as double: %.4f%n", doubleAverage);
        scanner.close();
    }
}
