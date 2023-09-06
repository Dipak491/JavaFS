package com.loops;
import java.util.*;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int number  = sc.nextInt();
		
		int temp = number;
		int i =0;
		int rem = 0;
		int result = 0;
		int sum = 0;
		
		 
		while(i<temp)    //370
		{
			rem = temp%10;   //0   
			temp = temp/10;  //37 
	
			
			result = result+(rem*rem*rem); //
			
			i++;
	
		}
		//System.out.println(result);
		
		if(number ==result)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not Armstrong");
		}

	}

}

