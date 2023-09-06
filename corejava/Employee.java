package com.corejava;
import java.util.*;

class EmployeeData 
{
	int Age;
	int Salary;
	String Name;
	
	EmployeeData(int a,int s, String n)
	{
		Age = a;
		Salary =s;
		Name = n;

	}
	

	void Display()
	{
		System.out.println("Age is "+Age);
		System.out.println("Salary is "+Salary);
		System.out.println("Name is "+Name);
		
	}
}
public class Employee 
{
	public static void main(String[] args) 
	
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of emoployees");
		int size = sc.nextInt();
		
		EmployeeData []obj = new EmployeeData[size];
		
		//To accept 
		for(int i = 0;i<3;i++)
		{
			System.out.println("Enter name : ");
			String name = sc.next();
			
			System.out.println("Enter age : ");
			int age = sc.nextInt();
			
			System.out.println("Enter salary : ");
			int sal = sc.nextInt();
			
			obj[i] = new EmployeeData(age,sal,name);
			
		}
		
		//To Display
		
		for( int i = 0;i<3;i++)
		{
			obj[i].Display();
		}
		
	}
}

