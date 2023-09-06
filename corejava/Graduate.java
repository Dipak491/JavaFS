package com.corejava;
import java.util.*;


class University
{
	
	void Display()
	{
		System.out.println("Enter id");
		int id = sc.nextInt();
		
		
		System.out.println("Enter name ");
		String s = sc.next();
		
		System.out.println("Enter Address");
		String Add = sc.next();
		
		System.out.println("Your is is "+id+" "+ "Your name is"+ s +" "+"Your address is "+Add);
			
	}
	
	
}

class Teacher extends University
{

	void Pay()
	{
		System.out.println("Enter  department ")
		String dept = sc.next();
		
		System.out.println("Enter Your salary ");
		int sal = sc.nextInt();
		
		System.out.println("Your Department is "+dept+" "+"Your salary is  "+sal);
	}
}

class Students extends University
{
	void Program(int quality, int credit )
	{
		
		int TotalCredit = 0;
		System.out.println("welcome student portal ");
		
		int GPA = (quality / credit);
		System.out.println("Your GPA score is "+GPA);
		
	}
	
}



public class Graduate extends Students
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your chice "+" \"Student\" "+ "\"Teacher\" ");
		
		String  choice = sc.next() ;
		switch(choice)
		{
		case "Student":
			
			System.out.println("welcome Students");
			University sob = new University();

			
			System.out.println("Enter your Quality ponts or marks");
			int mark = sc.nextInt();
			
			System.out.println("Enter credit attempts points");
			int credit  = sc.nextInt();
			
			Graduate sobj = new Graduate();
			sobj.Program(mark, credit);
			
			sobj.Display();
		
			
			break;
			
			
		case "Teacher":
			System.out.println("Welcome to Teacher Portal");
			System.out.println("Please enter yout Department");
			String dept = sc.next();
			
			System.out.println("Enter your Salary ");
			int sal = sc.nextInt();
			
			
			Teacher tobj = new Teacher();
			tobj.Display();
			tobj.Pay();
			
			break;
						
		}
	}

}
