package com.techm_day5;


class A
{
	int a=10;
}
class B extends A
{
	int b=11;
}
public class Varable_Shadowing 
{
	public static void main(String[] args)
	{
		A a=new A();
		System.out.println(a.a);
		B b=new B();
		System.out.println(b.b);
		A a1=new B();
		System.out.println(a1.a);
		B b1=(B) new A();// class cast expression
		System.out.println(b1.a);
		A a2=(A)new B(); // class cast expression
		System.out.println(a2.a);
		
	}

}
