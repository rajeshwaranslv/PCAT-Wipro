package com.wipro.arrays;

public class Jagged2DClassroom {
    public static void main(String[] args) {
        // Classroom with students studying different numbers of subjects
        int[][] classroom = new int[3][]; // 3 students in the classroom

        // Initialize subjects for each student
        classroom[0] = new int[]{85, 90};       // Student 1 has 2 subjects
        classroom[1] = new int[]{78, 88, 84};  // Student 2 has 3 subjects
        classroom[2] = new int[]{92};          // Student 3 has 1 subject

        // Print marks for each student
        System.out.println("Classroom Marks:");
        for (int i = 0; i < classroom.length; i++) {
            System.out.print("  Student " + (i + 1) + " marks: ");
            for (int j = 0; j < classroom[i].length; j++) {
                System.out.print(classroom[i][j] + " ");
            }
            System.out.println();
        }
    }
}
