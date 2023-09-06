package com.corejava;
import java.util.*;

public class Circle 
{
	void Circumference(int r)
	{
		double Ans =  0;
		Ans= 2*3.14*r;
		System.out.println("Circumference of circle is "+Ans);
	}
	
	void Area(int r)
	{
		double Ans =0;
		Ans = 3.14*r*r;
		System.out.println("Area of circle is "+Ans);
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int radius =0;
		System.out.println("Enter the radius of circle");
		radius = sc.nextInt();
		
		Circle cobj = new Circle();
		cobj.Circumference(radius);
		cobj.Area(radius);
		
		
		
		
		System.out.println("Enter the radius of circle");
		int rad = sc.nextInt();
		
		//Circle cobj = new Circle();
		cobj.Circumference(rad);
		cobj.Area(rad);
	}

}
