package com.abstractt;


abstract class Bank
{
	
	
	Bank()
	{
		System.out.println("Default constructor in base class");
	}
	
	Bank(int a)
	{
		System.out.println("Parameterizer construtor in base ");
	}
	abstract double ROI();
	
}

class SBI1 extends Bank
{
	SBI1(int a)
	{
		super();
		
	}
	
	double ROI()
	{
		return 9.5;
		
	}
}



public class AbstractParaConstrucor 
{

	public static void main(String[] args)
	{
	
		
		
		Bank b = new SBI1(10);
		SBI1 s = new SBI1(10);
		
		System.out.println("ROI OF sbin bank is "+ b.ROI());
		System.out.println("ROI OF sbin bank is "+ s.ROI());
		
	}

}

