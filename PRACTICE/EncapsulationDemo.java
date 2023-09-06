package com.PRACTICE;

import java.io.IOException;
import java.util.Scanner;

class Emp1
{
	private int eID;
	private String name;
	private String city;
	
	public int geteID() 
	{
		return eID;
	}
	
	public void seteID(int eId) 
	{
		this.eID = eId;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public String getCity()
	{
		return city;
	}
	public void setCity(String city) 
	{
		this.city = city;
	}
	
	
	void Display()
	{
		System.out.println("Name is"+this.name);
		System.out.println("Id  is"+this.eID);
		System.out.println("City  is"+this.city);
	}
	
}


public class EncapsulationDemo {

	public static void main(String[] args) throws IOException
	{
					
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many employee data you want to insert ");
		int size =0;
		size = sc.nextInt();
		
	
	
		Emp1[] e = new Emp1[size];
		int i=0;
		int eId;
		String empName;
		String empCity;
		
		for(i=0; i <= size;i++)
		{	
			System.out.println("Enter your id ");
			eId  = sc.nextInt();
			
			System.out.println("Enter your name ");
			empName = sc.next();
			
			System.out.println("Enter your city ");
			empCity = sc.next();
			
			e[i].seteID(eId);
			e[i].setCity(empCity);
			e[i].setName(empName);
		}
		
		for(int j =0;i<=size; i++)
		{
			e[j].Display();
			
		}
			
	}

}
