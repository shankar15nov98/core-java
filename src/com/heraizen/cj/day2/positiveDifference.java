package com.heraizen.cj.day2;

import java.util.Scanner;

public class positiveDifference {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first number num1:");
		int num1=scan.nextInt();
		System.out.println("Enter the second number num2:");
		int num2=scan.nextInt();
		int result=0;
		if(num1<num2)
		{
			result=-(num1-num2);
		}
		else
		{
			result=num1-num2;
			
		}
		System.out.println("The result (difference) is " + result);
		scan.close();
	}
}
