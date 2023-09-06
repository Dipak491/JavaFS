package com.string;

public class StringNotes {
	
	public static void main(String str[])
	{
		String s = "Helo";
		String  s1  = new String("Raji");
		String s2 = new String("Hello");
		
		System.out.println("Hashcode for s1--> "+s1.hashCode());
		System.out.println("Hashcode for s2--> "+s2.hashCode());
		
		System.out.println("IsEmpty " + s.isEmpty());
		
		System.out.println(s1.isBlank());
		
		
	}
	
	

}
