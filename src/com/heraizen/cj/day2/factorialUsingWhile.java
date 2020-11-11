package com.heraizen.cj.day2;

import java.util.Scanner;

public class factorialUsingWhile {
	 public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Enter any number:");
		 int number =scan.nextInt();
	        long fact = 1;
	        int i = 1;
	        while(i<=number)
	        {
	            fact = fact * i;
	            i++;
	        }
	        System.out.println("Factorial of "+number+" is: "+fact);
	        scan.close();
	    }
}
