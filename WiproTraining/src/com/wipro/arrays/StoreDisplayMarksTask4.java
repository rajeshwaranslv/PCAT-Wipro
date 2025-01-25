package com.wipro.arrays;

import java.util.Scanner;

//Task 4: Program to store and display the marks of students based on specific classroom structures

public class StoreDisplayMarksTask4 {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     // Structure: School 0 (3 classrooms with 3, 2, 4 students), School 1 (2 classrooms with 2, 4 students)
     int[][] studentCounts = {
         {3, 2, 4}, // School 0
         {2, 4},     // School 1
 
     };

     // Array to store marks dynamically based on structure
     int[][][] schoolMarks = new int[2][][];

     // Initialize the array structure
     for (int school = 0; school < studentCounts.length; school++) {
         schoolMarks[school] = new int[studentCounts[school].length][];
         
         for (int classroom = 0; classroom < studentCounts[school].length; classroom++) {
        	 
             schoolMarks[school][classroom] = new int[studentCounts[school][classroom]];
         }
     }

     // Input marks for each school
     for (int school = 0; school < schoolMarks.length; school++) {
    	 
         System.out.println("Enter marks for School " + (school + 1) + ":");
         
         for (int classroom = 0; classroom < schoolMarks[school].length; classroom++) {
        	 
             System.out.println("  Classroom " + (classroom + 1) + ":");
             
             for (int student = 0; student < schoolMarks[school][classroom].length; student++) {
            	 
                 System.out.print("    Enter marks for Student " + (student + 1) + ": ");
                 
                 schoolMarks[school][classroom][student] = scanner.nextInt();
             }
         }
     }

     // Display marks for each school
     System.out.println("\nMarks of Students in Each School:");
     for (int school = 0; school < schoolMarks.length; school++) {
         System.out.println("School " + (school + 1) + ":");
         
         for (int classroom = 0; classroom < schoolMarks[school].length; classroom++) {
             System.out.println("  Classroom " + (classroom + 1) + ":");
             
             for (int student = 0; student < schoolMarks[school][classroom].length; student++) {
                 System.out.println("    Student " + (student + 1) + ": " + schoolMarks[school][classroom][student]);
                 
             }
         }
     }

     scanner.close();
 }
}
