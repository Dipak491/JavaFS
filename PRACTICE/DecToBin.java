package com.PRACTICE;

public class DecToBin {
	static void BinToD(int DecNum)
	{
		int mynum =DecNum;
		int pow=0;
		int BinNum =0;
		
		while(DecNum>0)
		{
			int rem = DecNum%2;
			BinNum = BinNum+(rem+(int)Math.pow(10, pow));
			pow++;
			DecNum = DecNum/2;
			
		}
		System.out.println("Binary number of"+mynum+"is "+BinNum);
	}

	public static void main(String[] args)
	{
		BinToD(5);

	}

}
