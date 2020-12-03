package com.heraizen.cj.day5;

public class Student1 {
	public static int count=0;
	 int id;
	 String name;
	 int[] sub={20,30,40,50,60};
	 int sum=0;
	 
	 Student1(int id,String name)
	 {
		 this.id=id;
		 this.name=name;
	
		 
	 }
	 
	 void calSum(int a[]){
		
		 for(int ele:a)
		 {
			 sum+=ele;
		 }
		 System.out.println("Sum of the Subject is: "+sum);
	 }
	 
	 void display()
	 {

		 calSum(sub);
		 System.out.println("Student ID: "+id);
		 System.out.println("Student Name: "+name);
		 System.out.println();
	 }
	 
	 
	 
	 public static void main(String[ ] arg)
	   {
		
		 Student1 s1=new Student1(1001,"shankar");
		 Student1 s2=new Student1(1002,"shiva");
//		 int[] myarray= {40,50,60,80,90};
//		 s1.calSum(myarray);
		 s1.display();
		 s2.display();
		
	   }
}
