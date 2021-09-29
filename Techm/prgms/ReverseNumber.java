package com.Techm.prgms;

public class ReverseNumber 
{
	public static void main(String[] args)
	{
		int reverse = 0, rem;
		for(int num=123789;num!=0;num=num/10)
		{
			rem=num%10;
			reverse=reverse*10+rem;
		}
		System.out.println("reversed number is :"+reverse);
		
	}

}
