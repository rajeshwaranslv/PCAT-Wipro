package com.wipro.datatype;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        float radius = scanner.nextFloat();
        double area = Math.PI * radius * radius;
        System.out.printf("Area of the circle: %.2f%n", area);
        scanner.close();
    }
}
