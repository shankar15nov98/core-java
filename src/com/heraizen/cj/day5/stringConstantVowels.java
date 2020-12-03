package com.heraizen.cj.day5;

import java.util.Scanner;

public class stringConstantVowels {

	
	public static void main(String[ ] arg)
	 {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the name");
		String str=scan.next();
		int vowels=0;
		int Consonants=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' )
			{
				vowels++;
			}
			else if(ch>='a' && ch<='z')
			{
				Consonants++;
			}
		}
		
		System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + Consonants);
        scan.close();
	 }
}
