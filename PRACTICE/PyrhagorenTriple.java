package com.PRACTICE;

public class PyrhagorenTriple {

	public static void main(String[] args) 
	{
		int z=0;
		int a = 0,b=0,c=0,sum=0;
		
		for(int i = 0;i<500; i++)
		{
			for(int j = 0; j<500; j++)
			{
				for(int k=0;k<500;k++)
				{
					if((i+j+k==1000)&&((i*i)+(j*j)==k*k))
						{
							a= i;
							b= j;
							c=k;
							sum = a*b*c;
						}
				}
			
			}
			
		}
		
		System.out.println("i ->"+a+"\nj ->"+b+"\nk -> "+c+ "\nSum is->  "+sum);
		
		
	}
		

	}


