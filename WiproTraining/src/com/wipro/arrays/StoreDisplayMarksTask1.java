package com.wipro.arrays;

//Task 1: Program to store and display the marks of 5 students

import java.util.Scanner;

public class StoreDisplayMarksTask1 {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     // Array to store marks of 5 students
     int[] studentMarks = new int[5];

     // Input marks for 5 students
     for (int i = 0; i < 5; i++) {
         System.out.print("Enter marks for Student " + (i + 1) + ": ");
         studentMarks[i] = scanner.nextInt();
     }

     // Display marks for 5 students
     System.out.println("\nMarks of Students:");
     for (int i = 0; i < 5; i++) {
         System.out.println("Student " + (i + 1) + ": " + studentMarks[i]);
     }

     scanner.close();
 }
}
