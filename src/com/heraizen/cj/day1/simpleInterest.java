package com.heraizen.cj.day1;

import java.util.Scanner;

public class simpleInterest {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the principal amount:");
		int principal=scan.nextInt();
		System.out.println("Enter the rate of interest");
		float rateOfInterest=scan.nextFloat();
		System.out.println("Enter the time (years)");
		int numberOfYears=scan.nextInt();
		int si=(int)(principal*rateOfInterest*numberOfYears)/100;
		System.out.println("Simple interest is " + si);
		
	}
}
