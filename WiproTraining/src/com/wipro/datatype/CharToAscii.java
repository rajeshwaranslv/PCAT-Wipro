package com.wipro.datatype;

import java.util.Scanner;

public class CharToAscii {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        int asciiValue = (int) ch; // Explicit typecasting to int
        System.out.println("The ASCII value of '" + ch + "' is: " + asciiValue);
        scanner.close();
    }
}
