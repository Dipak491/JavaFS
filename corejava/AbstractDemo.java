package com.corejava;

abstract class Demo20
{
	abstract void Display();
	
	void NormalMethod()
	{
		System.out.println("Concreate method in abstract class");
	}
}

class Derived20 extends Demo20
{

	@Override
	void Display() 
	{
		System.out.println("This is abstract method definationn ");
		
	}
	
}

public class AbstractDemo {

	public static void main(String[] args)
	{
		Derived20 dobj = new  Derived20();
		dobj.Display();
		dobj.NormalMethod();
		
		
		
		
	}

}
