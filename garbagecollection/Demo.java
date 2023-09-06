package com.garbagecollection;

public class Demo {

	public static void main(String[] args)
	{
		Runtime t = Runtime.getRuntime();
		System.out.println("tot mem --> "+t.totalMemory());
		System.out.println("Free memory --> "+t.freeMemory());
		
		for(int i = 0; i<1000; i++)
		{
			new Demo();
			
		}
		System.out.println("After creating 1000 object --> "+t.freeMemory());
		System.gc();
		System.out.println("After gc --> "+t.freeMemory());
	}

}
