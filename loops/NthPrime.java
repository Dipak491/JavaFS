package com.loops;

import java.util.Scanner;

public class NthPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");  
		int n = sc.nextInt();
		
//		int num = 1;
//		int cnt = 0;
//		int i = 2;
//
//		while(cnt<n)
//		{
//			num = num+1;
//			
//			for(i = 2; i<=num; i++)
//			{
//				if(num%i == 0)
//				{
//					break;
//				}
//			}
//			if(i == num)
//			{
//				cnt = cnt+1;
//			}
//		}
//		
//		if(cnt ==n)
//		{
//			System.out.println(num);
//		}
//		
//		
		
		
		
		int count = 0;
		int num = 1;
		int i = 0;
		while(count<n)  
		{
			num = num+1;  //2
			
			for(i = 2; i<=num; i++)   //2<2
			{
				if(num%i == 0)  //2 %2 == 0
				{
					break;
				}
			}
			if(i == num) //2==2
			{
				count = count +1;  //2
			}
			
		}
		if(count == n)
		{
			System.out.println(num);
		}
		
		
		
		
		
		
		
		
		
		
		
	}
		
		
		
		
		
}
