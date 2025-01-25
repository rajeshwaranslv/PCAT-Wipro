package com.wipro.arrays;

import java.util.Scanner;

//Task 3: Program to store and display the marks of students present in 2 schools, each with 3 classrooms, each classroom with 5 students

public class StoreDisplayMarksTask3 {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     // 3D array to store marks: 2 schools, 3 classrooms per school, 5 students per classroom
     double[][][] schoolMarks = new double[2][3][5];

     // Input marks for each school
     for (int school = 0; school < 2; school++) {
         System.out.println("Enter marks for School " + (school + 1) + ":");
         for (int classroom = 0; classroom < 3; classroom++) {
             System.out.println("  Classroom " + (classroom + 1) + ":");
             for (int student = 0; student < 5; student++) {
                 System.out.print("    Enter marks for Student " + (student + 1) + ": ");
                 schoolMarks[school][classroom][student] = scanner.nextDouble();
             }
         }
     }

     // Display marks for each school
     System.out.println("\nMarks of Students in Each School:");
     for (int school = 0; school < 2; school++) {
         System.out.println("School " + (school + 1) + ":");
         for (int classroom = 0; classroom < 3; classroom++) {
             System.out.println("  Classroom " + (classroom + 1) + ":");
             for (int student = 0; student < 5; student++) {
                 System.out.println("    Student " + (student + 1) + ": " + schoolMarks[school][classroom][student]);
             }
         }
     }

     scanner.close();
 }
}
