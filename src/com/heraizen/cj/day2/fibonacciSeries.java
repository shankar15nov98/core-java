package com.heraizen.cj.day2;
import java.util.Scanner;
public class fibonacciSeries {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
	    System.out.println("Enter the upper bound number to generate the Fibonacci numbers:");
	    int num=scan.nextInt();
	   
	    int n1=0,n2=1,sum=0;
	    System.out.print("Fibonacci series up to the entered number is:");
	    for(int i=1;i<num;i++)
	    {
	        System.out.print(n1 +" ");
	        sum=n1+n2;
	        n1=n2;
	        n2=sum;
	    }
	    scan.close();
	}
}
