package com.wipro.scanner;


import java.util.Scanner;

public class ATMPINValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int correctPIN = 1234;
        int attempts = 0;
        int enteredPIN;

        do {
            System.out.print("Enter your PIN: ");
            enteredPIN = scanner.nextInt();
            attempts++;

            if (enteredPIN == correctPIN) {
                System.out.println("PIN accepted. Access granted.");
                break;
            } else {
                System.out.println("Incorrect PIN. Try again.");
            }
        } while (attempts < 3);

        if (enteredPIN != correctPIN) {
            System.out.println("Sorry, you've used all 3 attempts.");
        }
        scanner.close();
    }
}
