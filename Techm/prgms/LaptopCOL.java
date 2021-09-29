package com.Techm.prgms;

public class LaptopCOL 
{
	String name;
	String colour;
	int id;
	int weight;
	
	LaptopCOL(String name,int id, String colour, int weight)
	{
		this.name=name;
		this.id=id;
		this.colour=colour;
		this.weight=weight;
	}
	LaptopCOL(int weight,String name)
	{
		this.name=name;
		this.weight=weight;
	}
	LaptopCOL(String colour,int id)
	{
		this.colour=colour;
		this.id=id;
	}
	public void printDetails1()
	{
		System.out.println(name);
		System.out.println(colour);
		System.out.println(id);
		System.out.println(weight);
	}
	

}
