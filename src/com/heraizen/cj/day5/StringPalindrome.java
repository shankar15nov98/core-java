package com.heraizen.cj.day5;

import java.util.Scanner;

public class StringPalindrome {

	
	public static void main(String[ ] arg)
	   {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the name");
		String str=scan.next();
		System.out.println("Length of the string is "+str.length());
		System.out.println("Uppercase of the string is "+str.toUpperCase());
		System.out.println("Lowercase of the string is "+str.toLowerCase());
		String rev = "";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev+=str.charAt(i);
		}
		if(str.equals(rev))
		{
			System.out.println(str+" is a palindrome");
		}
		else
		{
			System.out.println(str+" is not a palindrome");
		}
		 scan.close();
	   }
}
