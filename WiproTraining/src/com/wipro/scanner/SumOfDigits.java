package com.wipro.scanner;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int sum = 0;
        
        // Using while loop to calculate sum of digits
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        
        System.out.println("The sum of digits is: " + sum);
        scanner.close();
    }
}
