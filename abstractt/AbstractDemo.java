package com.abstractt;

abstract class RBI
{
	abstract double ROI();
	
	RBI()
	{
		
	}
	
	void Display()  //concrete method 
	{
		System.out.println("IT is base class concreate method");
	}
	
	static void Disp()
	{
		System.out.println("Static method in base class");
	}
}

class SBI extends RBI
{
	double ROI()
	{
		return 9.5;
		
	}
}

class HDFC extends RBI
{
	double ROI()
	{
		return 10.50;
	}
}


public class AbstractDemo 
{

	public static void main(String[] args)
	{
		HDFC h = new HDFC();
		System.out.println("ROI OF HDFC bank is "+ h.ROI());
		
		SBI s = new SBI();
		System.out.println("ROI OF HDFC bank is "+ s.ROI());
		
		s.Display();
		s.Disp();

	}

}
