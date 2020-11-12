package com.heraizen.cj.day3;

import java.util.Scanner;

public class arraySum {
	public static void main(String[ ] arg)
	   {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of elements");
        int n = scan.nextInt();
        System.out.println("Enter the elements");
        int[] array= new int[n];
        for(int i=0;i<n;i++)
        {
        	array[i]=scan.nextInt();
        }
        int sum=0;
        for(int num:array)
        {
        	sum+=num;
        }
        System.out.println(sum);
		scan.close();
		
	   }
}
