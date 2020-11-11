package com.heraizen.cj.day2;
import java.util.Scanner;
public class calculator {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the 1st Operand num1:");
		int number1 = scan.nextInt();
		System.out.println("Enter the 2nd Operand num2:");
		int number2 = scan.nextInt();
		System.out.println("Enter the operator");
		System.out.println("1. add 2. mul 3. div ");
		int op =scan.nextInt();
		switch(op)
		{
		case 1:
			int sum=number1+number2;
			System.out.println("The sum of "+ number1 +" and "+ number2 +" is "+ sum);
			break;
		case 2:
			int multiple=number1*number2;
			System.out.println("The multiple of "+ number1 +" and "+ number2 +" is "+ multiple);
			break;
		case 3:
			int div=number1/number2;
			System.out.println("The division of "+ number1 +" and "+ number2 +" is "+ div);
			break;
		}
		scan.close();
	}
}
