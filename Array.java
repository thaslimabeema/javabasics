package com.deloitte;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Array {

	public static void main(String[] args) {
	/*	Scanner sc=new Scanner(System.in);
		int []nums= {10,2,1,8,6};
		int max=nums[0];
		//
	
		for(int i:nums)
		{
			if(i>max)
			{
				max=i;
			}
		}
			
		 System.out.println(max);
		 */
		
		int []arr= {6,3,10,5,9};
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("after sorting");
		for(int i : arr)
		{
			System.out.println(i+"\t");
		}
		
		
	}

}