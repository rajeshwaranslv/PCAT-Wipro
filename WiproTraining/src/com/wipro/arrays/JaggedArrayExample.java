package com.wipro.arrays;

public class JaggedArrayExample {
    public static void main(String[] args) {
        // Jagged 2D array for marks
        int[][] marks = new int[3][];
        marks[0] = new int[]{85, 90};       // Alice has 2 subjects
        marks[1] = new int[]{78, 88, 84};  // Bob has 3 subjects
        marks[2] = new int[]{92};          // Charlie has 1 subject

        String[] students = {"Alice", "Bob", "Charlie"};

        // Print marks for each student
        for (int i = 0; i < marks.length; i++) {
            System.out.println(students[i] + "'s Marks:");
            for (int j = 0; j < marks[i].length; j++) {
                System.out.println("  Subject " + (j + 1) + ": " + marks[i][j]);
            }
        }
    }
}
