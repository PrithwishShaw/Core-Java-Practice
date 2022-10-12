/*
Program : Creating a class
Author: Prithwish Shaw
Date: 19th Sep 2022
*/

import java.util.Scanner;
class LaptopShop
{
	String brand;
	float screenSize;
	String memory;
	double price;
	String processor;
	int model;
	


	void insertLaptop(String brand, float screenSize, String memory, double price, String processor, int model)
	{
		this.brand=brand;
		this.screenSize=screenSize;
		this.memory=memory;
		this.price=price;
		this.processor=processor;
		this.model=model;
	}

	void displayLaptop()
	{
		System.out.println("brand: " + brand);
		System.out.println("screenSize: "+ screenSize);
		System.out.println("memory " + memory);
		System.out.println("price: " + price);
		System.out.println("processor: " + processor);
		System.out.println("model: "+model);
	}
}

class Laptop	
{
	public static void main(String... args);
	{
		LaptopShop laptop1= new LaptopShop();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Brand name:");
		laptop1.brand = sc.next();
		System.out.println("Enter the screen size: ");
		laptop1.screenSize = sc.nextFloat();
		System.out.println("Enter the memory: ");
		laptop1.screenSize = sc.next();
		System.out.println("Enter the price: ");
		laptop1.screenSize = sc.nextDouble();
		System.out.println("Enter the processor: ");
		laptop1.screenSize = sc.next();
		System.out.println("Enter the model: ");
		laptop1.screenSize = sc.nextInt();
		
		//insertLaptop(String brand, float screenSize, String memory, double price, String processor, int model);
		
		System.out.println();
		System.out.println();
		System.out.println("Your Laptop Details are:");
		displayLaptop(LaptopShop);
	}
}