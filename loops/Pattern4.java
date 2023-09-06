package com.loops;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 6;
		int i =0;
		int j =0;
		
//		for(i = 1;i<row;i++)
//		{
//			for(j=row;j>=i;j--)
//			{
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		for( i =row; i>=1; i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}

	}

}

