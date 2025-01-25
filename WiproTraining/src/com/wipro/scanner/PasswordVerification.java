package com.wipro.scanner;

import java.util.Scanner;

public class PasswordVerification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define the correct password
        String correctPassword = "pass";
        int attempts = 3; // Maximum number of attempts allowed

        // Loop for password verification
        while (attempts > 0) {
            // Get the user's password input
            System.out.print("Enter your password: ");
            String userInput = scanner.nextLine();

            // Verify the password
            if (userInput.equals(correctPassword)) {
                System.out.println("Password verified successfully.");
                break; // Exit the loop if the password is correct
            } else {
                attempts--;
                if (attempts > 0) {
                    System.out.println("Incorrect password. " + attempts + " attempt(s) remaining.");
                } else {
                    System.out.println("Access denied. You have exceeded the number of attempts.");
                }
            }
        }

        scanner.close();
    }
}
