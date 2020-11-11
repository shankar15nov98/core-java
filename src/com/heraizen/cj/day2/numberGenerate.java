package com.heraizen.cj.day2;

public class numberGenerate {
	public static void main(String[] args)
	{
		
		int n=3,i=0,j=1;
		for(i=1;i<=n;i++) 
		{
				
			switch(i)
			{
			
				case 1:
					
					if(i!=j)
					{
						System.out.println(j+" "+i);
					}
					break;
				case 2:
					
					if(i!=j)
					{
						System.out.println(j+" "+i);
					}
					break;
				case 3:
					
					if(i!=j)
					{
						System.out.println(j+" "+i);
						i=0;
						j++;
						continue ;
					}
					else
					{
						break;
					}
				
	
			}
		}
	}
}
