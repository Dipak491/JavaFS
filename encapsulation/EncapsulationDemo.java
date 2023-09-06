package com.encapsulation;

class Enclass
{
	private int salary;
	
	public void setSalary(int sal)
	{
		if(sal > 0)
		{
			salary = sal;
		}
		else
		{
			salary = 0;
		}
	}
	public int getSalary()
	{
		return salary;
	}
}

public class EncapsulationDemo {

	public static void main(String[] args) 
	{
		Enclass obj = new Enclass();
		obj.setSalary(500000);
		System.out.println("salary is  "+obj.getSalary());

	}

}
