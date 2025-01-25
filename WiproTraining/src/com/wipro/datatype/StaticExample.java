package com.wipro.datatype;

public class StaticExample {
	
	static {
		System.out.println("Static block");
		a=20;

	}
	static int a;
	static int i=print();
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog d=new dog();
		
		System.out.println("Main method start"+d);
		
	 

	}
	public static int print() {
		System.out.println("Static Memory");
		return 0;
		
	}

}
class dog{
	
}
