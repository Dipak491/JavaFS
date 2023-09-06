package com.PRACTICE;

class Abc extends Thread
{
	public void run() // it can be start()
	{
		System.out.println("Display");
	}
}

public class ThreadDemo 
{

	public static void main(String[] args) 
	{
		Abc obj = new Abc();
		obj.start();
		
	}

}
