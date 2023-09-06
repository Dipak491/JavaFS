package com.abstractt;

//interface 
interface Media
{
	 public void play();
}

class CD implements Media
{
	public void play()
	{
		System.out.println("CD ");
	}
	
}

class DVD implements Media
{
	public void play()
	{
		System.out.println("Dvd ");
	}
}



public class InterfaceDemo2 
{

	public static void main(String[] args)
	{
	
		CD obj= new CD();
		obj.play();
		
		DVD dobj = new DVD();
		dobj.play();
		
		
	
	}

}

