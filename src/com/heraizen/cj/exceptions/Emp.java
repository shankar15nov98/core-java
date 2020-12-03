package com.heraizen.cj.exceptions;

import java.util.Scanner;

public class Emp {

	int empId;
	String empName;
	String designation;
	static double basic;
	double hra;

	Emp(int empId, String designation, double basic, double hra) {
		this.empId = empId;
		this.designation = designation;
		this.basic = basic;
		this.hra = hra;
	}

	void printDetails() {
		System.out.println("Employee ID: " + empId);
		System.out.println("Employee Designation: " + designation);
		System.out.println("Employee basic: " + basic);
		System.out.println("Employee HRA: " + hra);
		System.out.println();
	}

	void calculateHRA() {

		if (designation.equals("Manager")) {

			hra = (basic / 100) * 10;
		}

		else if (designation.equals("Officer")) {
			hra = (basic / 100) * 12;
		}

		else {
			hra = (basic / 100) * 5;
		}

	}

	public static void main(String[] arg) throws LowSalException {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Id");
		int empId = scan.nextInt();
		System.out.println("Enter designation");
		String designation = scan.next();
		System.out.println("Enter basic");
		double basic = scan.nextDouble();

		double hra = 0;

		try {

			if (basic > 500) {
				Emp e1 = new Emp(empId, designation, basic, hra);
				e1.calculateHRA();
				e1.printDetails();
			} else {
				throw new LowSalException("BASIC less than 500");
			}

		} catch (LowSalException e) {
			System.out.println(e);

		}
		scan.close();
	}

}
