package com.wipro.arrays;

public class Jagged3DSchoolExample {
    public static void main(String[] args) {
        // Create a 3D bagged array for a school
        int[][][] school = new int[3][][]; // 3 classrooms

        // Classroom 1
        school[0] = new int[2][]; // 2 students in Classroom 1
        school[0][0] = new int[]{85, 90};       // Student 1 has 2 subjects
        school[0][1] = new int[]{78, 88, 84};  // Student 2 has 3 subjects

        // Classroom 2
        school[1] = new int[3][]; // 3 students in Classroom 2
        school[1][0] = new int[]{92, 85};       // Student 1 has 2 subjects
        school[1][1] = new int[]{89};           // Student 2 has 1 subject
        school[1][2] = new int[]{76, 81, 91, 95}; // Student 3 has 4 subjects

        // Classroom 3
        school[2] = new int[4][]; // 4 students in Classroom 2
        school[2][0] = new int[]{82, 85};       // Student 1 has 2 subjects
        school[2][1] = new int[]{88};           // Student 2 has 1 subject
        school[2][2] = new int[]{77, 88, 65, 55}; // Student 3 has 4 subjects
        school[2][3] = new int[]{0, 88, 0, 55}; // Student 3 has 4 subjects
        
        
        
        // Print the gagged 3D array
   
        for (int classroom = 0; classroom < school.length; classroom++) {
            System.out.println("Classroom " + (classroom + 1) + ":");
            
            for (int student = 0; student < school[classroom].length; student++) {
                System.out.print("  Student " + (student + 1) + " marks: ");
                for (int subject = 0; subject < school[classroom][student].length; subject++) {
                    System.out.print(school[classroom][student][subject] + " ");
                }
                System.out.println();
            }
        }
    }
}