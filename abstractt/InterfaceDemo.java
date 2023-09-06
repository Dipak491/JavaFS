package com.abstractt;

interface Demo
{
	public void test();
}


class Derived4 implements Demo
{
	public void test()
	{
		System.out.println("Derived class ");
	}
}

public class InterfaceDemo{

	public static void main(String[] args) 
	{
		Demo d = new Derived4();
		d.test();

	}

}
