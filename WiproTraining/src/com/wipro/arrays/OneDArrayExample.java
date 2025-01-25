package com.wipro.arrays;

import java.util.Scanner;

public class OneDArrayExample {
    public static void main(String[] args) {
        // 1D array for student names
        String[] students = {"Alice", "Bob", "Charlie"};

        // Print the names of students
        System.out.println("Students:");
        for (String student : students) {
            System.out.println(student);
        }
        int []marks=new int[5];
        Scanner s=new Scanner(System.in);
        
         for(int i=0;i<marks.length;i++) {
        	 System.out.println("Enter the marks of students"+(i+1));
        	 marks[i]=s.nextInt();
         }
         for(int i=0;i<marks.length;i++) {
        	 System.out.println(marks[i]);
        	 
         }
        
        
        s.close();
        
        
    }
}
