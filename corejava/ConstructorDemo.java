

package com.corejava;
import java.util.*;

class EmployeeData 
{
	int Age;
	int Salary;
	String Name;
	
	EmployeeData(int Age,int Salary, String Name)
	{
		this.Name = Name;
		this.Age = Age;
		this.Salary = Salary;
		
		

	}
	

	void Display()
	{
		System.out.println("Name is "+Name);
		System.out.println("Age is "+Age);
		System.out.println("Salary is "+Salary);
		
		
	}
}
public class ConstructorDemo  
{
	public static void main(String[] args) 
	
	{
		Scanner sc = new Scanner(System.in);
		
	
		System.out.println("Enter your choice y or n");
		char choice=sc.next().charAt(0);
		switch(choice)
		{
		case 'y':
		{
			System.out.println("Enter number of emoployees");
			int size = sc.nextInt();
			
			EmployeeData []obj = new EmployeeData[size];
			
			//To accept 
			for(int i = 0;i<obj.length ;i++)
			{
				System.out.print("Enter name  : "+" ");
				String name = sc.next();
				
				System.out.print("Enter age : "+" ");
				int age = sc.nextInt();
				
				System.out.print("Enter salary : " + " ");
				int sal = sc.nextInt();
				
				obj[i] = new EmployeeData(age,sal,name);
				
			}
			
			//To Display
			
			for( int i = 0;i<obj.length;i++)
			{
				obj[i].Display();
			}
		}
		break;
		
		case 'n':
			System.out.println("Exit");
			break;
		}
	}
}
		
		   
		
		
		
		

