package com.wipro.scanner;

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generate a random number between 1 and 100
        int randomNumber = random.nextInt(100) + 1;
        int attempts = 0;
        int userGuess;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100. Can you guess what it is?");

        do {
            System.out.print("Enter your guess: ");
            while (!scanner.hasNextInt()) { // Validate input
                System.out.println("Please enter a valid number.");
                scanner.next(); // Clear invalid input
                System.out.print("Enter your guess: ");
            }

            userGuess = scanner.nextInt();
            attempts++;

            if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number " + randomNumber + " in " + attempts + " attempts.");
            }
        } while (userGuess != randomNumber);

        scanner.close();
    }
}
