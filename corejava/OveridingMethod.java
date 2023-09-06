package com.corejava;


class A
{
	void DisplayA()
	{
		System.out.println("This is Base A class");
	}
}

class B extends A
{
	void DisplayB()
	{
		System.out.println("This is B derived class ");
	}
}

class C extends B
{
	void DisplayB()
	{
		System.out.println("THis is C derived class extends from B");
	}
}

class D extends B
{
	void DisplayD()
	{
		System.out.println("This is D derived clas from B");
	}
}






public class OveridingMethod {

	public static void main(String[] args) 
	{
		C obj = new C();
		D obj1 = new D();
		
		B obj3 = new B();
		
		obj.DisplayA();
		obj.DisplayB();
		
		obj3.DisplayB();
		
		obj1.DisplayA();
		obj1.DisplayB();
		obj1.DisplayD();
	
	}

}
