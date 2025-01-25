package com.wipro.arrays;

import java.util.Scanner;

public class ThreeDArrayExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the dimensions of the 3D array
        System.out.print("Enter number of semesters: ");
        int semesters = scanner.nextInt();

        System.out.print("Enter number of students per semester: ");
        int studentsCount = scanner.nextInt();

        System.out.print("Enter number of subjects per student: ");
        int subjectsCount = scanner.nextInt();

        // Initialize the 3D array dynamically
        int[][][] marks = new int[semesters][studentsCount][subjectsCount];
        
        System.out.println(marks.getClass().getName());
        String[] students = new String[studentsCount];
        String[] subjects = new String[subjectsCount];

        // Input student names
        System.out.println("Enter the names of students:");
        for (int i = 0; i < studentsCount; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            students[i] = scanner.next();
        }

        // Input subject names
        System.out.println("Enter the names of subjects:");
        for (int i = 0; i < subjectsCount; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            subjects[i] = scanner.next();
        }

        // Input marks for each semester, student, and subject
        for (int semester = 0; semester < semesters; semester++) {
            System.out.println("Enter marks for Semester " + (semester + 1) + ":");
            for (int student = 0; student < studentsCount; student++) {
                System.out.println("  Marks for " + students[student] + ":");
                for (int subject = 0; subject < subjectsCount; subject++) {
                    System.out.print("    " + subjects[subject] + ": ");
                    marks[semester][student][subject] = scanner.nextInt();
                }
            }
        }

        // Display the marks
        for (int semester = 0; semester < marks.length; semester++) {
            System.out.println("Semester " + (semester + 1) + " Marks:");
            for (int student = 0; student < marks[semester].length; student++) {
                System.out.println("  " + students[student] + ":");
                for (int subject = 0; subject < marks[semester][student].length; subject++) {
                    System.out.println("    " + subjects[subject] + ": " + marks[semester][student][subject]);
                }
            }
        }

        scanner.close();
    }
}
