package com.array;
import java.util.*;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5];
		System.out.println("Enter the elements of array");
		
		for(int i = 0; i<arr.length;i++)
		{
			arr[i]= sc.nextInt();
		}
		
	
		
		int num = 0;
		System.out.println("Enter the numner that you want to find");
		num = sc.nextInt();
		
		int count = 0;
		int temp = 0;
		
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]==num)
			{
				count++;
				temp = i;
			}
		}
		if(count == 1)
		{
			System.out.println("Number is present "+num);
			System.out.println("Index value is "+temp);
		}
		
		else
		{
			System.out.println("Number is not present in the array ");
		}

	}

}
