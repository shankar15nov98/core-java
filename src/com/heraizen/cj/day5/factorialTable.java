package com.heraizen.cj.day5;

import java.util.Scanner;

public class factorialTable {

	static int factorial()
	{
		Scanner scan=new Scanner(System.in);
		int fact=1;
		System.out.println("Enter the number");
		int num=scan.nextInt();
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factoral :"+fact);
		scan.close();
		return num;
		
	}
	static int table()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
        for(int i = 1; i <= 10; ++i)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
        scan.close();
		return num;
	}
	
	static int prime()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		boolean flag = false;
        for(int i = 2; i <= num/2; ++i)
        {
            if(num%i==0)
            {
            	flag=true;
            	break;
            }
        }
        if(!flag)
        {
        	System.out.printf("Given number is Prime Number");
        }
        else
        {
        	System.out.printf("Given number is not Prime Number");
        }
        scan.close();
		return num;
	}
	
	
	 public static void main(String[ ] arg)
	   {
		 
		
			 System.out.println("Please enter option : 1.Factorial 2.Table 3.Prime or Not");
			 Scanner scan=new Scanner(System.in);
			 int ch=scan.nextInt();
			 switch(ch)
				{
				 case 1:
					 factorial();
					 break;
					 
				 case 2:
					 
					 table();
					 break;
					 
				 case 3:
					 prime();
					 break;
					 
					 
				}
			 scan.close(); 
		 
	   }
}
