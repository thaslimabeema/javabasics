// BASIC LAMBDA EXPRESSION

package com.deloitte;
//functional interface
interface Inter1
{
	  int sum(int i,int j);
	//void show();
}

public class TestInnerClass {

	public static void main(String args[])
	{
//		Inter1 i1=new Inter1()
//		{
//			public void show()
//			{
//				System.out.println("hello");
//			}
			
//		};
		Inter1 i1=(i,j)-> {//System.out.println("hello");//this can be used instead of
		                                           //anonymous insert class
		                   //System.out.println(i1.show(5,6));
							System.out.println("adding");
							return(i+j);
	                      };
	                      System.out.println(i1.sum(4, 5));
	
}
}