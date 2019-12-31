
//  OVERLOADING

package com.deloitte;
import java.util.Scanner;

public class Poly {
	static int add(int a,int b)
	{
		return a+b;
	}
	static float add(float a,float b)
	{
		return a+b;
	}
	
	static int add(int a,int b,int c)
	{
		return a+b+c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter 2 values");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		System.out.println(add(n1,n2));
		System.out.println("enter 2 values");
		float n3=sc.nextFloat();
		float n4=sc.nextFloat();
	
		
		System.out.println(add(n3,n4));
		System.out.println("enter 3 values");
		int n5=sc.nextInt();
		int n6=sc.nextInt();
		int n7=sc.nextInt();
		System.out.println(add(n5,n6,n7));
		
		
		
		

	}

}
