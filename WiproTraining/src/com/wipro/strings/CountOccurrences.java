package com.wipro.strings;

public class CountOccurrences {
    public static void main(String[] args) {
        String input = "programming"; // Input string
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i); // Get the character at index i
            int count = 0; // Variable to count the occurrences of ch
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == ch) { // If characters match, increment count
                    count++;
                }
            }
            if (count > 0) { // If the character appeared
                System.out.println(ch + ": " + count); // Print the character and its count
                input = input.replace(String.valueOf(ch), ""); // Remove the character from input
            }
        }
    }
}
