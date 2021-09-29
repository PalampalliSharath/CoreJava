package com.Techm.prgms;

import java.util.Scanner;

public class Perfect_number 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = scanner.nextInt();
		int sum = 1;
		for(int i = 2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				sum = sum+i;
			}
		}
		if(sum==n)
		{
			System.out.println(n+"is a Perfect Number");
		}
		else
			System.out.println(n+"is not a Perfect Number");

	}

}
