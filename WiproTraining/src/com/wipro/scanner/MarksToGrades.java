package com.wipro.scanner;

import java.util.Scanner;

public class MarksToGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks from the user
        System.out.print("Enter your marks (0-100): ");
        int marks = scanner.nextInt();
        int range =marks / 10;

        String grade;

        // Determine grade using switch case
        switch (range) { // Dividing marks by 10 to categorize
            case 10: // Fallthrough to case 9 as 100/10 is 10
            case 9:
                grade = "A+";
                break;
            case 8:
                grade = "A";
                break;
            case 7:
                grade = "B";
                break;
            case 6:
                grade = "C";
                break;
            case 5:
                grade = "D";
                break;
            default:
                grade = (marks >=0 && marks < 50) ? "Fail" : "Invalid Marks";
                break;
        }

        // Output the grade
        System.out.println("Your grade is: " + grade);
        scanner.close();
    }
}
