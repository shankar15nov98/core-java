package com.heraizen.cj.day2;

public class patternNumberDecrease {
	public static void main(String[] args) {
		int n=4,m=1;;
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(m+" ");
				m=m+1;
			}
			System.out.println();
		}
	}
}
