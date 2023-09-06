package com.string;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		StringBuffer obj = new StringBuffer("Hello "); //obj = hello;

		System.out.println("The capacity of string is "+obj.capacity()); //default capacity is 16
		obj.append("JAva");
		
		System.out.println(obj.insert(4, "INSERT"));
		
		System.out.println(obj.replace(1, 3, "REPLACE"));       //replace (beginindex,endindex,value)
		
		System.out.println(obj.delete(0, 4));  
		
		System.out.println("The reverse of string is "+obj.reverse());
		
	
		
		obj.ensureCapacity(16);  //ensure capacity is minimum to default if it increse by (oldcapacity*2)+2
								//(16*2)+2 = 34
		
		System.out.println(obj.capacity());
		
			
		
		
		
		
		
		
		
	}

}
