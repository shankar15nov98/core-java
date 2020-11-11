package com.heraizen.cj.day2;

import java.util.Scanner;

public class sumOfSingleDigit {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter any number:");
		int n =sc.nextInt();
		int sum=0;
		while(n>10)
		{
			sum=0;
			while(n!=0)
			{
				sum=sum+(n%10);
				n=n/10;
			}
			n=sum;
			
		}
		System.out.println("Single digit sum is: "+n);
		sc.close();
	}
}
