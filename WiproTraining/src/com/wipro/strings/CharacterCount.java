package com.wipro.strings;

import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Remove spaces and convert to lowercase for uniform counting
        String formatted = input.replaceAll("\\s+", "").toLowerCase();

        // Create an array to store counts of characters (assuming ASCII characters)
        int[] charCounts = new int[256]; 
        // 256 for extended ASCII

        // Count each character using a for loop
        for (int i = 0; i < formatted.length(); i++) {
            char ch = formatted.charAt(i);
            charCounts[ch]++;
        }

        // Print the character counts
        System.out.println("Character counts:");
        for (int i = 0; i < charCounts.length; i++) {
            if (charCounts[i] > 0) {
                System.out.println((char) i + ": " + charCounts[i]);
            }
        }

        scanner.close();
    }
}
