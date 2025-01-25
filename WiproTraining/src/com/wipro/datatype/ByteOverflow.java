package com.wipro.datatype;

public class ByteOverflow {
    public static void main(String[] args) {
        byte b = 127; // Maximum value of byte
        System.out.println("Original value: " + b);
        b++; // Causes overflow
        System.out.println("Value after overflow: " + b); // Wraps around to -128
    }
}
