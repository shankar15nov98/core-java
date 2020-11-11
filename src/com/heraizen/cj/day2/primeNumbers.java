package com.heraizen.cj.day2;

import java.util.Scanner;

public class primeNumbers {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any number:");
		int num=scan.nextInt();
		boolean isprime=false;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				isprime=true;
				break;
			}
		}
		if(isprime)
		{
			System.out.println("The entered number " + num +" is not a prime number");
		}
		else
		{
			System.out.println("The entered number " + num +" is a prime number");
		}
		scan.close();
	}
}
