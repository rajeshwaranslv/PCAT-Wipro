package com.wipro.datatype;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10,b=5,c=2;
		int add=a+b+c;
//		Arithmetic 
		System.out.println(add);
//		Relational
		
		boolean isEquals=(a==b);
		boolean isNotEquals=(a==b);
		System.out.println(isEquals+""+isNotEquals);
//		ternary operator
		int max=(a>b)?a:b;
		System.out.println(max);
		
		int min=(a<b)?a:b;
		System.out.println(min);
		
		
		boolean isMin=(a>b) && (a!=b)?true:false;
		System.out.println(isMin);
		
		int valueA=5;
		int valueB=3;
		int res=valueA & valueB;
		System.out.println(res);
		
		int valueC=5;
		int valueD=3;
		int resA=valueC | valueD;
		int resB=valueC ^ valueD;
		int resC=~valueC ;
		System.out.println(resA);
		System.out.println(resB);
		System.out.println(resC);
		
		
		
		
		
		
		
		
		
		
		

	}

}
