package com.heraizen.cj.day5;

public class CalculateSum1 extends CalculateSum{
	public void sum(int a, int b,int c)
	{
		System.out.println(a+b);
	}
	
	 public static void main(String[ ] arg)
	   {
		 CalculateSum1 s1=new CalculateSum1();
		 s1.sum(10,20);
		 s1.sum(30,40,50);
		 
	   }
}
