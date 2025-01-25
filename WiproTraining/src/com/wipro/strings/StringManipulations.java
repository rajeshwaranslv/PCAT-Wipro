package com.wipro.strings;

public class StringManipulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		StringBuilder - No Thread safe
/*Faster due to synchronizations
 * Used in Single thread app where performance is critical
 * Mutable
 * Java 5
 * */	
		
		
//		StringBuffer - Thread safe
/*Slower due to synchronization
 * Mutable
 * Used in multi-threaded app where thread safety
 * Java 1.0
 *
 * 
 * Start and endwith
 * Concat
 * */	
		
		String str="Java Programming";
		System.out.println("Original String "+str);
		
		String upperCase=str.toUpperCase();
		String lowerCase=str.toLowerCase();
		System.out.println(upperCase);
		System.out.println(lowerCase);
		
		int length=str.length();
		System.out.println(length);
		
		String substring=str.substring(2,8);
		System.out.println(substring);
		
		String rep=str.replace("Java", "Python");
		System.out.println(rep);
		
		String[] words=str.split(" ");
		
		for(String word:words) {
			System.out.println(word);
		}
		
		boolean contains=str.contains("Java");
		System.out.println(contains);
		
		
		
		
		

	}

}
