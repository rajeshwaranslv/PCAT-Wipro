package com.wipro.strings;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String original = scanner.nextLine();

        // Remove spaces and convert to lowercase for uniform comparison
        String formatted = original.replaceAll("\\s+", "").toLowerCase();

        // Check if the string is a palindrome
        boolean isPalindrome = true;
        int length = formatted.length();

        // Use a for loop to compare characters
        for (int i = 0; i < length / 2; i++) {
            if (formatted.charAt(i) != formatted.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Print the result
        if (isPalindrome) {
            System.out.println("\"" + original + "\" is a palindrome.");
        } else {
            System.out.println("\"" + original + "\" is not a palindrome.");
        }

        scanner.close();
    }
}
