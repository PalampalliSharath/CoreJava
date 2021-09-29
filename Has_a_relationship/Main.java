package com.Has_a_relationship;

public class Main
{
	public static void main(String[] args) 
	{
		Phone p = new Phone();
		p.addSim(new Sim());
		
		System.out.println(new Sim().sim_num);
		System.out.println(new Sim().sim_name);
		
	}

}
