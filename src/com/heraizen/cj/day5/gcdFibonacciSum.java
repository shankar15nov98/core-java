package com.heraizen.cj.day5;

public class gcdFibonacciSum {
	
	public static int gcd(int n1, int n2)
    {
        if (n2 != 0)
            return gcd(n2, n1 % n2);
        else
            return n1;
    }
	 
	public static int fibonacciRecursion(int n)
	{
		if(n == 0)
		{
			return 0;
		}
		if(n == 1 || n == 2)
		{
				return 1;
		}
		return fibonacciRecursion(n-2) + fibonacciRecursion(n-1);
	}
	public static int addNumbers(int num) 
	{
        if (num != 0)
            return num + addNumbers(num - 1);
        else
            return num;
    }
	
	public static void main(String[ ] arg)
	   {
		 int n1 = 366, n2 = 60;
	     int gcd = gcd(n1, n2);
	     System.out.printf("G.C.D of %d and %d is %d.", n1, n2, gcd);
	     System.out.println();
	     int maxNumber = 10;
	 	 System.out.print("Fibonacci Series of "+maxNumber+" numbers: ");
	 	 for(int i = 0; i < maxNumber; i++)
		 {
		 			System.out.print(fibonacciRecursion(i) +" ");
		 }
	 	 System.out.println();
		 int number = 5;
	     int sum = addNumbers(number);
	     System.out.printf("Sum  of %d is %d.", number, sum);

	        
	   }
}
