package com.wipro.strings;

public class ReverseString {
    public static void main(String[] args) {
        String original = "Madam";
        String reversed = "";
        
        // Loop through the original string from the end to the beginning
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }
        
        // Printing the reversed string
        System.out.println("Reversed string: " + reversed);
        
   
    }
}
