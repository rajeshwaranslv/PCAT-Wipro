package com.wipro.arrays;

import java.util.Scanner;

//Task 2: Program to store and display the marks of 5 students present in 3 classrooms

public class StoreDisplayMarksTask2 {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     // 2D array to store marks of 5 students in 3 classrooms
     double[][] classroomMarks = new double[3][5];

     // Input marks for each classroom
     for (int i = 0; i < 3; i++) {
         System.out.println("Enter marks for Classroom " + (i + 1) + ":");
         for (int j = 0; j < 5; j++) {
             System.out.print("Enter marks for Student " + (j + 1) + ": ");
             classroomMarks[i][j] = scanner.nextDouble();
         }
     }

     // Display marks for each classroom
     System.out.println("\nMarks of Students in Each Classroom:");
     for (int i = 0; i < 3; i++) {
         System.out.println("Classroom " + (i + 1) + ":");
         for (int j = 0; j < 5; j++) {
             System.out.println("Student " + (j + 1) + ": " + classroomMarks[i][j]);
         }
     }

     scanner.close();
 }
}
