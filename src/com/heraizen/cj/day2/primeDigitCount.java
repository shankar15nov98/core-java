package com.heraizen.cj.day2;

import java.util.Scanner;

public class primeDigitCount {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any number:");
		int n=scan.nextInt();
		int temp = n, count = 0; 
        while (temp != 0) { 
            int d = temp % 10; 
            temp /= 10;
            if (d == 2 || d == 3
                || d == 5 || d == 7) 
                count++; 
        } 
        System.out.println(count);
        scan.close();
	}
}
