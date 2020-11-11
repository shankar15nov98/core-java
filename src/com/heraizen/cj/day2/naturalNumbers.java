package com.heraizen.cj.day2;

import java.util.Scanner;

public class naturalNumbers {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of natural numbers to be generated:");
		int num=scan.nextInt();
		System.out.print("First " + num + " natural numbers are :");
		for(int j=1;j<num+1;j++)
		{
			System.out.print(j +" ");
		}
		
		
		scan.close();
	}
}
