package com.heraizen.cj.day5;

public class stringSeparator {
	String firstName;
	String middleName;
	String lastName;
	
	stringSeparator(String firstName,String middleName,String lastName)
	{
		this.firstName=firstName;
		this.middleName=middleName;
		this.lastName=lastName;
	}
	void display()
	{
		System.out.println(firstName+"-"+middleName+"-"+lastName);
		
		
	}
	
	public static void main(String[ ] arg)
	   {
		stringSeparator s=new stringSeparator("raj","kumar","k");
		s.display();
	   }
}
