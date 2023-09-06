package com.array;

import java.util.Arrays;

public class CompareArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,7};
		int brr[] = {1,2,3};
		
		if(Arrays.equals(arr, brr))
		{
			System.out.println("Arrays are equal");
		}
		else 
		{
			System.out.println("Arrays are not equal");
		}

	}

}
