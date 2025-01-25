package com.wipro.arrays;

import java.util.Scanner;

public class TwoDArrayExample {
    public static void main(String[] args) {
        // 2D array for marks (rows: students, columns: subjects)
        int[][] marks = {
            {85, 90, 80}, // Marks for Alice
            {78, 88, 84}, // Marks for Bob
            {92, 91, 89}  // Marks for Charlie
        };
        
        System.out.println(marks.getClass().getName());

        // Print marks of each student
        String[] students = {"Alice", "Bob", "Charlie"};
        String[] subjects = {"Math", "Science", "English"};

        for (int i = 0; i < marks.length; i++) {
        	
            System.out.println(students[i] + "'s Marks:");
            
            for (int j = 0; j < marks[i].length; j++) {
            	
                System.out.println("  " + subjects[j] + ": " + marks[i][j]);
            }
        }
        
        int [][] marksA=new int[3][5];
        Scanner s=new Scanner(System.in);
        
  for (int i = 0; i < marksA.length; i++) {
        	
            System.out.println(students[i] + "'s Marks:");
            
            for (int j = 0; j < marksA[i].length; j++) {
            	  System.out.println(" Enter the marks of student "+(i+1) +"in classroom"+(j+1));
            	marksA[i][j]=s.nextInt();

            }
        }
  
  for (int i = 0; i < marksA.length; i++) {
  	
      System.out.println(students[i] + "'s Marks:");
      
      for (int j = 0; j < marksA[i].length; j++) {
      	  System.out.println(marksA[i][j]);
  
      }
  }
  s.close();
        
        
        
        
        
    }
}
