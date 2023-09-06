package com.abstractt;

abstract class Vehicle
{
	abstract void engine();
	
	Vehicle()
	{
		System.out.println("Consructor in base asbtract  class ");
	}
}

class car extends Vehicle
{

	void engine()
	{
		System.out.println("Petrol Engine");
	}
}

public class AbstractConstructor {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
//		Vehicle  v = new car();

		
		car c = new car();
		c.engine();
	}

}
