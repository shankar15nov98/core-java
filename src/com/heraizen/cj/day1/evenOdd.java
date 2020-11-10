package com.heraizen.cj.day1;

import java.util.Scanner;

public class evenOdd {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=scan.nextInt();
		if(num%2==0)
		{
			System.out.println("The entered number " + num + " is even");
		}
		else
		{
			System.out.println("The entered number " + num + " is odd");
		}
		
	}
}
