package com.PRACTICE;

//prime a number which is divisible by only 1 and  itself 
public class Prime 
{
	//1st approach 
//	static boolean PrimeN(int n)
//	{
//		//corner cases 
//		if(n==2)
//		{
//			return true;
//		}
//		
//		boolean isPrime = true;
//		for(int i =2; i<n-1;i++)
//		{
//			if(n%2==0)
//			{
//				isPrime = false;
//				break;
//			}
//		}
//		return isPrime;
//	}
//	
	
	//optimize approrach 
	public static boolean isPrimeN(int n)
	{
		for (int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i ==0)
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args)
	{
		
		System.out.println(isPrimeN(5));
	}

}
