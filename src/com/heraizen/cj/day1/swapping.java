package com.heraizen.cj.day1;

import java.util.Scanner;

public class swapping {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first number num1:");
		int num1=scan.nextInt();
		System.out.println("Enter the second number num2:");
		int num2=scan.nextInt();
		System.out.println("Before swap, the values of num1="+ num1 +" and num2"+ "=" + num2);
		int temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("After swap, the values of num1="+ num1 +" and num2"+ "=" + num2);
	}
}
