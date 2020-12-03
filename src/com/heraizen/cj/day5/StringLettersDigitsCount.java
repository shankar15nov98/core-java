package com.heraizen.cj.day5;



public class StringLettersDigitsCount {
	public static void main(String[ ] arg)
	 {
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Enter the name");
//		String str=scan.next();
		String str="I am in Bangalore my house number is 6 and my phone no. 9632133889";
		int letters=0;
		int digits=0;
		int whiteSpace=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.toLowerCase().charAt(i);
			
			if(ch>='a' && ch<='z')
			{
				
				letters++;
			}
			else if(ch>='0' && ch<='9')
			{
			
				digits++;
			}
			else if(ch>=' ' && ch<=' ')
			{
				
				whiteSpace++;
			}
		}
		
		System.out.println("No. of letters: " + letters);
		System.out.println("No. of digits: " + digits);
       System.out.println("No. of whitespaces: " + whiteSpace);

	 }
}
