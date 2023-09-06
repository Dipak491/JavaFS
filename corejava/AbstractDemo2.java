package com.corejava;

abstract class shape
{
	abstract void draw();
	
}

class circle extends shape
{
	void draw()
	{
		System.out.println("Draw Circle ");
	}
	
}

class trangle extends shape
{
	void draw()
	{
		System.out.println("Draw traingle ");
	}
	
}
public class AbstractDemo2 
{

	public static void main(String[] args) 
	{
		circle cobj = new circle();
		cobj.draw();
		
		trangle tobj = new trangle();
		tobj.draw();
		
	}

}
