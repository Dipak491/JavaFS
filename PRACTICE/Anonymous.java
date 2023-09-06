package com.PRACTICE;

interface first
{
	abstract void add();
}


public class Anonymous {

	public static void main(String[] args) 
	{
		first obj = new first()
				{
					public void add()
					{
						int a =10;
						int b = 29;
						int c  = a+b;
						System.out.println("Addition is "+c);
					}
					
				};
				obj.add();

	}

}
