package com.techm_day5;


abstract class Shape
{
	abstract void demo();
	public void print()
	{
		System.out.println("shape");
	}
}
class Rectangle extends Shape
{
	@Override
	void demo()
	{
		System.out.println("rectangle");
	}
}
public class Abstraction 
{
	public static void main(String[] args) 
	{
		Rectangle reg=new Rectangle();
		reg.demo();
		reg.print();
	}

}

