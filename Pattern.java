package com.deloitte;
import java.util.Scanner;
public class Pattern 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int i,j,n;
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter no of lines");
		n=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			
			for(j=1;j<=i;j++)
			{
				if((i+j)%2==0)
				 System.out.print(1+" ");
				else
				 System.out.print(0+" ");
			}
		 System.out.println();

		}
	}
}
