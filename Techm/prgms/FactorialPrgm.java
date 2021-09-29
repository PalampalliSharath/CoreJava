package com.Techm.prgms;

import java.util.Scanner;

public class FactorialPrgm 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int fact=1;
		int i=1;
		System.out.println("enter a number :");
		int num=scanner.nextInt();
		
		while(i<=num)
		{
			fact=fact*i;
			i++;
		}
		System.out.println("factorial of "+num+ "is" +fact);
		
	}

}
