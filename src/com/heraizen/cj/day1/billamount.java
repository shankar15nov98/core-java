package com.heraizen.cj.day1;

import java.util.Scanner;

public class billamount {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the billing amount:");
		int billAmount=scan.nextInt();
		int netAmount;
		if(billAmount>6000)
		{
			netAmount=billAmount-((billAmount/100)*10);
		}
		else
		{
			netAmount=billAmount;
		}
		System.out.println("Your net billing amount: " + netAmount);
	}
}
