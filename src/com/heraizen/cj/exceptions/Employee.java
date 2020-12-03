package com.heraizen.cj.exceptions;

import java.util.Scanner;

public class Employee {
	int empNumber;
	String name;
	float exp;
	public  Employee(int empNumber,String name,float exp) {
		this.empNumber=empNumber;
		this.name=name;
		this.exp=exp;
		
	}
	 void display()
	 {
		 System.out.println("Employee Number: "+empNumber);
		 System.out.println("Employee name: "+name);
		 System.out.println("Employee Experience: "+exp);
	 }
	 
	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        
       System.out.println("Enter the Employee number ");
       int empNum=sc.nextInt();
       
       System.out.println("Enter the Employee Name");
       String empName=sc.next();
       
       System.out.println("Enter the experience");
       float experince=sc.nextFloat();
       

       
       
       try{
           
    	   if(experince>2.5 && experince<3.6) 
           {
    		   Employee emp=new Employee(empNum,empName,experince);
    		   emp.display();
           }
    	   else
    	   {
    		   throw new IllegalArgumentException("Employee experience must be be above 2.6 years and less than 3.6 years");
    	   }
    	   
           
       }
       catch(IllegalArgumentException i){
    	   System.out.println(i);
        
       }
       
	}
}
