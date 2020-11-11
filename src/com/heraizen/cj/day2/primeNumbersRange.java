package com.heraizen.cj.day2;
import java.util.Scanner;
public class primeNumbersRange {
	public static void main(String[] args)
	{
		int a,b,flag,i;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the lower bound value:");
		a = scan.nextInt();
		System.out.print("Enter the upper bound value:");
		b = scan.nextInt();
		System.out.print("The prime numbers between " + a + " and  " + b + " are: ");
		while (a < b)
		{
		flag = 0;
		for(i = 2; i <= a/2; ++i)
		{
		if(a % i == 0)
		{
		flag = 1;
		break;
		}
		}
		if (flag == 0)
		System.out.print(a + " ");
		++a;
		}
	     scan.close();
	}
}
