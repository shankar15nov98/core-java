package com.heraizen.cj.day1;

import java.util.Scanner;

public class averageWeight {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the weight of the first person:");
		float a=scan.nextFloat();
		System.out.println("Enter the weight of the second person:");
		float b=scan.nextFloat();
		System.out.println("Enter the weight of the third person:");
		float c=scan.nextFloat();
		float weight=a+b+c;
		float averageWeight=weight/3;
		System.out.println("The sum of weight of the 3 persons is " + weight +" Kgs and the average weight is "+averageWeight +" Kgs ");
	}
}
