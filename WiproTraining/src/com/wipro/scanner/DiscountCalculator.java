package com.wipro.scanner;

import java.util.*;

public class DiscountCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Total amount");
		double purchaseAmount=s.nextDouble();
		
		double discountRate;
		if(purchaseAmount>=1000 && purchaseAmount<=2000) {
			discountRate=0.10;
			
		}
		else if(purchaseAmount>2000 && purchaseAmount<=2000) {
			discountRate=0.15;
			
		}
		else if(purchaseAmount>5000) {
			discountRate=0.20;
			
		}
		else {
			discountRate=0;
		}
		
		double discocuntAmount=purchaseAmount*discountRate;
		double finalAmount=purchaseAmount-discocuntAmount;
		
		System.out.println("Total purchase amount "+purchaseAmount);
		System.out.println("Total Discount rate "+(discountRate*100));
		System.out.println("Total purchase amount "+finalAmount);
		
	s.close();	

	}

}
