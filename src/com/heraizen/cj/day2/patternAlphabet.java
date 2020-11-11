package com.heraizen.cj.day2;

public class patternAlphabet {
	public static void main(String[] args) {
		int n=3;
		int c=65;
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.printf("%c ",c);
				c=c+1;
			}
			System.out.println();
		}
	}


}
