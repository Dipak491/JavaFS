package com.corejava;

public class ConstructorArray 
{
	ConstructorArray(int a)
	{
		System.out.println("Defalut"+ a);
	}

	ConstructorArray(char b)
	{
		System.out.println("Defalut"+ b);
	}

	ConstructorArray(double a)
	{
		System.out.println("Defalut"+ a);
	}
	
	void  getName(int c)
	{
		System.out.println("Function"+ c);
	}

	public static void main(String[] args) 
	{
		ConstructorArray [] obj = new ConstructorArray[5];
		obj[0] = new ConstructorArray(10);
		obj[1] = new ConstructorArray('d');
		obj[2] = new ConstructorArray(3.4);
		obj[3] = new ConstructorArray(40);
		obj[4] = new ConstructorArray(45);
		
		obj[1].getName(4);
		
		
		
		

	}

}
