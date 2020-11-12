package com.heraizen.cj.day3;

import java.util.Scanner;

public class numberFoundInArray {
	public static void main(String[ ] arg)
	   {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter 1st number");
	     int a = scan.nextInt();
	     System.out.println("Enter 2nd number");
	     int b = scan.nextInt();
	     int[] arr= {5,20,25,35,45,50};
	     boolean found = false;
	     for(int num:arr)
	     {
	    	 if(num==a)
	    	 {
	    		 found=true;
	    		 break;
	    	 }
	     }
	     if(found)
	     {
	    	 found = false;
	    	 for(int num:arr)
		     {
		    	 if(num==b)
		    	 {
		    		 found=true;
		    		 break;
		    	 }
		     }
	     }
	     
	     if(found) {
	    	 System.out.println("Success,Number found in the array");
	     }
	     else
	     {
	    	 System.out.println("Fail,Number not found in the array");
	     }
	     scan.close();
		
	   }
}
