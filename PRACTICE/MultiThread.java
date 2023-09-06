package com.PRACTICE;

class ABCd extends Thread
{
	
	public void run()
	{
			
	
		for(int i =0; i<=5; i++)
		{
//			try
//			{
//			Thread.sleep(5000);
//			
//			}catch(InterruptedException e)
//			{
//				System.out.println(e);
//			}
			
			System.out.println(i);
		}
		System.out.println("Current thread name "+Thread.currentThread().getName());
	
		}
		
	}
	


public class MultiThread {

	public static void main(String[] args) 
	{
		ABCd a =  new ABCd();
		ABCd a2 = new ABCd();
		ABCd a3 = new ABCd();
		
		
		
	a.start();
	try
	{
		a.join();
	}catch(Exception e) {System.out.println(e);}
	
	
	a2.start();
	a3.start();
		
	}
		
	}


