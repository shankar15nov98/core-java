package com.heraizen.cj.day5;

public class Employee {

	private int id;
	private String name;
	private float salary;
	
	Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
		this.salary=20000;
	}
	Employee(int id,String name,float salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	void display() 
	{
		 System.out.println("Employee ID: "+id);
		 System.out.println("Employee Name: "+name);
		 System.out.println("Employee Salary: "+salary);
		 System.out.println();
	}
	
	public static void main(String[] args) {
		Employee e1=new Employee(101,"shankar");
		Employee e2=new Employee(102,"shiva",30000);
		Employee e3=new Employee(103,"vijay");
		e1.display();
		e2.display();
		e3.display();
	}
}
