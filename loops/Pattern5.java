package com.loops;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i =1;
		int j =1;
		int row = 5;
		
		for(i = 1; i<row; i++)
		{
			for(j=i; j<=row; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(i = 1; i<=row; i++)
		{
			for(j=i; j>=1; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}