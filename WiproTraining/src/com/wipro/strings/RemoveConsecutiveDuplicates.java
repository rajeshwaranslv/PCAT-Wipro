package com.wipro.strings;

public class RemoveConsecutiveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  input="aaabbccdaa";
		
		String output="";
		
		for(int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
			if(i==0 || ch!=input.charAt(i-1)) {
				output+=ch;
			}
		}
		
		System.out.println(output);

	}

}
