package com.array;

import java.util.Arrays;

public class SeoundLargestElement {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
			int Arr[] = {10,4,2,8,5};
			
			
			for(int i=0;i<Arr.length;i++)
			{
				for(int j =i+1;j<Arr.length;j++)
				{
					
					if(Arr[i] < Arr[j])
					{
						int temp = Arr[i];
						Arr[i]=Arr[j];
						Arr[j] = temp;
						
					}
				}
			
			}
			
			if(Arr[0] > Arr[1])
			{
				System.out.println(Arr[1]);
			}
			
		 System.out.println(Arrays.toString(Arr));

		}

	}

