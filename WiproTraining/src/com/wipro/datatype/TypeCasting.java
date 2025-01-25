package com.wipro.datatype;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Implicit - Upcasting or widening
//		Explicit - Downcasting or narrowing
		
		
		int i=100;
		long l =i;
//		Wide, No data loss, Auto conversion
		System.out.println(l);
		
		int age=19;
		
		byte b=(byte) age;
//		Narrow,  data loss, Explicitly by user conversion		
		System.out.println(b);
		
		
		double num=100.99;
		int intNum=(int) num;
		System.out.println(intNum);
		
		
		char c='A'+'a';
		int acsciivalue=c;
		System.out.println(acsciivalue);
		
		int value=65;
		char aChar=(char)value;
		System.out.println(aChar);
		
		int valueA=200;
		byte b2=(byte)valueA;
		System.out.println(b2);
		
		byte b1=122;
		b1+=3;
		System.out.println(b1);
		
		
		

	}

}
