package com.heraizen.cj.day5;

import java.util.Scanner;

public class factorial {

	static int multiplyNumbers(int num){
		if(num>1)
			return num*multiplyNumbers(num-1);
		else
            return 1;
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=scan.nextInt();
        int factorial = multiplyNumbers(num);
        System.out.println("Factorial of " + num + " = " + factorial);
        scan.close();
    }
}
