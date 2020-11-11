package com.heraizen.cj.day2;

public class patternStarI {
	public static void main(String[] args) {
		int n=9;
		for(int i=1;i<=n-2;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1||i==n-2)
				{
					System.out.print("* ");
				}
				else if(j==6){
					System.out.print(" *");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
