package com.heraizen.cj.day2;

import java.util.Scanner;

public class powerOfNumber {

	 public static void main(String[] args) {
		 	Scanner scan=new Scanner(System.in);
		 	System.out.println("Enter 1st number:");
		 	int num1=scan.nextInt();
		 	System.out.println("Enter 2nd number:");
		 	int num2=scan.nextInt();
	        long result = 1;

	        while (num2 != 0)
	        {
	            result *= num1;
	            num2--;
	        }

	        System.out.println("power of number is " + result);
	        scan.close();
	    }
}
