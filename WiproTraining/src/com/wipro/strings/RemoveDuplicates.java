package com.wipro.strings;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="progrmming";
		
		String output="";
		
		for(int i=0;i<input.length();i++) {
			char ch = input.charAt(i);
			if(output.indexOf(ch)==-1) {
				output+=ch;
				
			}
			
			
		}
		System.out.println(output);

	}

}
