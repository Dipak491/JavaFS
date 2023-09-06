package com.array;

import java.util.Arrays;

public class ReadArray {
	
	public static int[] readArr()
	{	
		int Arr1[] = {2,3,4,5,6};
		return Arr1;
		
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		int[]arr = readArr();
		
		
		//to display 
		for(int brr:arr)
		{
			System.out.println(brr);
		}
		
		
		
		//System.out.println(Arrays.toString(arr));
	}

}
