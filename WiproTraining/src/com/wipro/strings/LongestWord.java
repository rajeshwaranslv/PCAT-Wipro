package com.wipro.strings;

public class LongestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sentence = "My name is rajesh";
//		Split the strings to array
		String[] words=sentence.split(" ");
//		Start from the 0th index
		String longestWord = words[0];
//		My  name is rajesh
		for(int i=1;i<words.length;i++) {
			if(words[i].length()>longestWord.length()) {
				longestWord=words[i];
			}
		}
System.out.println(longestWord);
	}

}
