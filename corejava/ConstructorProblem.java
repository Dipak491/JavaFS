package com.corejava;



class Testt
{
	Testt()
	{
		
		System.out.println("Base clas default constructor "); 
	}
	
	Testt(int c)
	{
		this();
		System.out.println("base class single parameter constructor ");
	}
}

class Result extends Testt
{
	Result(int n)
	{
		super(5);
		System.out.println("Result class parameter ");
	}
}



public class ConstructorProblem {

	public static void main(String[] args)
	{
		Result R = new Result(5);
		
	}

}
