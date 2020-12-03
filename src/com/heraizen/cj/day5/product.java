package com.heraizen.cj.day5;



public class product {
	int pid;
	String pname;
	int price;
	
	product(int pid,String pname,int price)
	{
		this.pid=pid;
		this.pname=pname;
		this.price=price;
	}
//	void display()
//	{
//		 System.out.println("product ID: "+pid);
//		 System.out.println("product Name: "+pname);
//		 System.out.println("product price: "+price);
//		 System.out.println();
//		 
//		 
//	}
	
	@Override
    public String toString() {
        return pid + ", " + pname + ", " + price; //The remaining fields
    }
	public static void main(String[ ] arg)
	
	{
		product p1=new product(101,"shankar",25000);
		product p2=new product(102,"arun",35000);
		product p3=new product(103,"nishanth",45000);
		product p4=new product(104,"santhosh",25000);
		product p5=new product(105,"arun",35000);
		product p6=new product(106,"nishanth",45000);
		product p7=new product(107,"santhosh",25000);
		product p8=new product(108,"arun",35000);
		product p9=new product(109,"nishanth",45000);
		product p10=new product(110,"shankar",25000);
		product[] arr= {p1,p2,p3,p4,p5,p6,p7,p8,p9,p10}; 
//		p1.display();
//		p2.display();
//		p3.display();
//		p4.display();
//		p5.display();
//		p6.display();
//		p7.display();
//		p8.display();
//		p9.display();
//		p10.display();
		
		
//		System.out.println(Arrays.toString(arr));
		for(product ele:arr)
		{
			System.out.println(ele.toString());
		}
		
	}
}
