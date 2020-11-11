package com.heraizen.cj.day2;

import java.util.Scanner;

public class sumOfSeries {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any number:");
		int num=scan.nextInt();
   
	      double i, s = 0.0; 
	      for (i = 1; i <= num; i++) 
	          s = s + 1/i; 
	      System.out.printf("Sum is %f", s); 
	      scan.close();
	}
}
