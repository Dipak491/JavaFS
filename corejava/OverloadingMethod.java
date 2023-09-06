package com.corejava;


class Base
{
	void get(int a,String s)
	{
		System.out.println("Single parameter " + a+" "+ s);
	}
	
	void get(String c,int a)
	{
		System.out.println("Two parameter" +a+ " "+ c);
	}
}


public class OverloadingMethod 
{
	
	public static void main(String[] args)
	{
		Base obj  = new Base();
		obj.get(10,"abhay");
		obj.get("Raju", 23);
		
	}

}
