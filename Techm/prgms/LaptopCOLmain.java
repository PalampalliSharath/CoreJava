package com.Techm.prgms;

import java.util.Scanner;

public class LaptopCOLmain 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		String name=scanner.next();
		String colour=scanner.next();
		int id=scanner.nextInt();
		int weight=scanner.nextInt();
		
		LaptopCOL l1=new LaptopCOL(name,id,colour,weight);
		LaptopCOL l2=new LaptopCOL( weight,name);
		LaptopCOL l3=new LaptopCOL( colour, id);
		System.out.println("laptop details are");
		l1.printDetails1();
		l2.printDetails1();
		l3.printDetails1();		
		// output will print in console.
	}

}
