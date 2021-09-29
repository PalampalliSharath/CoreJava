package com.Techm.prgms;

public class Student_GandS 
{
	private String sname;
	private int sid;
	private String branch;
	private int phonenum;
	
	Student_GandS(String sname,int sid, String branch, int phonenum)
	{
		this.sname=sname;
		this.sid=sid;
		this.branch=branch;
		this.phonenum=phonenum;
	}
	Student_GandS(int sid,String branch)
	{
		this.sname=sname;
		this.branch=branch;
	}
	
	public String getsname()
	{
		return sname;
	}
	public void setsname(String sname)
	{
		this.sname=sname;
	}
	
	public int getsid()
	{
		return sid;
	}
	public void setsid(int sid)
	{
		this.sid=sid;
	}
	public String getBranch() 
	{
		return branch;
	}
	public void setBranch(String branch) 
	{
		this.branch = branch;
	}
	
	public int getPhonenum() 
	{
		return phonenum;
	}
	public void setPhonenum(int phonenum) 
	{
		this.phonenum = phonenum;
	}
	
	
}
