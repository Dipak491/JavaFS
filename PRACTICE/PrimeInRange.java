package com.PRACTICE;

public class PrimeInRange 
{
	public static boolean isPrime(int n )
	{
		boolean isPri =true;
		for(int i=2;i<n-1;i++)
		{
			if(n%i==0)
			{
				isPri = false; 
			}
		}
		return isPri;
	}
	public static void PrimesRange(int n)
	{
		for(int i=2;i<=n;i++)
		{
			if(isPrime(i))
			{
				System.out.println(i);
			}
		}
		
	}

	public static void main(String[] args)
	{
		PrimesRange(20);
		
	}

}
