package com.heraizen.cj.day2;
import java.util.Scanner;
public class numberOfDigits {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any number:");
	    int num=scan.nextInt();
	    int count=0;
	    while(num!=0)
	    {
	        num=num/10;
	       count++;
	    }
	    System.out.println("The number of digits in the entered number is "+ count);
	    scan.close();
	}
}
