package com.corejava;


class Demo10
{
	Demo10()
	{
		this("ram",34);
		System.out.println("Your in Base class default constructor");
		
	}
	
	Demo10(String s,int n)
	{
		System.out.println("Your in Base class Parameterized constrcutor ");
	}
}

class Prototype extends Demo10
{
	Prototype()
	{
		this("shyam",76);
		System.out.println("Your in Derived  class default constructor");
	}
	
	Prototype(String s, int n)
	{
		super();
		System.out.println("Your in Derived class parameterized constructor");
	}
}

public class ChainingConstructor
{

	public static void main(String[] args)
	{
		//Prototype obj = new Prototype();
		new Prototype();

	}

}
