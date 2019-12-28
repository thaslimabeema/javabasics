package com.deloitte;

import java.util.ArrayList;
import java.util.Arrays;

public class Assign
{

	public static void main(String[] args)
	{
	// TODO Auto-generated method stub
	String []email= {"a@gmail.com","Abdul@yahoo.com","Rohit@hotmail.com","Prathik@hotmail.com","Jaya@gmail.com","ria@yahoo.com","paul@hotmail"};
	ArrayList<String> gmail=new ArrayList<String>();
	ArrayList<String> yahoo=new ArrayList<String>();
	ArrayList<String> hotmail=new ArrayList<String>();
	for(String  x : email)
	{
		if(x.contains("@gmail.com"))
		{ 
			gmail.add(x);
			
	    } 
		else if(x.contains("@yahoo.com"))
		{
			yahoo.add(x);
			
		}
		else if(x.contains("@hotmail.com"))
		{
			hotmail.add(x);
			
		} 		
	}
	
	
	System.out.println("   GMAIL");
	for(int i=0;i<gmail.size();i++)
	System.out.println(gmail.get(i));
	System.out.println();
	
	
	System.out.println("   YAHOO");
	for(int i=0;i<yahoo.size();i++)
	System.out.println(yahoo.get(i));
	System.out.println();
	
	
	System.out.println("   HOTMAIL");
	for(int i=0;i<hotmail.size();i++)
	System.out.println(hotmail.get(i));
	
	
	
	
	
	
	
	}

}
