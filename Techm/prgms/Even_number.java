package com.Techm.prgms;

import java.util.Scanner;

public class Even_number
{
	public static void main(String[] args)
		{
			Scanner scanner = new Scanner(System.in);
			System.out.println("enter the number");
			int n = scanner.nextInt();
			
			int sum=0;
			int lastnum=0;
			while(n>0)
			{
				lastnum = n%10;
				n=n/10;	
				if(lastnum%2==0)
				{
					System.out.println(lastnum);
				}
				//n=n/10;	
			}

		}

	}