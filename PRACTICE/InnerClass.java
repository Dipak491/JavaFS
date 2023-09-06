package com.PRACTICE;


class Outercls1
{

	int a=5;
	int b =6;
	
	void addition()
	{
		int add = a+b;
		System.out.println("Addition is " +add);
	}
	
	class innercls1
	{
		void mult()
		{
			int mul = a*b;
			System.out.println("Multiplicatioin is "+mul);
			
		}
	}
}



public class InnerClass 
{

	public static void main(String[] args)
	{
		Outercls1 obj = new Outercls1();
		Outercls1.innercls1 iobj = obj.new innercls1();
		
		obj.addition();
		iobj.mult();
		
	}

}
