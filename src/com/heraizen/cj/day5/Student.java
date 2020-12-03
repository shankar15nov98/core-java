package com.heraizen.cj.day5;

public class Student {
	public static int count=0;
	 int id;
	 String name;
	 String address;
	 
	 Student(int id,String name)
	 {
		 this.id=id;
		 this.name=name;
	
		 
	 }
	 
	 void display()
	 {
//		 System.out.println("Details of student: "+"id:"+id+","+"name:"+name);
		 System.out.println("Student ID: "+id);
		 System.out.println("Student Name: "+name);
		 System.out.println();
	 }
	 
	 {
		 count++;
	 }
	 
	 public static void main(String[ ] arg)
	   {
		
		 Student s1=new Student(1001,"Shankar");
		 Student s2=new Student(1002,"Shiva");
		 Student s3=new Student(1003,"Karthick");
		 s1.display();
		 s2.display();
		 s3.display();
		 System.out.println("Number of objects created:"+count);
	   }
}
