package com.deloitte;

import java.util.Scanner;

public class ControlStructures {
	public static void main(String args[])
	{
		double inr,usd;
		int ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter option : 1-> INR->USD");
		System.out.println("               2-> USD->INR");

		ch=sc.nextInt();
		switch(ch)
		{
		case 1: System.out.println("Enter the amount in rupee");
				inr=sc.nextDouble();
				System.out.println("USD="+(inr*71));
				break;
		case 2: System.out.println("Enter the amount in dollars");
				usd=sc.nextDouble();
		 		System.out.println("INR="+((usd)/71));
		 		break;
				
		default: System.out.println("wrong choice");
			
		}        
	}

}
