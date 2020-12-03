package com.heraizen.cj.day5;

public class Employee2 {

	
	private int id;
	private String name;
	private float salary;
	
	public void set(int id,String name,float salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	

	
	public int get1()
	{
		return id;
	}
	
	public String get2()
	{
		return name;
	}
	
	public float get3()
	{
		return salary;
	}
	
	public void display()
	{
		 System.out.println("Employee ID: "+get1());
		 System.out.println("Employee Name: "+get2());
		 System.out.println("Employee Salary: "+get3());
		 System.out.println();
		

	}
	
	
	@Override
    public String toString() {
        return "id=" +id + " and "+"name=" + name + " and " +"salary="+salary; 
    }
	public static void main(String[] args) {
		Employee2 e1=new Employee2();
		e1.set(100,"miani",25000);
		e1.display();
//		Employee2[] arr= {e1};
//		for(Employee2 ele:arr)
//		{
//			System.out.println(ele.toString());
//		}
	}
}
