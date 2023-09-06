package com.array;

import java.util.Arrays;

public class DesendArray {


			public static void main(String[] args) 
			{
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
			 System.out.println(Arrays.toString(Arr));

			}

}
