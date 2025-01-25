package com.wipro.strings;
import java.util.Scanner;
public class CaesarCipher {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string to encrypt");
		
		String input=s.nextLine();
		System.out.println("Enter the shift value");
		int shift=s.nextInt();
		
		String encrypted=encryptString(input,shift);
		
		System.out.println("Encrypted String"+encrypted);
		
		
		s.close();
	}

	private static String encryptString(String input, int shift) {
		// TODO Auto-generated method stub
		StringBuilder encrypted=new StringBuilder();
		
		for(char c:input.toCharArray()) {
			if(Character.isUpperCase(c)) {
				encrypted.append((char) ('A'+ (c-'A'+shift)%26) );
			}
			else if(Character.isLowerCase(c)) {
				encrypted.append((char) ('a'+ (c-'a'+shift)%26) );
			}
			else {
				encrypted.append(c);
			}
		}
		return encrypted.toString();
	}

}
