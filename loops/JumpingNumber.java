package com.loops;
import java.util.*;
import java.math.*;

public class JumpingNumber {
	
	static void Jump(int x)
	{
		int i =0;
		for(i =0; i<x; i++)
		{
			if(i<10)
			{
				System.out.print(i+" ");
				continue;
			}
		
		int check = 1;
		int temp = i;
		int rem = temp%10;
		temp = temp/10;
		
		while(temp !=0)
		{
			if(Math.abs(rem - temp%10) != 1)
			{
				check = 0;
				break;
			}
			rem = temp%10;
			temp = temp/10;
		}
		if(check !=0)
		{
			System.out.print(i+ " ");
		}
	}
		
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		int num = sc.nextInt();
		
		Jump(num);

	}

}
