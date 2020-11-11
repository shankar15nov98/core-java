package com.heraizen.cj.day2;

import java.util.Scanner;

public class digitIncrementOne {
	public static void main(String[] args) 
	   {

			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Any Number");
			String number =scan.nextLine();
			int length = number.length();
			int n = Integer.parseInt(number);
			int i=0,a=1,sum=0;
			while(i!=length)
			{
				i++;
				a=1;
				for(int j=1;j<=length-i;j++)
				{
					a=a*10;
				}
				if((n/a)!=9)
				{
				sum=(((n/a)+1)*a)+sum;
				}
				
				n=n%a;
			
				
			}
			System.out.println(sum+" ");
			scan.close();
	    }
}
