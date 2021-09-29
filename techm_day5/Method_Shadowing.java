package com.techm_day5;


class Parent
{
	static void test()
	{
		System.out.println("this is parent");
	}
}
class Child
{
	static void test()
	{
		System.out.println("this is child");
	}
}
public class Method_Shadowing 
{
	public static void main(String[] args) 
	{
		Parent p=new Parent();
		p.test();
		Child c=new Child();
		c.test();
//		Parent d=new Child();
//		p.test();
		
	}

}
