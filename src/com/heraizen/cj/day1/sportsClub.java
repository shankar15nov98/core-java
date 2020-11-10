package com.heraizen.cj.day1;

import java.util.Scanner;

public class sportsClub {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the name:");
		String name=scan.next();
		System.out.println("Enter the mobile number:");
		int number=scan.nextInt();
		System.out.println("Enter the age:");
		int age=scan.nextInt();
		if(age<18)
		{
			System.out.println("Sorry! You need to be at least 18 years old to get membership.");
		}
		else
		{
			System.out.println("Congratulations" + name + "for your successful registration");
		}
	
	}

}
