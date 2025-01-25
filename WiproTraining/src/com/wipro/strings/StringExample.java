package com.wipro.strings;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String is a series/collection of characters which is enclosed with double quotes
//		A String is treated as an object in java
		
//		Immutable and mutable strings
		
		String s="Rajeshwaran Selvam";
//		Heap with separate place 
		String s2=new String("Zen");
		String s3=s2.concat(" Yin");
		 s2=s2.concat(" Yin");
		String s1=new String("Zen");
		StringBuffer sb1=new StringBuffer("Yin");
		StringBuffer sb2=new StringBuffer("Yin");
		
		sb2.append(" Yan");
//		String constant pool - Whenever an object is created using new keyword a copy of that object will be placed in SCP
//		Duplicates are not allowed, Saves the memory
		char name[]= {'r','a','j'};
//		References are compared ==
//		equals() - compare two Strings equalsIgnoreCase() - Ignore low or up case | compareTo() - Compare CH by CH
		
		System.out.println(s);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(name);
		System.out.println(name[2]);
		for(char c:name) {
			System.out.println(c);
		}
//	String class overrides equals method or modifies it
		System.out.println(s2);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
//		Class object - equals() compare the references
//		Equals method as it is.
		
		System.out.println(sb2);
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		
//		Object and Class difference 
		System.out.println("=-=-=-=-=-=-=");	
		String si1 = new String("Java");
		
		si1.concat("FullStack");
		String si2 = si1.concat("Trainer");
		
		si2.concat("IT");
		System.out.println(si1);
		System.out.println(si2);
		
		System.out.println("=-=-=-=-=-=-=");
		
		
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
 * */	
		
		
	}
}
