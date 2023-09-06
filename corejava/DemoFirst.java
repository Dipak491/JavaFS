package com.corejava;

public class DemoFirst {

	public static void main(String[] args) {
		
		int i = 121;
		int n = i;
		int res =0;
		int sum =0;
		
		for(int j = 1; j<=n;)
		{
			res = n%10;
			
			sum = (sum*10)+res;
			
			n = n/10;
			
//			System.out.println("reminder is "+res);
//			System.out.println("New number is "+sum);
//			
//			System.out.println(n);
//			
		}	
		
//		System.out.println("value of i"+n);
		//System.out.println(sum);
		
		
		String s = (i == sum) ? "pallindrome" : "Not pallindrome";
		
		System.out.println(s);
		
		
	}
}


