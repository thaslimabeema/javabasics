package com.deloitte;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a,b;
		
		try {
			a=Integer.parseInt(br.readLine());
			b=Integer.parseInt(br.readLine());
			
			double x=a/b;
			System.out.println("result="+x);
	        }
		catch(ArithmeticException ex)
		{
			System.out.println("value shouldnt be zero");
		
		}
		catch(IOException ex)
		{
			System.out.println("IO SXCEPTION");
		}
		catch(NumberFormatException ex)
		{
			System.out.println("Number format exception");
		
			
		}
		System.out.println("execution done");

}
}
