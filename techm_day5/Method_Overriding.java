package com.techm_day5;


class laila
{
	public void demo()// this is over ridden
	{
		System.out.println("this is laila");
	}
}
class sheela extends laila
{
	@Override
	public void demo()// this is override
	{
		System.out.println("this is sheela");
	}
}
public class Method_Overriding 
{
	public static void main(String[] args) 
	{
		laila l=new laila();
		l.demo();
		sheela s=new sheela();
		s.demo();
		laila s1=new sheela();// after new keyword which method is there it will print otput
		s1.demo();

		
	}

}
