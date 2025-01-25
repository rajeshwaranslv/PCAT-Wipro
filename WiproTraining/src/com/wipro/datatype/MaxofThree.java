package com.wipro.datatype;

import java.util.Scanner;

public class MaxofThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        System.out.print("Enter third number: ");
        int c = scanner.nextInt();

        int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("The maximum value is: " + max);
        scanner.close();
    }
}
