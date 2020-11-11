package com.heraizen.cj.day2;

import java.util.Scanner;

public class grade {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the marks scored in 1st subject");
		int num1=scan.nextInt();
		System.out.println("Enter the marks scored in 2nd subject:");
		int num2=scan.nextInt();
		System.out.println("Enter the marks scored in 3rd subject:");
		int num3=scan.nextInt();
		int totalMarks=0;
		int averageMarks=0;
		String grade;
		totalMarks=num1+num2+num3;
		averageMarks=totalMarks/3;
		if(averageMarks<35)
		{
			grade="C";
		}
		else if(averageMarks>35 && averageMarks<60)
		{
			grade="B";
		}
		else 
		{
			grade="A";
		}
		System.out.println("Total marks:" +totalMarks);
		System.out.println("Average is:" +averageMarks);
		System.out.println("Grade:" +grade);
		scan.close();
	}
}
