package com.heraizen.cj.day5;

public class productSystem {
	int id;
	String name;
	int price;
	
	productSystem(int id,String name,int price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
	
	static void swap(productSystem laptop,productSystem desktop)
	{
		
		
		
		int tempPrice = laptop.price; 
		laptop.price = desktop.price; 
		desktop.price = tempPrice;
	}
	void display() 
    { 
		
		
        System.out.println(price); 
    } 
	public static void main(String[ ] arg)
	   {
		productSystem laptop=new productSystem(100,"sony",8500);
		productSystem desktop=new productSystem(100,"sony",35000);
		swap(laptop,desktop);
		System.out.print("Laptop price is ");
		laptop.display();
		System.out.print("Desktop price is ");
		desktop.display();
	   }
}
