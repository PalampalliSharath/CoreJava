package com.Techm.prgms;

import java.util.Scanner;

public class Studentmain 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		String sname=scanner.next();
		int sid=scanner.nextInt();
		String branch=scanner.next();
		int phonenum=scanner.nextInt();
		
		Student_GandS s1=new Student_GandS(sname,sid,branch,phonenum);
		Student_GandS s2=new Student_GandS(sid,branch);
		System.out.println("---");
		System.out.println(s1.getsname());
		System.out.println("-----");
		System.out.println(s1.getsid());
		System.out.println("---");
		System.out.println(s2.getBranch());
		System.out.println("---");
		System.out.println(s2.getPhonenum());
		//System.out.print(s1.setPhonenum(12345));
		
	}

}
