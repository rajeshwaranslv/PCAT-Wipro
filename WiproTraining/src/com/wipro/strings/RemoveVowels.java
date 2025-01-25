package com.wipro.strings;

public class RemoveVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input="programming";
		String vowels="aeiouAEIOU";
		
		String output="";
		
		for(int i=0;i<input.length();i++) {
			char ch =input.charAt(i);
			
			if(vowels.indexOf(ch)==-1) {
				 output+=ch;
			}
		}
		System.out.println(output);

	}

}
