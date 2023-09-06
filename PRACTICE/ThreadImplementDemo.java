package com.PRACTICE;

class ImpliDemo implements Runnable
{
	public void run()//here only run()
	{
		int a =5;
		int b = 23;
		int c = a+b;
		System.out.println("Addition is "+c);
	}
}


public class ThreadImplementDemo {

	public static void main(String[] args) 
	{
		ImpliDemo obj = new ImpliDemo();
		Thread t1 = new Thread(obj);
		t1.start();
	}

}
