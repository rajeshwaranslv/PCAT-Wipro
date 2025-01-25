package com.wipro.datatype;

public class MathFunctions {

    // Method to calculate factorial of a number
    public static int factorial(int n) {
        if (n == 0) {
            return 1; //  factorial of 0 is 1
        }
        
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i; // Multiply result by each integer from 1 to n
        }
        
        return result;
    }

    // Method to calculate the nth Fibonacci number
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0; // Fibonacci of 0 is 0
        } else if (n == 1) {
            return 1; // Fibonacci of 1 is 1
        }
        
        int prev = 0, curr = 1;
        for (int i = 2; i <= n; i++) {
            int temp = curr;
            curr = curr + prev;
            prev = temp;
        }
        
        return curr;
    }

    public static void main(String[] args) {
        int factorialNumber = 5; //   for factorial
        int fibonacciNumber = 6; //   for Fibonacci
        
        System.out.println("Factorial of " + factorialNumber + " is: " + factorial(factorialNumber));
        System.out.println("Fibonacci number at position " + fibonacciNumber + " is: " + fibonacci(fibonacciNumber));
    }
}
