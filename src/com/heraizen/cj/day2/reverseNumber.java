package com.heraizen.cj.day2;
import java.util.Scanner;
public class reverseNumber {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any number:");
		int num=scan.nextInt();
		int reversed = 0;
	    while(num != 0) 
	    {
	        int digit = num % 10;
	        reversed = reversed * 10 + digit;
	        num /= 10;
	    }

	    System.out.println("Reverse of the entered number is " + reversed);
		scan.close();
	}
}
