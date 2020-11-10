package com.heraizen.cj.day1;
import java.util.Scanner;
public class negativeToPositive {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=scan.nextInt();
		int result;
		if(num<0)
		{
			 result=(~(num - 1));
		}
		else
		{
			result=num;
		}
		System.out.println("The result is: " + result);
	}
}
