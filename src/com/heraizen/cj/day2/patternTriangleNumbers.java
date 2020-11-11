package com.heraizen.cj.day2;

public class patternTriangleNumbers {
	public static void main(String[] args) {
		int n=4,m=0;;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			m=i;
			if(m==n)
			{
				m=m-1;
			}
			for(int j=m;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
