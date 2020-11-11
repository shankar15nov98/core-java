package com.heraizen.cj.day2;

import java.util.Scanner;

public class membershipCard {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the bill amount:");
		int bill=scan.nextInt();
		System.out.println("Do you have a membership card?");
		char membershipCard=scan.next().charAt(0);
		int netAmount=0;
		int discount=0;
		if(membershipCard=='Y')
		{
			discount=(bill/100)*10;
			netAmount=bill-discount;
		}
		else
		{
			discount=(bill/100)*3;
			netAmount=bill-discount;
			
		}
		System.out.println("Thank you! Your total bill amount is Rs " + bill +", discount is Rs " + discount + " and net amount payable is Rs " + netAmount);
		scan.close();	
	}
}
