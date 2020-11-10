package com.heraizen.cj.day1;

import java.util.Scanner;

public class employeeYearSalary {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the empno:");
		int empno=scan.nextInt();
		System.out.println("Enter the employee name:");
		String name=scan.next();
		System.out.println("Enter the monthly salary:");
		int monthSalary=scan.nextInt();
		int yearSalary=(monthSalary)*12;
		System.out.println(" Hi "+ name +"! Your employee id is "+empno+", monthly salary is Rs."+ monthSalary +" and yearly salary is Rs."+yearSalary);
	}
}
