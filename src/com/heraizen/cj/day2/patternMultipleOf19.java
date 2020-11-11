package com.heraizen.cj.day2;

public class patternMultipleOf19 {
	public static void main(String[] args) {
		int n=3,m=0;
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<n;j++)
			{
				m=m+19;
				System.out.print(m+" ");
			}
			System.out.println();
		}
	}

}
