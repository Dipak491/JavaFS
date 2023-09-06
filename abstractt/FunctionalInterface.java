package com.abstractt;

interface Demo45
{
	void get();
}

class Abc implements Demo45
{
	public void get()
	{
		System.out.println("This is Functional Interface ");
	}
}

public class FunctionalInterface 
{

	public static void main(String[] args) 
	{
		Abc obj = new Abc();
		obj.get();

	}

}
