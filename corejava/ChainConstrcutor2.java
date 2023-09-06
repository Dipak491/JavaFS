package com.corejava;

import java.util.Scanner;

public class ChainConstrcutor2
{
	ChainConstrcutor2()
	{
		System.out.println("Default constructor");
	}
	
	ChainConstrcutor2(int x)
	{
		this();
		System.out.println("The value of x"+x);
	}
	
	ChainConstrcutor2(int x, int y)
	{
		this(5);
		System.out.println("Multiplication is "+(x*y));
	}

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
				System.out.println("enter value");
				int a=s.nextInt();
				int b=s.nextInt();
		//ChainConstrcutor2 obj = new ChainConstrcutor2();
		new ChainConstrcutor2(a,b);
		
		

	}

}
