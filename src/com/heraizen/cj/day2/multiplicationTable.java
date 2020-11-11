package com.heraizen.cj.day2;
import java.util.Scanner;
public class multiplicationTable {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	    System.out.println("Enter the number to generate its multiplication table:");
	    int num=scan.nextInt();
	    int multiple;
	    System.out.println("Multiplication table for " + num +" is :");
	    for(int i=1;i<11;i++)
	    {
	        multiple=num*i;
	       System.out.println( num + " * " + i + " = " + multiple);
	    }
		scan.close();		
	}
}
