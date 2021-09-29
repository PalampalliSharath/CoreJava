package com.Techm.prgms;

import java.util.Scanner;

public class EmployeeMain 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		Employee e1=new Employee("sharath",31,4.0,"java");
		Employee e2=new Employee("bharath",40,12.0," sr.java");
		
		System.out.println(e1.name);
		System.out.println(e2.sal);
	}

}
