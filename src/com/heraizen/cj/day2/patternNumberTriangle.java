package com.heraizen.cj.day2;

public class patternNumberTriangle {
	public static void main(String[] args) {
		int n=5,m=0;
		for(int i=1;i<=n;i++)
		{
			m=0;
			for(int j=1;j<=i;j++)
			{
				m++;
				System.out.print(m+" ");
			}
			for(int j=1;j<=i-1;j++)
			{
				m--;
				System.out.print(m+" ");
			}
			System.out.println();
		}
	}
}
