package com.array;
import java.util.*;

public class CompareArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[3][3];
		int brr[][] = new int[3][3];

		System.out.println("Enter the elements of array");
		for(int i =0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr[i][j] = sc.nextInt();
				//brr[i][j] = sc.nextInt();
			}
		}
		
		
		
		System.out.println("Enter the elements of secound array");
		for(int i =0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				//arr[i][j] = sc.nextInt();
				brr[i][j] = sc.nextInt();
			}
		}
		
		
		System.out.println(Arrays.deepToString(arr));
		System.out.println(Arrays.deepToString(brr));
		
		int count = 0;
		
		for(int i =0; i<3;i++)
		{
			for(int j =0; j<3; i++)
			{
				if(arr[i][j] == brr[i][j])
				{
					count++;
				}
			}
		}
		
		if(count==1)
		{
			System.out.println("Array is same ");
		}
		else
		{
			System.out.println("Array is NOT same ");
		}
		
		
			
		
	}

}
