package com.wipro.arrays;

public class SchoolMarks {
    
    // display the marks
    public static void displayMarks(int[][][] marks) {
        for (int i = 0; i < marks.length; i++) {
//        	2
        	
            System.out.println("School " + i + ":");
//            0 1
            for (int j = 0; j < marks[i].length; j++) {
            	
                System.out.print("Classroom " + j + ": ");
//                0 1 2
                for (int k = 0; k < marks[i][j].length; k++) {
                	
                    System.out.print(marks[i][j][k] + " ");
//                    0..k
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
 
        int[][][] marks = {
            {
                {75, 85, 90},   // School 0, Classroom 0, Marks of 3 students
                {80, 95},       // School 0, Classroom 1, Marks of 2 students
                {60, 72, 88, 91}  // School 0, Classroom 2, Marks of 4 students
            },
            {
                {70, 88},       // School 1, Classroom 0, Marks of 2 students
                {82, 91, 95, 88}  // School 1, Classroom 1, Marks of 4 students
            }
        };

       
        displayMarks(marks);
        
        System.out.println(marks[1][1][2]);
        System.out.println(marks[1][1][0]);
        System.out.println(marks[0][2][2]);
    }
}
