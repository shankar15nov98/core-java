package com.heraizen.cj.day3;

import java.util.Scanner;

public class biggestSmallest {
	public static void main(String[ ] arg)
	   {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter number of elements");
	     int n = scan.nextInt();
	     System.out.println("Enter the elements");
	     int[] array= new int[n];
	     for(int i=0;i<n;i++)
	     {
	     	array[i]=scan.nextInt();
	     }
	     int max=array[0];
         int min=array[0];

         for(int num:array){
             if(num>max)
             {
            	 max=num;
             }
                                 
             if(num<min)
             {
            	 min=num;
              }
                                
         }
         System.out.println("The biggest element is :"+max);
         System.out.println("The smallest element is :"+min);
	    
	     scan.close();
		
	   }
}
