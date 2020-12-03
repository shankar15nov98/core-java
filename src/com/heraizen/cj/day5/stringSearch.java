package com.heraizen.cj.day5;



public class stringSearch {

	
	
	public static void main(String[ ] arg)
	   {
		String s ="miani,lakshman,java,malli,narayana";
		String searchString="narayana";
		int countCommaSeparator=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch==',')
			{
				countCommaSeparator++;
			}
		}
		String[] a=new String[countCommaSeparator+1];
		int i=0;
		for (String retval: s.split(",")) {
	       
	         a[i]=retval;
	         i++;
	      }
		for(int j=0;j<a.length;j++)
		{
			
			if(a[j].equals(searchString))
			{
				System.out.println("found at position "+j);
			}
		}
		

		
	   }
}
