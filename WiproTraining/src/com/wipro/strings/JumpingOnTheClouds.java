package com.wipro.strings;

import java.util.Scanner ;

public class JumpingOnTheClouds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read number of clouds
        int n = scanner.nextInt();
        int[] clouds = new int[n];

        // Read the cloud array
        
        for (int i:clouds) {
            clouds[i] = scanner.nextInt();
        }

        System.out.println(minimumJumps(clouds));
        scanner.close();
    }

    public static int minimumJumps(int[] clouds) {
        int jumps = 0;
        int position = 0;

        while (position < clouds.length - 1) {
            // Prefer a double jump if it's within bounds and safe
            if (position + 2 < clouds.length && clouds[position + 2] == 0) {
                position += 2;
            } else {
                position += 1; // Otherwise, take a single jump
            }
            jumps++;
        }

        return jumps;
    }
}
