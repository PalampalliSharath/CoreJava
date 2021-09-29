package com.Techm.prgms;

public class SumOfDigits 
{
	public static void main(String[] args) 
	{
		int num = 123,sum;
		for(sum=0;num!=0;num=num/10)
		{
			sum=sum+num%10;
		}
		System.out.println(sum);
	}

}
