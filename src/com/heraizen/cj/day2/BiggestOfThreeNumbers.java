package com.heraizen.cj.day2;

import java.util.Scanner;

public class BiggestOfThreeNumbers {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first number num1:");
		int num1=scan.nextInt();
		System.out.println("Enter the second number num2:");
		int num2=scan.nextInt();
		System.out.println("Enter the third number num3:");
		int num3=scan.nextInt();
		if(num1>num2 && num1>num3)
		{
			System.out.println("The biggest of the 3 numbers entered is: " + num1);
		}
		else if(num2>num3)
		{
			System.out.println("The biggest of the 3 numbers entered is: " + num2);
		}
		else
		{
			System.out.println("The biggest of the 3 numbers entered is: " + num3);
		}
		scan.close();
	}
}
