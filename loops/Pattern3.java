package com.loops;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row = 5;
		int i = 1;
		int j =0;
		
		for(i = 1; i<row ; i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
