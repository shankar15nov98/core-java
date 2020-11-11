package com.heraizen.cj.day2;
import java.util.Scanner;
public class armstrongNumber {
	public static void main(String[] args)
	{
		  Scanner scan=new Scanner(System.in);
		  System.out.println("Enter any number:");
		  int num=scan.nextInt();
		  int sum = 0, temp=num;
	      while(num != 0) 
	      {
	          int digit = num % 10;
	          sum = sum + (digit*digit*digit);
	          num /= 10;
	      }
	      if(temp==sum)
	      {
	          System.out.println(temp +" is an Armstrong number" );   
	      }
	      else
	      {
	         System.out.println(temp +" is not an Armstrong number" );
	      }
		  scan.close();
	}
}
