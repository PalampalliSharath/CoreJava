package com.Techm.prgms;

public class Employee 
{
	String name;
	int id;
	double sal;
	String dept;
	
	Employee(String name,int id,double sal,String dept)
	{
		this.name=name;
		this.id=id;
		this.sal=sal;
		this.dept=dept;
	}
	public void printDetails()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(sal);
		System.out.println(dept);
	}
	
}
