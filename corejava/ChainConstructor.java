package com.corejava;


public class ChainConstructor
{
	ChainConstructor()
	{
		this(5);
		System.out.println("Default constructor");
	}
	
	ChainConstructor(int x)
	{
		this(5,15);
		System.out.println("The value of x"+x);
	}
	
	ChainConstructor(int x, int y)
	{
		System.out.println("Multiplication is "+(x*y));
	}

	public static void main(String[] args) 
	{
		new ChainConstructor();
		

	}

}
