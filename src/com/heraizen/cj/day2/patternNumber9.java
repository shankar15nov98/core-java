package com.heraizen.cj.day2;

public class patternNumber9 {
	public static void main(String[] args) {
		
		int n=3,m=19;;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==j)
				{
					System.out.print(m+" ");
				}
				else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
	}
}
