package com.heraizen.cj.exceptions;

import java.util.Scanner;

public class MyNumber {
	int firstNumber;
	int secondNumber;
	static int a;
	static int b;
	static double result;

	MyNumber(int x, int y) {
		a = x;
		b = y;

	}

	public void add() {
		result = a + b;

	}

	public void sub() {
		result = a - b;
	}

	public void mul() {
		result = a * b;
	}

	public void div() {
		try {
			result = a / b;
			System.out.println("The division is " + result);
		} catch (ArithmeticException e) {
			System.out.println("Can't be divided by Zero " + e);
		}
	}

	public static void main(String[] arg) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter choice: 1.Add \t 2.Sub \t 3.Mul \t 4.Div");
		int ch = scan.nextInt();
		System.out.println("Enter first number");
		int number1 = scan.nextInt();
		System.out.println("Enter second number");
		int number2 = scan.nextInt();
		MyNumber number = new MyNumber(number1, number2);

		switch (ch) {
		case 1:
			number.add();
			System.out.println("The addition is " + result);
			break;
		case 2:
			number.sub();
			System.out.println("The subtraction is " + result);
			break;
		case 3:
			number.mul();
			System.out.println("The multiplicaton is " + result);
			break;

		case 4:
			number.div();

			break;
		}
		
		scan.close();
	}
}