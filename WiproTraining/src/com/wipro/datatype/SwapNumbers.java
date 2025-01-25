package com.wipro.datatype;
import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number (a): ");
        int a = scanner.nextInt();
        System.out.print("Enter second number (b): ");
        int b = scanner.nextInt();

        a = a + b;
//        30
        b = a - b;
//        10
        a = a - b;
//        20 10

        System.out.println("After swapping: a = " + a + ", b = " + b);
        scanner.close();
    }
}

